package br.com.fullstack.education.librarymng.controller;

import br.com.fullstack.education.librarymng.controller.dto.LivroDto;
import br.com.fullstack.education.librarymng.entity.LivroEntity;
import br.com.fullstack.education.librarymng.service.LivroServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/livros")
public class LivroController {

    private LivroServiceImpl livroService;

    @Autowired
    public LivroController(LivroServiceImpl livroService) {
        this.livroService = livroService;
    }

    @PostMapping
    public ResponseEntity<LivroEntity> createLivro(@RequestBody LivroDto livro) throws Exception {
        //calls LivroService to create new livro
        LivroEntity newLivro = livroService.createLivro(livro);
        return ResponseEntity.status(HttpStatus.CREATED).body(newLivro);
    }

    @GetMapping
    public ResponseEntity<List<LivroEntity>> getAllLivros(){
        return ResponseEntity.status(HttpStatus.OK).body(livroService.getAllLivros());
    }

}
