namespace java com.blog

struct PostInfo {
    1: i32 id
    2: string title
    3: string abstract
    4: string content
    5: i8 status
    6: i32 create_time
    7: i32 update_time
    8: i32 author_id
    9: i32 approve_num
    10: i32 collect_num
    11: i32 comment_num
    12: list<TagInfo> tagInfoList
}

struct PostExtInfo {
    1: i32 id
    2: string title
    3: string abstract
    4: string content
    5: i8 status
    6: i32 create_time
    7: i32 update_time
    8: i32 author_id
    9: i32 approve_num
    10: i32 collect_num
    11: i32 comment_num
    12: list<TagInfo> tagInfoList
    13: list<CommentInfo> commentInfoList
}

struct PostQuery {
    1: i32 id
    2: string title
    3: string abstract
    4: string content
    5: i8 status
    6: i32 create_time
    7: i32 update_time
    8: i32 author_id
    9: i32 approve_num
    10: i32 collect_num
    11: i32 comment_num
    12: TagInfo tagInfo
    13: CommentInfo commentInfo
}

struct TagInfo {
    1: i32 id
    2: string name
    3: i32 frequency
    4: i32 create_time
    5: i32 update_time
    6: i8 status
}

struct CommentInfo {
    1: i32 id
    2: i32 post_id
    3: i32 parent_id
    4: i8 status
    5: string content
    6: i32 create_time
    7: i32 update_time
    8: i32 author_id
    9: i32 approve_num
}

struct CommentExtInfo {
    1: i32 id
    2: i32 post_id
    3: i32 parent_id
    4: i8 status
    5: string content
    6: i32 create_time
    7: i32 update_time
    8: i32 author_id
    9: i32 approve_num
    10: PostInfo postInfo
}

struct PostTag {
    1: i32 id
    2: i32 post_id
    3: i32 tag_id
    4: i8 status
}

struct ResultInfo {
    1: i32 code // 错误码
    2: string information // 错误信息
}

service PostService {
    PostInfo getPostInfoById(1:i32 id);
    PostExtInfo getPostExtInfoById(1:i32 id);
    list<PostInfo> getPostInfoList(1:PostQuery postQuery);
    list<PostExtInfo> getPostExtInfoList(1:PostQuery postQuery);
    ResultInfo createPostInfo(1:PostInfo postInfo);
    ResultInfo updatePostInfo(1:PostInfo postInfo);
    ResultInfo deletePostInfoById(1:i32 id);
}

service CommentService {
    CommentInfo getCommentInfoById(1: i32 id);
    CommentExtInfo getCommentExtInfoById(1: i32 id);
    list<CommentInfo> getCommentInfoList(1: CommentInfo commentInfo);
    list<CommentExtInfo> getCommentExtInfoList(1: CommentExtInfo commentExtInfo);
    ResultInfo createCommentInfo(1: CommentInfo comment);
    ResultInfo updateCommentInfo(1: CommentInfo comment);
    ResultInfo deleteCommentInfoById(1: i32 id);
}

service TagService {
    TagInfo getTagInfoById(1: i32 id);
    list<TagInfo> getTagInfoList(1: TagInfo tagInfo);
    ResultInfo createTagInfo(1: TagInfo tagInfo);
    ResultInfo updateTagInfo(1: TagInfo tagInfo);
    ResultInfo deleteTagInfo(1: i32 id);
}

