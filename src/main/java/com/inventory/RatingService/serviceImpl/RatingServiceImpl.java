package com.inventory.RatingService.serviceImpl;

import com.inventory.RatingService.config.Response;
import com.inventory.RatingService.dto.RatingDto;
import com.inventory.RatingService.entity.Rating;
import com.inventory.RatingService.repository.RatingRepository;
import com.inventory.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {


    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private RatingRepository ratingRepository;
    @Override
    public Response createRating(RatingDto ratingDto) {
        Rating rating = new Rating();
        String ratindId = UUID.randomUUID().toString();
        rating.setRatingId(ratindId);
        rating.setRating(ratingDto.getRating());
        rating.setFeedback(ratingDto.getFeedback());
        rating.setUserId(ratingDto.getUserId());
        rating.setMeditionId(ratingDto.getMeditionId());
        ratingRepository.save(rating) ;
        return new Response("rating seved successfully" , rating, HttpStatus.OK);
    }

    @Override
    public List<Rating> getRatings(Integer pageNo, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNo,pageSize);
        Page<Rating> pagedRatings = ratingRepository.findAll(pageable);
        if(pagedRatings.hasContent()){
            return pagedRatings.getContent();
        }else{
            return new ArrayList<>();
        }
    }

    @Override
    public List<Rating> getratingByUserId(Integer userId) {
        return ratingRepository.findByUserId(userId) ;
    }

    @Override
    public List<Rating> getRatingByMeditionId(Integer meditionId){
        return ratingRepository.findByMeditionId(meditionId);
    }
}
