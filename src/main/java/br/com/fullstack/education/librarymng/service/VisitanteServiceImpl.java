package br.com.fullstack.education.librarymng.service;

import br.com.fullstack.education.librarymng.controller.dto.VisitanteDto;
import br.com.fullstack.education.librarymng.entity.VisitanteEntity;
import br.com.fullstack.education.librarymng.exception.NotFoundException;
import br.com.fullstack.education.librarymng.repository.VisitanteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class VisitanteServiceImpl implements VisitanteService{

    private final VisitanteRepository visitanteRepository;

    public VisitanteServiceImpl(VisitanteRepository visitanteRepository) {
        this.visitanteRepository = visitanteRepository;
    }

    public VisitanteEntity createVisitante(VisitanteDto visitante) throws Exception {
        log.info("Criando visitante -> \n{}\n", visitante);
        VisitanteEntity newVisitante = new VisitanteEntity();
        newVisitante.setNome(visitante.getNome());
        newVisitante.setTelefone(visitante.getTelefone());
        visitanteRepository.save(newVisitante);
        log.info("Criando Visitante -> Sucesso");
        return newVisitante;
    }

    @Override
    public List<VisitanteEntity> getAllVisitantes() {
        log.info("Listando todos os Visitantes");
        return visitanteRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        visitanteRepository.delete(
                visitanteRepository.findById(id).orElseThrow(
                        ()-> new NotFoundException("Visitante com id ["+ id +"] não encontrado.")
                )
        );
    }

    @Override
    public int updateById(VisitanteEntity visitante) {
        log.info("Atualizando visitante -> \n{}\n", visitante);
        int updateResponse = visitanteRepository.updateVisitanteEntitiy(
                visitante.getId(),
                visitante.getNome(),
                visitante.getTelefone()
        );

        return updateResponse;
    }
}
