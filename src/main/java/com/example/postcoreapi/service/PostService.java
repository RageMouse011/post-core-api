package com.example.postcoreapi.service;

import com.example.postcoreapi.model.Post;
import com.example.postcoreapi.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Optional<Post> getPost(String postId) {
        return postRepository.findById(postId);
    }

    public Post updatePost(Post post, String postId) {
        Post updatedPost = postRepository.findById(postId).get();
        updatedPost.setStatus(post.getStatus());
        return postRepository.save(updatedPost);
    }

    public void deletePost(String postId) {
        postRepository.deleteById(postId);
    }
}
