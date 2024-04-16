package br.com.fullstack.education.librarymng.repository;


import br.com.fullstack.education.librarymng.entity.MembroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembroRepository extends JpaRepository<MembroEntity, Long> {
}
