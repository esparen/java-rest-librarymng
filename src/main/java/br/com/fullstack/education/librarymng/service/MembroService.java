package br.com.fullstack.education.librarymng.service;

import br.com.fullstack.education.librarymng.controller.dto.MembroDto;
import br.com.fullstack.education.librarymng.entity.MembroEntity;

public interface MembroService {
    MembroEntity createMembro(MembroDto membro) throws Exception;
}
