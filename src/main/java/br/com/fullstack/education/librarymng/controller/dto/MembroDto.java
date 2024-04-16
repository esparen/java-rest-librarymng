package br.com.fullstack.education.librarymng.controller.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class MembroDto implements Serializable {
    private String nome;
    private String endereco;
    private String telefone;
}

