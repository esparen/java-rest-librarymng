package br.com.fullstack.education.librarymng.service;

import br.com.fullstack.education.librarymng.controller.dto.LivroDto;
import br.com.fullstack.education.librarymng.entity.LivroEntity;
import br.com.fullstack.education.librarymng.repository.LivroRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class LivroServiceImpl implements LivroService {

    private final LivroRepository livroRepository;

    public LivroServiceImpl(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    @Override
    public LivroEntity createLivro(LivroDto livro) throws Exception {
        log.info("Criando livro -> \n{}\n", livro);
        LivroEntity newLivroEntity = new LivroEntity();
        newLivroEntity.setAnoPublicacao(livro.getAnoPublicacao());
        newLivroEntity.setAutor(livro.getAutor());
        newLivroEntity.setTitulo(livro.getTitulo());
        livroRepository.save(newLivroEntity);
        log.info("Criando livro -> Salvo com sucesso");
        return newLivroEntity;
    }

    @Override
    public List<LivroEntity> getAllLivros() {
        log.info("Listando todos os Livros");
        return livroRepository.findAll();
    }
}
