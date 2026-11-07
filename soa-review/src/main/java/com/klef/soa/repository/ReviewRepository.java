package com.klef.soa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.soa.entity.Review;

public interface ReviewRepository extends JpaRepository<Review,Long>
{
    List<Review> findByName(String name);

    List<Review> findByType(String type);
}