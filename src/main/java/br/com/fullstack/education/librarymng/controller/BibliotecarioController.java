package br.com.fullstack.education.librarymng.controller;

import br.com.fullstack.education.librarymng.controller.dto.BibliotecarioDto;
import br.com.fullstack.education.librarymng.entity.BibliotecarioEntity;
import br.com.fullstack.education.librarymng.service.BibliotecarioServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/bibliotecarios")
public class BibliotecarioController {

    private final BibliotecarioServiceImpl bibliotecarioServiceImpl;

    @PostMapping
    public ResponseEntity<BibliotecarioEntity> createBibliotecario(@RequestBody BibliotecarioDto bibliotecario) throws Exception {
        BibliotecarioEntity newBibliotecario = bibliotecarioServiceImpl.createBibliotecario(bibliotecario);
        return ResponseEntity.status(HttpStatus.CREATED).body(newBibliotecario);

    }

    @GetMapping
    public ResponseEntity<List<BibliotecarioEntity>> getAllBibliotecarios(){
        return ResponseEntity.status(HttpStatus.OK).body(bibliotecarioServiceImpl.getAllBibliotecarios());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        bibliotecarioServiceImpl.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<BibliotecarioEntity> updateBibliotecario(@RequestBody BibliotecarioEntity bibliotecario) throws Exception {
        BibliotecarioEntity updatedBibliotecario = bibliotecarioServiceImpl.updateById(bibliotecario);
        return ResponseEntity.status(HttpStatus.OK).body(updatedBibliotecario);
    }
}
