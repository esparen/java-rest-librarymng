package br.com.fullstack.education.librarymng.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "emprestimo")
public class EmprestimoEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate dataEmprestimo;

    private LocalDate dataDevolucao;

    @ManyToOne
    @JoinColumn(name = "id_livro")
    private LivroEntity livro;

    @ManyToOne
    @JoinColumn(name = "id_membro")
    private MembroEntity membro;
}
