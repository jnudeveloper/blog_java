namespace java com.blog.domain
namespace php com.blog.domain

struct CUDResult {
    1: i32 code // 错误码, 成功：0
    2: i32 id; // 主键编号，失败时返回空
    3: string information // 错误信息
}