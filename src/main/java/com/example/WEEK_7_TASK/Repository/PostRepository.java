package com.example.WEEK_7_TASK.Repository;

import com.example.WEEK_7_TASK.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByPostIdIsNotNullOrderByPostIdDesc();
    Post findByPostId(Long id);
}
