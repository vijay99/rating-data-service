package com.luv2code.ratingdataservice.model;

import java.util.List;

/**
 * @author Kumar Vijay
 */
public class UserRating {
    private List<Rating> userRating;

    public List<Rating> getUserRating() {
        return userRating;
    }

    public void setUserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }
}
