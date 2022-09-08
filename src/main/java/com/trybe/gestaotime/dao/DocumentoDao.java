package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Documento;

import java.util.List;
import javax.persistence.EntityManager;

public class DocumentoDao extends GenericDao<Documento, Long> {
  @Override
  public void salvar(Documento d) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.persist(d);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public void editar(Documento d) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.merge(d);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public void deletar(Long id) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.remove(em.find(Documento.class, id));
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public List<Documento> listar() {
    EntityManager em = emf.createEntityManager();

    return em.createQuery("SELECT D FROM Documento D", Documento.class).getResultList();
  }
}
