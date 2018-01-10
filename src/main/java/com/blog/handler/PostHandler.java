package com.blog.handler;

import com.blog.thrift.domain.CUDResult;
import com.blog.thrift.domain.Post;
import com.blog.thrift.domain.Query;
import com.blog.thrift.domain.Tag;
import org.apache.thrift.TException;
import com.blog.thrift.service.PostService;

import java.util.ArrayList;
import java.util.List;

public class PostHandler  implements PostService.Iface {

    @Override
    public List<Post> find(Query query) throws TException {
        System.out.println("where : " + query.where);

        Post post = new Post();
        post.id = 1;
        post.title = "title";
        post.summary = "summary";
        post.content = "content!";
        post.status = 1;
        post.create_time = 1515585420;
        post.update_time = 1515585420;
        post.author_id = 1;
        post.approve_num = 0;
        post.collect_num = 2;
        post.comment_num = 3;

        List<Post> posts = new ArrayList<>();
        posts.add(post);

        return posts;
    }

    @Override
    public CUDResult create(Post post) throws TException {
        return null;
    }

    @Override
    public CUDResult deleteById(int id) throws TException {
        return null;
    }

    @Override
    public CUDResult update(Post post) throws TException {
        return null;
    }

    @Override
    public CUDResult updateWithTags(Post post, List<Tag> tagList) throws TException {
        return null;
    }

    @Override
    public CUDResult createWithTags(Post post, List<Tag> tagList) throws TException {
        return null;
    }

}
