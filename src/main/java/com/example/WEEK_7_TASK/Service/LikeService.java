package com.example.WEEK_7_TASK.Service;

import com.example.WEEK_7_TASK.Entity.Post;
import com.example.WEEK_7_TASK.Entity.User;

public interface LikeService {
    boolean likePost(User user, Long postId, String action);
    void deleteAllLikesInPost(Post post);
}
