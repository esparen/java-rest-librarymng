package br.com.fullstack.education.librarymng.service;

import br.com.fullstack.education.librarymng.controller.dto.BibliotecarioDto;
import br.com.fullstack.education.librarymng.controller.dto.LivroDto;
import br.com.fullstack.education.librarymng.entity.BibliotecarioEntity;
import br.com.fullstack.education.librarymng.entity.LivroEntity;

import java.util.List;

public interface BibliotecarioService {
    BibliotecarioEntity createBibliotecario(BibliotecarioDto livro) throws Exception;

    List<BibliotecarioEntity> getAllBibliotecarios();

    void deleteById(Long id);
}
