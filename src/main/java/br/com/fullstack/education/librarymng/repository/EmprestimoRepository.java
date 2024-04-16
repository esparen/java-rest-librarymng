package br.com.fullstack.education.librarymng.repository;

import br.com.fullstack.education.librarymng.entity.EmprestimoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepository extends JpaRepository<EmprestimoEntity, Long> {
}
