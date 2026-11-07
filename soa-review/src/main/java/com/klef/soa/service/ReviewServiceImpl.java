package com.klef.soa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.entity.Review;
import com.klef.soa.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService
{
    @Autowired
    private ReviewRepository repository;

    @Override
    public String insertReview(Review review)
    {
        repository.save(review);
        return "Review Inserted Successfully";
    }

    @Override
    public String updateReview(Long id, Review review)
    {
        Optional<Review> obj = repository.findById(id);

        if(obj.isPresent())
        {
            Review r=obj.get();

            r.setName(review.getName());
            r.setType(review.getType());
            r.setStatus(review.getStatus());
            r.setLocation(review.getLocation());

            repository.save(r);

            return "Review Updated Successfully";
        }

        return "Review Not Found";
    }

    @Override
    public String deleteReview(Long id)
    {
        repository.deleteById(id);
        return "Review Deleted Successfully";
    }

    @Override
    public List<Review> displayAllReviews()
    {
        return repository.findAll();
    }

    @Override
    public Review displayReviewById(Long id)
    {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Review> findByName(String name)
    {
        return repository.findByName(name);
    }

    @Override
    public List<Review> findByType(String type)
    {
        return repository.findByType(type);
    }
}