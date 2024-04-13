package br.com.fullstack.education.librarymng.repository;

import br.com.fullstack.education.librarymng.entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroEntity, Long> {
}
