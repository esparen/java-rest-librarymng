package br.com.fullstack.education.librarymng.controller.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class BibliotecarioDto implements Serializable {
    public String nome;
    public String email;
    public String senha;
}
