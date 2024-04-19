package br.com.fullstack.education.librarymng.controller.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class LivroDto implements Serializable {
    public String titulo;
    public String autor;
    public int anoPublicacao;
}
