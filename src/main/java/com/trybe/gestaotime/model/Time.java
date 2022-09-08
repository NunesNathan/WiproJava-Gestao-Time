package com.trybe.gestaotime.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Classe Time.
 **/

@Entity
public class Time {
  /**
   * Atributos.
   **/
  @OneToMany(mappedBy = "time", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
  private List<Jogador> jogadores;
  /**
   * Métodos.
   **/

}
