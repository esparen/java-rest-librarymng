package br.com.fullstack.education.librarymng.service;

import br.com.fullstack.education.librarymng.controller.dto.MembroDto;
import br.com.fullstack.education.librarymng.entity.MembroEntity;
import br.com.fullstack.education.librarymng.exception.NotFoundException;
import br.com.fullstack.education.librarymng.repository.MembroRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MembroServiceImpl implements MembroService{

    private final MembroRepository membroRepository;

    public MembroServiceImpl(MembroRepository membroRepository) {
        this.membroRepository = membroRepository;
    }

    @Override
    public MembroEntity createMembro(MembroDto membro) throws Exception {
        log.info("Criando membro -> {}", membro.toString());
        MembroEntity newMembro = new MembroEntity();
        newMembro.setEndereco(membro.getEndereco());
        newMembro.setNome(membro.getNome());
        newMembro.setTelefone(membro.getTelefone());
        membroRepository.save(newMembro);
        log.info("Criando Membro -> Sucesso");
        return newMembro;
    }

    @Override
    public List<MembroEntity> getAllMembros() {
        log.info("Listando todos os Membros");
        return membroRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        membroRepository.delete(
                membroRepository.findById(id).orElseThrow(
                        ()-> new NotFoundException("Membro com id ["+ id +"] não encontrado.")
                )
        );
    }
    @Override
    public MembroEntity updateById(MembroEntity membro) {
        log.info("Atualizando membro -> \n{}\n", membro);
        int updateResponse = membroRepository.updateMembroEntitiy(
                membro.getId(),
                membro.getNome(),
                membro.getEndereco(),
                membro.getTelefone()
        );
        log.info("Atualizando membro -> Salvo com sucesso");
        return membro;
    }
}
