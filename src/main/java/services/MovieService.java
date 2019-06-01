package services;

import models.Comment;
import models.Movie;

import java.util.List;

public interface MovieService {
    void create(Movie movie);
    void update(Movie movie);
    void delete(Movie movie);
    Movie findById(Long id);
    List<Movie> findAll();
    Comment findCommentByMovieId(List<Comment> comments, Long id);
}
