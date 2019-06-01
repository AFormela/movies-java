package services;

import models.Actor;
import repositories.ActorRepository;

import javax.inject.Inject;
import java.util.List;

public class ActorServiceImpl implements ActorService {

    @Inject
    private ActorRepository actorRepository;

    @Override
    public void create(Actor actor) {
        actorRepository.create(actor);
    }

    @Override
    public void update(Actor actor) {
        actorRepository.update(actor);
    }

    @Override
    public void delete(Actor actor) {
        actorRepository.delete(actor);
    }

    @Override
    public Actor findById(Long id) {
        return actorRepository.findById(id);
    }

    @Override
    public List<Actor> findAll() {
        return actorRepository.findAll();
    }
}
