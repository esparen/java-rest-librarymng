package br.com.fullstack.education.librarymng.service;

import br.com.fullstack.education.librarymng.entity.EmprestimoEntity;

import java.util.List;

public interface EmprestimoService {
    EmprestimoEntity createEmprestimo(EmprestimoEntity emprestimoEntity) throws Exception;

    List<EmprestimoEntity> getAllEmprestimos();

    void deleteById(Long id);
}
