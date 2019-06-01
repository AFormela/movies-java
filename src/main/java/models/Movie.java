package models;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.*;
import java.util.*;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int year;
    @OneToMany(
            mappedBy = "movie",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JsonbTransient
    private List<Comment> comments;
    @OneToMany(
            mappedBy = "movie",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JsonbTransient
    private List<Rating> ratings;
    @ManyToMany(
            fetch = FetchType.LAZY,
            mappedBy = "movies"
    )
    @JsonbTransient
    private Set<Actor> actors;

    public Movie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public void setActors(Set<Actor> actors) {
        this.actors = actors;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
        comment.setMovie(this);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
        comment.setMovie(null);
    }

    public void addRating(Rating rating) {
        ratings.add(rating);
        rating.setMovie(this);
    }

    public void removeActor(Actor actor) {
        actors.remove(actor);
    }

    @Override
    public int hashCode() {
        return 13;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Movie movie = (Movie) obj;
        return id != null && id.equals(movie.getId());
    }

}
