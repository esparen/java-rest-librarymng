package br.com.fullstack.education.librarymng.service;

import br.com.fullstack.education.librarymng.controller.dto.LivroDto;
import br.com.fullstack.education.librarymng.entity.LivroEntity;

public interface LivroService {
    LivroEntity createLivro(LivroDto livro) throws Exception;
}
