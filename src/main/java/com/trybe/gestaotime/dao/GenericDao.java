package com.trybe.gestaotime.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe abstrata GenericDao.
 **/

public abstract class GenericDao<T, I extends Serializable> {
  protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("crudHibernatePU");

  public abstract void salvar(T t);


  public abstract void editar(T s);


  public abstract void deletar(Long id);

  public abstract List<T> listar();
}
