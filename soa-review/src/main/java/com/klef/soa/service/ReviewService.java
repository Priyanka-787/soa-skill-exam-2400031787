package com.klef.soa.service;

import java.util.List;

import com.klef.soa.entity.Review;

public interface ReviewService
{
    String insertReview(Review review);

    String updateReview(Long id, Review review);

    String deleteReview(Long id);

    List<Review> displayAllReviews();

    Review displayReviewById(Long id);

    List<Review> findByName(String name);

    List<Review> findByType(String type);
}