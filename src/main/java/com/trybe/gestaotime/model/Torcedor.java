package com.trybe.gestaotime.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Classe Torcedor.
 **/

@Entity
public class Torcedor {

  /**
   * Atributos.
   **/
  @Id
  @Column(name = "id", nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "nome", nullable = false)
  private String nome;

  @ManyToMany(mappedBy = "times")
  private List<Time> times;

  /**
   * Métodos.
   **/
  public Long getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Time> getTimes() {
    return times;
  }

  public void setTimes(List<Time> times) {
    this.times = times;
  }
}
