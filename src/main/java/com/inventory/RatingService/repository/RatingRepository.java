package com.inventory.RatingService.repository;

import com.inventory.RatingService.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RatingRepository extends PagingAndSortingRepository<Rating,String> {




    List<Rating> findByUserId(Integer userId);

    List<Rating> findByMeditionId(Integer meditionId);
}
