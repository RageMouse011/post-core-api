package com.example.postcoreapi.controller;

import com.example.postcoreapi.model.Post;
import com.example.postcoreapi.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posts")
@AllArgsConstructor
public class PostController {
    private final PostService postService;


    @PostMapping // works
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }

    @GetMapping // works
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("{postId}") // works
    public Optional<Post> getPost(@PathVariable String postId) {
        return postService.getPost(postId);
    }

    @PutMapping("{postId}") // works
    public Post updatePost(@RequestBody Post post, @PathVariable String postId) {
        return postService.updatePost(post, postId);
    }

    @DeleteMapping("{postId}") // works
    public void deletePost(@PathVariable String postId) {
        postService.deletePost(postId);
    }
}
