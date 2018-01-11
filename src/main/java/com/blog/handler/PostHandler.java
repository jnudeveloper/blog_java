package com.blog.handler;

import com.blog.domain.Post;
import com.blog.domain.Query;
import com.blog.thrift.domain.TCUDResult;
import com.blog.thrift.domain.TPost;
import com.blog.thrift.domain.TQuery;
import com.blog.thrift.domain.TTag;
import org.apache.thrift.TException;
import com.blog.thrift.service.PostService;
import java.util.List;

public class PostHandler  implements PostService.Iface {

    @Override
    public List<TPost> find(TQuery tQuery) throws TException {
        System.out.println("where : " + tQuery.where);

        Query query = new Query(tQuery);
        Post post = new Post();
        return Post.format(post.find(query));
    }

    @Override
    public TCUDResult create(TPost post) throws TException {
        return null;
    }

    @Override
    public TCUDResult deleteById(int id) throws TException {
        return null;
    }

    @Override
    public TCUDResult update(TPost post) throws TException {
        return null;
    }

    @Override
    public TCUDResult updateWithTags(TPost post, List<TTag> tagList) throws TException {
        return null;
    }

    @Override
    public TCUDResult createWithTags(TPost post, List<TTag> tagList) throws TException {
        return null;
    }

}
