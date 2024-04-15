package br.com.fullstack.education.librarymng.repository;

import br.com.fullstack.education.librarymng.entity.BibliotecarioEntity;
import br.com.fullstack.education.librarymng.entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {
}
