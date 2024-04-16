package br.com.fullstack.education.librarymng.service;

import br.com.fullstack.education.librarymng.controller.dto.BibliotecarioDto;
import br.com.fullstack.education.librarymng.controller.dto.VisitanteDto;
import br.com.fullstack.education.librarymng.entity.BibliotecarioEntity;
import br.com.fullstack.education.librarymng.entity.VisitanteEntity;

public interface VisitanteService {
    VisitanteEntity createVisitante(VisitanteDto visitante) throws Exception;
}
