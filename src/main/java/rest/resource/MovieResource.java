package rest.resource;

import models.Actor;
import models.Movie;
import models.Comment;
import models.Rating;
import services.ActorService;
import services.MovieService;
import services.RatingService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Path("/movies")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MovieResource {

    @Inject
    private MovieService movieService;
    @Inject
    private RatingService ratingService;
    @Inject
    private ActorService actorService;

    @POST
    public Response addMovie(Movie movie) {
        movieService.create(movie);
        return Response.ok().build();
    }

    @PUT
    @Path("/{id}")
    public Response updateMovie(@PathParam("id") Long id, Movie movie) {
        Movie result = movieService.findById(id);
        if (result == null) {
            return Response.status(404).build();
        } else {
            result.setTitle(movie.getTitle());
            result.setYear(movie.getYear());
            movieService.update(result);
            return Response.ok().build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deleteMovie(@PathParam("id") Long id) {
        Movie movie = movieService.findById(id);
        if (movie == null) {
            return Response.status(404).build();
        } else {
            Set<Actor> actors = new HashSet<>(movie.getActors());
            for (Actor actor : actors) {
                actor.removeMovie(movie);
                actorService.update(actor);
            }
            movieService.delete(movie);
            return Response.ok().build();
        }
    }

    @GET
    public Response findAllMovies() {
        return Response.ok(movieService.findAll()).build();
    }

    @GET
    @Path("/{id}")
    public Response findMovieById(@PathParam("id") Long id) {
        Movie result = movieService.findById(id);
        if (result == null) {
            return Response.status(404).build();
        } else {
            return Response.ok(result).build();
        }
    }

    @GET
    @Path("/{id}/comments")
    public Response findCommentsByMovieId(@PathParam("id") Long id) {
        List<Comment> result = movieService.findById(id).getComments();
        if (result == null) {
            return Response.status(404).build();
        } else {
            return Response.ok(result).build();
        }
    }

    @POST
    @Path("/{id}/comments")
    public Response addComment(@PathParam("id") Long id, Comment comment) {
        Movie movie = movieService.findById(id);
        if (movie == null) {
            return Response.status(404).build();
        } else {
            movie.addComment(comment);
            movieService.update(movie);
            return Response.ok().build();
        }
    }

    @DELETE
    @Path("/{id1}/comments/{id2}")
    public Response deleteComment(@PathParam("id1") Long movieId, @PathParam("id2") Long commentId) {
        Movie movie = movieService.findById(movieId);
        if (movie == null) {
            return Response.status(404).build();
        } else {
            Comment comment = movieService.findCommentByMovieId(movie.getComments(), commentId);
            if (comment == null) {
                return Response.status(404).build();
            }
            movie.removeComment(comment);
            movieService.update(movie);
            return Response.ok().build();
        }
    }

    @POST
    @Path("/{id}/ratings")
    public Response rateMovie(@PathParam("id") Long id, Rating rating) {
        Movie movie = movieService.findById(id);
        if (movie == null) {
            return Response.status(404).build();
        } else {
            movie.addRating(rating);
            movieService.update(movie);
            return Response.ok().build();
        }
    }

    @GET
    @Path("/{id}/ratings")
    public Response getRating(@PathParam("id") Long id) {
        Movie movie = movieService.findById(id);
        if (movie == null) {
            return Response.status(404).build();
        } else {
            double rating = ratingService.calculateRating(movie.getRatings());
            return Response.ok(rating).build();
        }
    }

    @GET
    @Path("/{id}/actors")
    public Response getActors(@PathParam("id") Long id) {
        Movie movie = movieService.findById(id);
        if (movie == null) {
            return Response.status(404).build();
        } else {
            return Response.ok(movie.getActors()).build();
        }
    }
}