package services;

import models.Comment;
import models.Movie;
import repositories.MovieRepository;

import javax.inject.Inject;
import java.util.List;

public class MovieServiceImpl implements MovieService {

    @Inject
    private MovieRepository movieRepository;

    @Override
    public void create(Movie movie) {
        movieRepository.create(movie);
    }

    @Override
    public void update(Movie movie) {
        movieRepository.update(movie);
    }

    @Override
    public void delete(Movie movie) {
        movieRepository.delete(movie);
    }

    @Override
    public Movie findById(Long id) {
        return movieRepository.findById(id);
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Comment findCommentByMovieId(List<Comment> comments, Long id) {
        for (Comment comment : comments) {
            if (comment.getId() == id) {
                return comment;
            }
        }
        return null;
    }
}
