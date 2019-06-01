package services;

import models.Actor;

import java.util.List;

public interface ActorService {
    void create(Actor actor);
    void update(Actor actor);
    void delete(Actor actor);
    Actor findById(Long id);
    List<Actor> findAll();
}
