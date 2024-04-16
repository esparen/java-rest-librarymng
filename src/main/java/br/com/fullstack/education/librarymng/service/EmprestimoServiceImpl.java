package br.com.fullstack.education.librarymng.service;

import br.com.fullstack.education.librarymng.entity.EmprestimoEntity;
import br.com.fullstack.education.librarymng.exception.NotFoundException;
import br.com.fullstack.education.librarymng.repository.EmprestimoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EmprestimoServiceImpl implements EmprestimoService {
    private final EmprestimoRepository emprestimoRepository;

    public EmprestimoServiceImpl(EmprestimoRepository emprestimoRepository) {
        this.emprestimoRepository = emprestimoRepository;
    }

    public EmprestimoEntity createEmprestimo(EmprestimoEntity emprestimo) throws Exception {
        log.info("Criando emprestimo -> \n{}\n", emprestimo);
        emprestimoRepository.save(emprestimo);
        log.info("Criando Emprestimo -> Salvo com sucesso");
        return emprestimo;
    }

    @Override
    public List<EmprestimoEntity> getAllEmprestimos() {
        log.info("Listando todos os emprestimos");
        return emprestimoRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        emprestimoRepository.delete(
                emprestimoRepository.findById(id).orElseThrow(
                        ()-> new NotFoundException("Emprestimo com id ["+ id +"] não encontrado.")
                )
        );
    }
}
