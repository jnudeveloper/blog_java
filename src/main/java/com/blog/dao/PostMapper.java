package com.blog.dao;

import java.util.List;
import com.blog.domain.Post;

public interface PostMapper {
    public Post findById(int id);
    public List<Post> findAll();
}
