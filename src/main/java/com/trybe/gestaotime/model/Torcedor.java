package com.trybe.gestaotime.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 * Classe Torcedor.
 **/

@Entity
public class Torcedor {

  /**
   * Atributos.
   **/
  @ManyToMany(mappedBy = "times")
  private List<Time> times;

  /**
   * Métodos.
   **/

}
