package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Time;

import java.util.List;
import javax.persistence.EntityManager;

public class TimeDao extends GenericDao<Time, Long> {

  @Override
  public void salvar(Time t) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.persist(t);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public void editar(Time t) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.merge(t);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public void deletar(Long id) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.remove(em.find(Time.class, id));
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public List<Time> listar() {
    EntityManager em = emf.createEntityManager();

    return em.createQuery("SELECT T FROM Time T", Time.class).getResultList();
  }
}
