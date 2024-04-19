package br.com.fullstack.education.librarymng.repository;

import br.com.fullstack.education.librarymng.entity.EmprestimoEntity;
import br.com.fullstack.education.librarymng.entity.LivroEntity;
import br.com.fullstack.education.librarymng.entity.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

public interface EmprestimoRepository extends JpaRepository<EmprestimoEntity, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE EmprestimoEntity e " +
            "SET e.livro = :livro,  e.membro = :membro,  e.dataDevolucao = :dataDevolucao,  e.dataEmprestimo = :dataEmprestimo " +
            "WHERE e.id = :id")
    int updateEmprestimoEntity(@Param("id") Long id,
              @Param("livro") LivroEntity livro,
              @Param("membro") MembroEntity membro,
              @Param("dataEmprestimo") LocalDate dataEmprestimo,
              @Param("dataDevolucao") LocalDate dataDevolucao);

}
