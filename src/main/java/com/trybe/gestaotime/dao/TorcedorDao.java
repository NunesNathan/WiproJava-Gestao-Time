package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Torcedor;

import java.util.List;
import javax.persistence.EntityManager;

public class TorcedorDao extends GenericDao<Torcedor, Long> {

  @Override
  public void salvar(Torcedor to) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.persist(to);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public void editar(Torcedor to) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.merge(to);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public void deletar(Long id) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.remove(em.find(Torcedor.class, id));
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public List<Torcedor> listar() {
    EntityManager em = emf.createEntityManager();

    return em.createQuery("SELECT T FROM Torcedor T", Torcedor.class).getResultList();
  }
}
