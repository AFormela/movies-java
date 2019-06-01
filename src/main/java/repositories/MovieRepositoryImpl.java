package repositories;

import models.Movie;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class MovieRepositoryImpl implements MovieRepository {

    @PersistenceContext(unitName = "db")
    private EntityManager em;

    @Override
    public void create(Movie movie) {
        em.persist(movie);
    }

    @Override
    public void update(Movie movie) {
        em.merge(movie);
    }

    @Override
    public void delete(Movie movie) {
        em.remove(em.merge(movie));
    }

    @Override
    public Movie findById(Long id) {
        return em.find(Movie.class, id);
    }

    @Override
    public List<Movie> findAll() {
        Query query = em.createQuery("SELECT e FROM Movie e");
        return query.getResultList();
    }


}
