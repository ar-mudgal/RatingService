package com.inventory.RatingService.controller;

import com.inventory.RatingService.config.Response;
import com.inventory.RatingService.dto.RatingDto;
import com.inventory.RatingService.entity.Rating;
import com.inventory.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RatigController {

    @Autowired
    RatingService ratingService;

    @PostMapping("/create")
    public Response createRating(@RequestBody RatingDto ratingDto){
        return ratingService.createRating(ratingDto);
    }

    @GetMapping("/getAll")
    public List<Rating> getRatings(){
        return ratingService.getRatings();
    }

    @GetMapping("/getByUserId/{id}")
    public List<Rating> getratingByUserId(@PathVariable Integer id){
        return ratingService.getratingByUserId(id);
    }

    @GetMapping("/getByMeditionId/{meditionId}")
    public List<Rating> getRatingByMeditionId(@PathVariable Integer meditionId){
        return ratingService.getRatingByMeditionId(meditionId);
    }
}
