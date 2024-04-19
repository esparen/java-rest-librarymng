package br.com.fullstack.education.librarymng.controller.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Data
public class EmprestimoDto implements Serializable {
    private final Long id_livro;
    private final Long id_membro;
    private final LocalDate dataEmprestimo;
    private final LocalDate dataDevolucao;

    public EmprestimoDto(Long id_livro, Long id_membro, LocalDate data_emprestimo, LocalDate dataDevolucao) {
        this.id_livro = id_livro;
        this.id_membro = id_membro;
        this.dataEmprestimo = Objects.requireNonNullElseGet(data_emprestimo, LocalDate::now);
        this.dataDevolucao = dataDevolucao;
    }
}
