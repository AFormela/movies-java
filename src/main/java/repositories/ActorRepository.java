package repositories;

import models.Actor;

import java.util.List;

public interface ActorRepository {
    void create(Actor actor);
    void update(Actor actor);
    void delete(Actor actor);
    Actor findById(Long id);
    List<Actor> findAll();
}
