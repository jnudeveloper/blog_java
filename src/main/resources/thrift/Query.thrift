include 'Condition.thrift'

namespace java com.blog.domain
namespace php com.blog.domain

struct Query {
    1: bool distinct;
    2: list<string> fromTable;
    3: list<string> groupBy;
    4: list<string> having;
    5: list<string> join;
    6: i32 limit;
    7: i32 offset;
    8: list<string> on;
    9: list<string> orderBy;
    10: list<string> select;
    11: list<string> unions;
    12: list<Condition.Condition> where;
    13: list<String> params;
}