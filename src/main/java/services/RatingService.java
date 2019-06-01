package services;

import models.Rating;

import java.util.List;

public interface RatingService {
    double calculateRating(List<Rating> ratings);
}
