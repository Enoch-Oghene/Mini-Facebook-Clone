package com.example.WEEK_7_TASK.Service;

import com.example.WEEK_7_TASK.Entity.Post;
import com.example.WEEK_7_TASK.Entity.User;
import com.example.WEEK_7_TASK.Mapper.LikePosts;

import java.util.List;

public interface PostService {
    void addPost(User user, Post post);

    List<LikePosts> getAllPost(User user);

    void updatePost(Post post);

    void deletePost(Post post);

    Post getPostById(Long id);
}
