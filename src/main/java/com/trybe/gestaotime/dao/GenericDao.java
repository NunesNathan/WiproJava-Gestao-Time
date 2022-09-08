package com.trybe.gestaotime.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe abstrata GenericDao.
 **/

public abstract class GenericDao<T, I extends Serializable> {
  EntityManagerFactory emf =
          Persistence.createEntityManagerFactory("com.trybe.acc.java.hibernate.datacenter");

  abstract void salvar(T s);

  abstract void editar(T s);

  abstract void deletar(I id);

  abstract List<T> listar();
}
