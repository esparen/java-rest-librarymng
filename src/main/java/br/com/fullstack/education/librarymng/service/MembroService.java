package br.com.fullstack.education.librarymng.service;

import br.com.fullstack.education.librarymng.controller.dto.MembroDto;
import br.com.fullstack.education.librarymng.entity.MembroEntity;

import java.util.List;

public interface MembroService {
    MembroEntity createMembro(MembroDto membro) throws Exception;

    List<MembroEntity> getAllMembros();

    void deleteById(Long id);

    MembroEntity updateById(MembroEntity membro);
}
