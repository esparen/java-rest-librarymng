package br.com.fullstack.education.librarymng.repository;

import br.com.fullstack.education.librarymng.entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE LivroEntity t " +
            "SET t.titulo = :titulo,  t.autor = :autor, t.anoPublicacao = :ano_publicacao " +
            "WHERE t.id = :id ")
    int updateLivroEntitiy(@Param("id") Long id,
                            @Param("titulo") String titulo,
                            @Param("autor") String autor,
                            @Param("ano_publicacao") int ano_publicacao
                            );
}
