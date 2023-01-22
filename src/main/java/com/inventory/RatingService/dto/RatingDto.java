package com.inventory.RatingService.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RatingDto {

    private  String ratingId;

    private Integer userId;

    private int rating;

    private String feedback;

    private Integer meditionId;
}
