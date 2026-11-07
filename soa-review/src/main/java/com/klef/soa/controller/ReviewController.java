package com.klef.soa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.soa.entity.Review;
import com.klef.soa.service.ReviewService;

@RestController
@RequestMapping("/review")
public class ReviewController
{
    @Autowired
    private ReviewService service;

    @GetMapping("/")
    public String home()
    {
        return "Review Project Is Running...!!!";
    }

    @PostMapping("/insert")
    public String insert(@RequestBody Review review)
    {
        return service.insertReview(review);
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id, @RequestBody Review review)
    {
        return service.updateReview(id, review);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id)
    {
        return service.deleteReview(id);
    }

    @GetMapping("/displayall")
    public List<Review> displayAll()
    {
        return service.displayAllReviews();
    }

    @GetMapping("/display/{id}")
    public Review displayById(@PathVariable Long id)
    {
        return service.displayReviewById(id);
    }

    @GetMapping("/findbyname/{name}")
    public List<Review> findByName(@PathVariable String name)
    {
        return service.findByName(name);
    }

    @GetMapping("/findbytype/{type}")
    public List<Review> findByType(@PathVariable String type)
    {
        return service.findByType(type);
    }
}