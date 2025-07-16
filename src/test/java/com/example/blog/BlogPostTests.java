package com.example.blog;

import com.example.blog.model.BlogPost;
import com.example.blog.repository.BlogPostRepository;
import com.example.blog.service.BlogService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@SpringBootTest
public class BlogPostTests {

    @Autowired
    private BlogService blogService;

    @Test
    public void testCreateAndListPosts() {
        BlogPost post = new BlogPost();
        post.setTitle("My demo blog");
        post.setBody("A demo for Java with Gradle");

        blogService.createPost(post);
        List<BlogPost> posts = blogService.getAllPosts();

        assertTrue(posts.stream().anyMatch(p -> p.getTitle().equals("My demo blog")));
    }
}