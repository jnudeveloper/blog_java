namespace java com.blog.domain
namespace php com.blog.domain

struct Post {
    1: i32 id,
    2: string title,
    3: string summary,
    4: string content,
    5: i8 status,
    6: i32 create_time,
    7: i32 update_time,
    8: i32 author_id,
    9: i32 approve_num,
    10: i32 collect_num,
    11: i32 comment_num
}
