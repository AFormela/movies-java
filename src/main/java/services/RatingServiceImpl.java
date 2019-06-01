package services;

import models.Rating;

import java.util.List;

public class RatingServiceImpl implements RatingService {

    @Override
    public double calculateRating(List<Rating> ratings) {
        double rating = 0;
        for (Rating rate : ratings) {
            rating += rate.getRating();
        }
        return (rating/ratings.size());
    }
}
