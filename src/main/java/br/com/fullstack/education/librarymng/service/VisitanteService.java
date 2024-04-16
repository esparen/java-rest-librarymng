package br.com.fullstack.education.librarymng.service;

import br.com.fullstack.education.librarymng.controller.dto.VisitanteDto;
import br.com.fullstack.education.librarymng.entity.VisitanteEntity;

import java.util.List;

public interface VisitanteService {
    VisitanteEntity createVisitante(VisitanteDto visitante) throws Exception;

    List<VisitanteEntity> getAllVisitantes();
}
