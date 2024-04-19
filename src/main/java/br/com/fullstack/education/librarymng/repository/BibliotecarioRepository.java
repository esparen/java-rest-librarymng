package br.com.fullstack.education.librarymng.repository;

import br.com.fullstack.education.librarymng.entity.BibliotecarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {
    @Modifying
    @Transactional
    @Query("UPDATE BibliotecarioEntity b " +
            "SET b.nome = :nome, b.email = :email, b.senha = :senha " +
            "WHERE b.id = :id")
    int updateBibliotecarioEntity(@Param("id") Long id,
                                   @Param("nome") String nome,
                                   @Param("email") String email,
                                   @Param("senha") String senha);

}
