package repositories;

import models.Movie;

import java.util.List;

public interface MovieRepository {
    void create(Movie movie);
    void update(Movie movie);
    void delete(Movie movie);
    Movie findById(Long id);
    List<Movie> findAll();
}
