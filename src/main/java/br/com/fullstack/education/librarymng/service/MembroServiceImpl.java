package br.com.fullstack.education.librarymng.service;

import br.com.fullstack.education.librarymng.controller.dto.MembroDto;
import br.com.fullstack.education.librarymng.entity.MembroEntity;
import br.com.fullstack.education.librarymng.repository.MembroRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MembroServiceImpl implements MembroService{

    private final MembroRepository membroRepository;

    public MembroServiceImpl(MembroRepository membroRepository) {
        this.membroRepository = membroRepository;
    }

    @Override
    public MembroEntity createMembro(MembroDto membro) throws Exception {
        log.info("Criando membro");
        MembroEntity newMembro = new MembroEntity();
        newMembro.setEndereco(membro.getEndereco());
        newMembro.setNome(membro.getNome());
        newMembro.setTelefone(membro.getTelefone());
        membroRepository.save(newMembro);
        log.info("Criando Membro -> Sucesso");
        return newMembro;
    }
}
