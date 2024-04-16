package br.com.fullstack.education.librarymng.controller;

import br.com.fullstack.education.librarymng.controller.dto.EmprestimoDto;
import br.com.fullstack.education.librarymng.entity.EmprestimoEntity;
import br.com.fullstack.education.librarymng.entity.LivroEntity;
import br.com.fullstack.education.librarymng.entity.MembroEntity;
import br.com.fullstack.education.librarymng.repository.LivroRepository;
import br.com.fullstack.education.librarymng.repository.MembroRepository;
import br.com.fullstack.education.librarymng.service.EmprestimoServiceImpl;
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
@RequestMapping("/emprestimos")
public class EmprestimoController {
    private final EmprestimoServiceImpl emprestimoService;
    private final MembroRepository membroRepository;
    private final LivroRepository livroRepository;

    @PostMapping
    public ResponseEntity createEmprestimo(@RequestBody EmprestimoDto emprestimoRequest) throws Exception {
        LivroEntity targetLivro = livroRepository.findById(emprestimoRequest.getId_livro()).orElse(null);
        if (targetLivro == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Livro com id [" + emprestimoRequest.getId_livro() + "] não encontrado");
        }

        MembroEntity targetMembro = membroRepository.findById(emprestimoRequest.getId_membro()).orElse(null);
        if (targetMembro == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Membro com id [" + emprestimoRequest.getId_membro() + "] não encontrado");
        }

        EmprestimoEntity newEmprestimo = new EmprestimoEntity();
        newEmprestimo.setMembro(targetMembro);
        newEmprestimo.setLivro(targetLivro);
        newEmprestimo.setDataEmprestimo(emprestimoRequest.getDataEmprestimo());
        newEmprestimo.setDataDevolucao(emprestimoRequest.getDataDevolucao());
        emprestimoService.createEmprestimo(newEmprestimo);
        return ResponseEntity.status(HttpStatus.CREATED).body(newEmprestimo);
    }

    @GetMapping
    public ResponseEntity<List<EmprestimoEntity>> getAllEmprestimos(){
        return ResponseEntity.status(HttpStatus.OK).body(emprestimoService.getAllEmprestimos());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        emprestimoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
