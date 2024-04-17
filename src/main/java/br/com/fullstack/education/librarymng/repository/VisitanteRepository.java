package br.com.fullstack.education.librarymng.repository;

import br.com.fullstack.education.librarymng.entity.VisitanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface VisitanteRepository extends JpaRepository<VisitanteEntity, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE VisitanteEntity t " +
            "SET t.nome = :nome,  t.telefone = :telefone " +
            "WHERE t.id = :id ")
    int updateVisitanteEntitiy(@Param("id") Long id,
                            @Param("nome") String nome,
                            @Param("telefone") String telefone
    );
}
