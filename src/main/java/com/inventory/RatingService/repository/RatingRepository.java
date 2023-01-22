package com.inventory.RatingService.repository;

import com.inventory.RatingService.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating,String> {




    List<Rating> findByUserId(Integer userId);

    List<Rating> findByMeditionId(Integer meditionId);
}
