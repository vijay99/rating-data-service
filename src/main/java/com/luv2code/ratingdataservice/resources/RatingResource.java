package com.luv2code.ratingdataservice.resources;

import com.luv2code.ratingdataservice.model.Rating;
import com.luv2code.ratingdataservice.model.UserRating;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author Kumar Vijay
 */
@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
         return new Rating(movieId,4);

    }

    @RequestMapping("/user/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){
        List<Rating> ratings= Arrays.asList(new Rating("1234",4),
                                            new Rating("4567",5));

        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }

}
