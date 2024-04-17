package br.com.fullstack.education.librarymng.repository;


import br.com.fullstack.education.librarymng.entity.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface MembroRepository extends JpaRepository<MembroEntity, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE MembroEntity t " +
            "SET t.nome = :nome,  t.endereco = :endereco, t.telefone = :telefone " +
            "WHERE t.id = :id ")
    int updateMembroEntitiy(@Param("id") Long id,
                           @Param("nome") String nome,
                           @Param("endereco") String endereco,
                           @Param("telefone") String telefone
    );
}
