package br.com.fullstack.education.librarymng.service;

import br.com.fullstack.education.librarymng.controller.dto.BibliotecarioDto;
import br.com.fullstack.education.librarymng.controller.dto.LivroDto;
import br.com.fullstack.education.librarymng.entity.BibliotecarioEntity;
import br.com.fullstack.education.librarymng.entity.LivroEntity;
import br.com.fullstack.education.librarymng.repository.BibliotecarioRepository;
import br.com.fullstack.education.librarymng.repository.LivroRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BibliotecarioServiceImpl implements BibliotecarioService {

    private final BibliotecarioRepository bibliotecarioRepository;

    public BibliotecarioServiceImpl(BibliotecarioRepository bibliotecarioRepository) {
        this.bibliotecarioRepository = bibliotecarioRepository;
    }

    @Override
    public BibliotecarioEntity createBibliotecario (BibliotecarioDto bibliotecario) throws Exception {
        log.info("Criando livro -> \n{}\n", bibliotecario);
        BibliotecarioEntity newBibliotecario = new BibliotecarioEntity();
        newBibliotecario.setEmail(bibliotecario.getEmail());
        newBibliotecario.setNome(bibliotecario.getNome());
        newBibliotecario.setSenha(bibliotecario.getSenha());
        bibliotecarioRepository.save(newBibliotecario);
        log.info("Criando Bibliotecario -> Salvo com sucesso");
        return newBibliotecario;
    }
}
