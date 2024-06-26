package br.com.fullstack.education.librarymng.service;

import br.com.fullstack.education.librarymng.controller.dto.LivroDto;
import br.com.fullstack.education.librarymng.entity.LivroEntity;

import java.util.List;

public interface LivroService {
    LivroEntity createLivro(LivroDto livro) throws Exception;

    List<LivroEntity> getAllLivros();

    void deleteById(Long id);

    LivroEntity updateById(LivroEntity livro);
}
