package com.bolao.copa.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nome")
    private String nome;

    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "email")
    private String email;

    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "senha")
    private String senha;

    @NotNull
    @Column(name = "pago")
    private boolean pago;

//    @OneToMany(mappedBy = "usuario")
//    private List<Pontuacao> pontuacaoList;
//
//    @OneToMany(mappedBy = "usuario")
//    private List<Palpites> palpitesList;

    @ManyToOne
    @JoinColumn(name = "role", referencedColumnName = "id")
    private Role role;
}
