package com.example.WEEK_7_TASK.Repository;

import com.example.WEEK_7_TASK.Entity.Post;
import com.example.WEEK_7_TASK.Entity.PostLikes;
import com.example.WEEK_7_TASK.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository<PostLikes, Long> {
    @Transactional
    void deletePostLikesByPostAndUser(Post post, User user);

    List<PostLikes> findAllByPost(Post post);

    void deleteAllByPost(Post post);

}
