package rest.resource;

import models.Actor;
import models.Movie;
import services.ActorService;
import services.MovieService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashSet;
import java.util.Set;

@Path("/actors")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ActorResource {

    @Inject
    private ActorService actorService;
    @Inject
    private MovieService movieService;

    @POST
    public Response addActor(Actor actor) {
        actorService.create(actor);
        return Response.ok().build();
    }

    @GET
    @Path("/{id}")
    public Response getActor(@PathParam("id") Long id) {
        Actor actor = actorService.findById(id);
        if (actor == null) {
            return Response.status(404).build();
        } else {
            return Response.ok(actor).build();
        }
    }

    @GET
    @Path("/{id}/movies")
    public Response getMovies(@PathParam("id") Long id) {
        Actor actor = actorService.findById(id);
        if (actor == null) {
            return Response.status(404).build();
        } else {
            return Response.ok(actor.getMovies()).build();
        }
    }

    @PATCH
    @Path("/{id1}/movies/{id2}")
    public Response addMovie(@PathParam("id1") Long actorId, @PathParam("id2") Long movieId) {
        Actor actor = actorService.findById(actorId);
        Movie movie = movieService.findById(movieId);
        if (movie == null || actor == null) {
            return Response.status(404).build();
        } else {
            actor.addMovie(movie);
            actorService.update(actor);
            return Response.ok().build();
        }
    }

    @GET
    public Response getActors() {
        return Response.ok(actorService.findAll()).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteActor(@PathParam("id") Long id) {
        Actor actor = actorService.findById(id);
        if (actor == null) {
            return Response.status(404).build();
        } else {
            Set<Movie> movies = new HashSet<>(actor.getMovies());
            for (Movie movie : movies) {
                movie.removeActor(actor);
            }
            actorService.delete(actor);
            return Response.ok().build();
        }
    }
}
