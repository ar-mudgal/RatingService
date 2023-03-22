package com.inventory.RatingService.service;

import com.inventory.RatingService.config.Response;
import com.inventory.RatingService.dto.RatingDto;
import com.inventory.RatingService.entity.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    Response createRating(RatingDto ratingDto);

    List<Rating> getRatings(Integer pageNo, Integer pageSize);
    List<Rating> getratingByUserId(Integer userId);

    List<Rating> getRatingByMeditionId(Integer meditionId);
}
