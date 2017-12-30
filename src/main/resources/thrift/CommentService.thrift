include 'Comment.thrift'
include 'CUDResult.thrift'
include 'Query.thrift'

namespace java com.blog.service
namespace php com.blog.service

service CommentService {
    list<Comment.Comment> find(1: Query.Query query);
    CUDResult.CUDResult create(1: Comment.Comment comment);
    CUDResult.CUDResult update(1: Comment.Comment comment);
    CUDResult.CUDResult deleteById(1: i32 id);
}