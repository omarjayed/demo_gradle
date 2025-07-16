package com.example.blog.controller;

import com.example.blog.model.BlogPost;
import com.example.blog.service.BlogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class BlogPostController {
    private final BlogService blogService;

    public BlogPostController(BlogService blogService) {
        this.blogService = blogService;
    }

    @PostMapping
    public BlogPost createPost(@RequestBody BlogPost post) {
        blogService.createPost(post);
        return post;
    }

    @GetMapping
    public List<BlogPost> getAllPosts() {
        return blogService.getAllPosts();
    }
}