package com.blog.domain;

import com.blog.domain.Query;
import com.blog.dao.PostDAO;
import com.blog.thrift.domain.TPost;

import java.util.ArrayList;
import java.util.List;

public class Post{
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

    public List<Post> findById(int id){

    }

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

        System.out.println("success");
        return tPosts;
    }

    public static Post format(Post post){
        Post tPost = new Post();
        tPost.id = post.getId();
        tPost.title = post.getTitle();
        tPost.summary = post.getSummary();
        tPost.content = post.getContent();
        tPost.status = post.getStatus();
        tPost.create_time = post.getCreateTime();
        tPost.update_time = post.getUpdateTime();
        tPost.author_id = post.getAuthorId();
        tPost.approve_num = post.getApproveNum();
        tPost.collect_num = post.getCollectNum();
        tPost.comment_num = post.getCommentNum();

        return tPost;
    }


}
