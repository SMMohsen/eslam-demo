package com.demo.service;

import com.demo.model.Files;
import com.demo.model.Post;
import com.demo.repository.FilesRepository;
import com.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private FilesRepository filesRepository;

    @Autowired
    private PostRepository postRepository;

    public Post addPost(Post post) {

        Files files = filesRepository.save(post.getFiles());

        post.setFiles(files);

        post = postRepository.save(post);

        return post;
    }
}
