include 'Tag.thrift'
include 'Query.thrift'
include 'CUDResult.thrift'

namespace java com.blog.service
namespace php com.blog.service

service TagService {
    list<Tag.Tag> find(1: Query.Query query);
    CUDResult.CUDResult create(1: Tag.Tag tag);
    CUDResult.CUDResult update(1: Tag.Tag tag);
    CUDResult.CUDResult deleteById(1: i32 id);
}