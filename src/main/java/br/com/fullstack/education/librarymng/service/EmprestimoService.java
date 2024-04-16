package br.com.fullstack.education.librarymng.service;

import br.com.fullstack.education.librarymng.entity.EmprestimoEntity;

public interface EmprestimoService {
    EmprestimoEntity createEmprestimo(EmprestimoEntity emprestimoEntity) throws Exception;
}
