package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Jogador;

import java.util.List;
import javax.persistence.EntityManager;

public class JogadorDao extends GenericDao<Jogador, Long> {

  @Override
  public void salvar(Jogador j) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.persist(j);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public void editar(Jogador j) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.merge(j);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public void deletar(Long id) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.remove(em.find(Jogador.class, id));
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public List<Jogador> listar() {
    EntityManager em = emf.createEntityManager();

    return em.createQuery("SELECT J FROM Jogador J", Jogador.class).getResultList();
  }
}
