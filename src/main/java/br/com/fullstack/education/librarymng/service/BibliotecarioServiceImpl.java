package br.com.fullstack.education.librarymng.service;

import br.com.fullstack.education.librarymng.controller.dto.BibliotecarioDto;
import br.com.fullstack.education.librarymng.entity.BibliotecarioEntity;
import br.com.fullstack.education.librarymng.exception.NotFoundException;
import br.com.fullstack.education.librarymng.repository.BibliotecarioRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BibliotecarioServiceImpl implements BibliotecarioService {

    private final BibliotecarioRepository bibliotecarioRepository;

    public BibliotecarioServiceImpl(BibliotecarioRepository bibliotecarioRepository) {
        this.bibliotecarioRepository = bibliotecarioRepository;
    }

    @Override
    public BibliotecarioEntity createBibliotecario (BibliotecarioDto bibliotecario) throws Exception {
        log.info("Criando Bibliotecario -> \n{}\n", bibliotecario);
        BibliotecarioEntity newBibliotecario = new BibliotecarioEntity();
        newBibliotecario.setEmail(bibliotecario.getEmail());
        newBibliotecario.setNome(bibliotecario.getNome());
        newBibliotecario.setSenha(bibliotecario.getSenha());
        bibliotecarioRepository.save(newBibliotecario);
        log.info("Criando Bibliotecario -> Salvo com sucesso");
        return newBibliotecario;
    }

    @Override
    public List<BibliotecarioEntity> getAllBibliotecarios() {
        log.info("Listando todos os bibliotecarios");
        return bibliotecarioRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        bibliotecarioRepository.delete(
                bibliotecarioRepository.findById(id).orElseThrow(
                        ()-> new NotFoundException("Bibliotecario com id ["+ id +"] não encontrado.")
                )
        );
    }

    @Override
    public BibliotecarioEntity updateById(BibliotecarioEntity bibliotecario) {
        int updateResponse =  bibliotecarioRepository.updateBibliotecarioEntity(
                bibliotecario.getId(),
                bibliotecario.getNome(),
                bibliotecario.getEmail(),
                bibliotecario.getSenha()
        );
        log.info("Bibliotecario atualizado com sucesso. Response: {}", updateResponse);
        return bibliotecario;
    }
}
