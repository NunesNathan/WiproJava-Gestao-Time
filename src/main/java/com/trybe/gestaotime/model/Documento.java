package com.trybe.gestaotime.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Classe Documento.
 */

@Entity
@Table(name = "Documento")
public class Documento {
  /**
   * Atributos.
   */
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "numeroCarteiraTrabalho")
  private String numeroCarteiraTrabalho;

  @Column(name = "cpf")
  private String cpf;

  @Column(name = "numeroCbf")
  private String numeroCbf;

  @OneToOne(mappedBy = "documento")
  private Jogador jogador;

  /**
   * Métodos.
   */
  public Long getId() {
    return id;
  }

  public String getNumeroCarteiraTrabalho() {
    return numeroCarteiraTrabalho;
  }

  public void setNumeroCarteiraTrabalho(String numeroCarteiraTrabalho) {
    this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNumeroCbf() {
    return numeroCbf;
  }

  public void setNumeroCbf(String numeroCbf) {
    this.numeroCbf = numeroCbf;
  }

}
