package br.com.fullstack.education.librarymng.controller;

import br.com.fullstack.education.librarymng.controller.dto.MembroDto;
import br.com.fullstack.education.librarymng.entity.LivroEntity;
import br.com.fullstack.education.librarymng.entity.MembroEntity;
import br.com.fullstack.education.librarymng.service.MembroServiceImpl;
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
@RequestMapping("/membros")
public class MembroController {
    private MembroServiceImpl membroService;

    @Autowired
    public MembroController(MembroServiceImpl membroService) {
        this.membroService = membroService;
    }

    @PostMapping
    public ResponseEntity<MembroEntity> createMembro(@RequestBody MembroDto membroRequest) throws Exception {
        MembroEntity membroEntity = membroService.createMembro(membroRequest);
        return ResponseEntity.ok().body(membroEntity);
    }

    @GetMapping
    public ResponseEntity<List<MembroEntity>> getAllMembros(){
        return ResponseEntity.status(HttpStatus.OK).body(membroService.getAllMembros());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        membroService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<MembroEntity> updateMembroById(@RequestBody MembroEntity membro){
        MembroEntity updatedMembro = membroService.updateById(membro);
        return ResponseEntity.status(HttpStatus.OK).body(updatedMembro);
    }
}
