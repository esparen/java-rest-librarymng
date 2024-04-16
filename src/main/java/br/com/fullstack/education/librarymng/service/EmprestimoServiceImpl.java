package br.com.fullstack.education.librarymng.service;

import br.com.fullstack.education.librarymng.entity.EmprestimoEntity;
import br.com.fullstack.education.librarymng.repository.EmprestimoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
}
