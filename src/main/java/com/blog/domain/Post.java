package com.blog.domain;

import com.blog.domain.Query;
import com.blog.dao.PostDAO;
import java.util.ArrayList;
import java.util.List;

public class Post extends PostDAO{

    public List<Post> find(Query query){
        Post post = new Post();
        post.setId(1);
        post.setTitle("title");
        post.setSummary("summary");
        post.setContent("content!");
        post.setStatus(1);
        post.setCreateTime(1515585420);
        post.setUpdateTime(1515585420);
        post.setAuthorId(1);
        post.setApproveNum(0);
        post.setCollectNum(2);
        post.setCommentNum(3);

        List<Post> posts = new ArrayList<>();
        posts.add(post);

        return posts;
    }


}
