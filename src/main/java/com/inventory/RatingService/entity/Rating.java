package com.inventory.RatingService.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="RATING_TABLE")
public class Rating {

    @Id
    @Column(name = "id", length = 50)
    private  String ratingId;

    @Column(name= "user_id")
    private Integer userId;

    @Column(name ="rating")
    private Integer rating;

    @Column(name="feedback")
    private String feedback;

    @Column(name = "meditionId")
    private Integer meditionId;
}
