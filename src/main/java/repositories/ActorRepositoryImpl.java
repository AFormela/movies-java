package repositories;

import models.Actor;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class ActorRepositoryImpl implements ActorRepository {

    @PersistenceContext(unitName = "db")
    private EntityManager em;

    @Override
    public void create(Actor actor) {
        em.persist(actor);
    }

    @Override
    public void update(Actor actor) {
        em.merge(actor);
    }

    @Override
    public void delete(Actor actor) {
        em.remove(em.merge(actor));
    }

    @Override
    public Actor findById(Long id) {
        return em.find(Actor.class, id);
    }

    @Override
    public List<Actor> findAll() {
        Query query = em.createQuery("SELECT e FROM Actor e");
        return query.getResultList();
    }
}
