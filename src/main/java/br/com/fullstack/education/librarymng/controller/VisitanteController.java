package br.com.fullstack.education.librarymng.controller;

import br.com.fullstack.education.librarymng.controller.dto.VisitanteDto;
import br.com.fullstack.education.librarymng.entity.VisitanteEntity;
import br.com.fullstack.education.librarymng.service.VisitanteServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/visitantes")
public class VisitanteController {
    private final VisitanteServiceImpl visitanteService;

    @PostMapping
    public ResponseEntity<VisitanteEntity> createVisitante(@RequestBody VisitanteDto visitante) throws Exception {
        VisitanteEntity newVisitante = visitanteService.createVisitante(visitante);
        return ResponseEntity.status(HttpStatus.CREATED).body(newVisitante);
    }
}
