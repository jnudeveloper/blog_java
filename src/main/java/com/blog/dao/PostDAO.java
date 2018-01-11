package com.blog.dao;

import com.blog.domain.Post;
import com.blog.thrift.domain.TPost;

import java.util.ArrayList;
import java.util.List;

public class PostDAO {
    private int id;
    private String title;
    private String summary;
    private String content;
    private int status;
    private int create_time;
    private int update_time;
    private int author_id;
    private int approve_num;
    private int collect_num;
    private int comment_num;

    public static List<TPost> format(List<Post> posts){
        List<TPost> tPosts= new ArrayList<>();
        for(Post item : posts){
            TPost tPost = new TPost();
            tPost.id = item.getId();
            tPost.title = item.getTitle();
            tPost.summary = item.getSummary();
            tPost.content = item.getContent();
            tPost.status = item.getStatus();
            tPost.create_time = item.getCreateTime();
            tPost.update_time = item.getUpdateTime();
            tPost.author_id = item.getAuthorId();
            tPost.approve_num = item.getApproveNum();
            tPost.collect_num = item.getCollectNum();
            tPost.comment_num = item.getCommentNum();

            tPosts.add(tPost);
        }

        return tPosts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCreateTime() {
        return create_time;
    }

    public void setCreateTime(int create_time) {
        this.create_time = create_time;
    }

    public int getUpdateTime() {
        return update_time;
    }

    public void setUpdateTime(int update_time) {
        this.update_time = update_time;
    }

    public int getAuthorId() {
        return author_id;
    }

    public void setAuthorId(int author_id) {
        this.author_id = author_id;
    }

    public int getApproveNum() {
        return approve_num;
    }

    public void setApproveNum(int approve_num) {
        this.approve_num = approve_num;
    }

    public int getCollectNum() {
        return collect_num;
    }

    public void setCollectNum(int collect_num) {
        this.collect_num = collect_num;
    }

    public int getCommentNum() {
        return comment_num;
    }

    public void setCommentNum(int comment_num) {
        this.comment_num = comment_num;
    }


}
