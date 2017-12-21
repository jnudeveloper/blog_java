USE blog;

CREATE TABLE `post`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '文章编号',
    `title` VARCHAR(256) NOT NULL DEFAULT '' COMMENT '文章标题',
    `abstract` VARCHAR(512) DEFAULT '' COMMENT '文章摘要',
    `content` TEXT NOT NULL COMMENT '文章内容',
    `status` TINYINT NOT NULL DEFAULT 1 COMMENT '文章状态，0已删除 1草稿 2已发布',
    `create_time` INT NOT NULL DEFAULT 0 COMMENT '创建时间',
    `update_time` INT NOT NULL DEFAULT 0 COMMENT '更新时间',
    `author_id` INT UNSIGNED NOT NULL DEFAULT 0 COMMENT '文章作者',
    `approve_num` INT UNSIGNED NOT NULL DEFAULT 0 COMMENT '点赞数',
    `collect_num` INT UNSIGNED NOT NULL DEFAULT 0 COMMENT '收藏数',
    `comment_num` INT UNSIGNED NOT NULL DEFAULT 0 COMMENT '评论数',
    PRIMARY KEY(`id`)
) ENGINE = MyISAM DEFAULT CHARSET = utf8 COMMENT '博客文章表';

CREATE TABLE `comment` (
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '评论编号',
    `post_id` INT UNSIGNED NOT NULL DEFAULT 0 COMMENT '文章编号',
    `parent_id` INT UNSIGNED NOT NULL DEFAULT 0 COMMENT '父评论编号',
    `status` TINYINT NOT NULL DEFAULT 1 COMMENT '评论状态，0已删除 1有效',
    `content` TEXT NOT NULL COMMENT '评论内容',
    `create_time` INT NOT NULL DEFAULT 0 COMMENT '创建时间',
    `update_time` INT NOT NULL DEFAULT 0 COMMENT '更新时间',
    `author_id` INT UNSIGNED NOT NULL DEFAULT 0 COMMENT '评论人',
    `approve_num` INT UNSIGNED NOT NULL DEFAULT 0 COMMENT '点赞数',
    PRIMARY KEY(`id`)
) ENGINE = MyISAM DEFAULT CHARSET = utf8 COMMENT '评论表';

CREATE TABLE `tag` (
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '标签编号',
    `name` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '标签名称',
    `frequency` INT UNSIGNED NOT NULL DEFAULT 0 COMMENT '标签引用数',
    `create_time` INT NOT NULL DEFAULT 0 COMMENT '创建时间',
    `update_time` INT NOT NULL DEFAULT 0 COMMENT '更新时间',
    PRIMARY KEY(`id`)
) ENGINE = MyISAM DEFAULT CHARSET = utf8 COMMENT '标签表';

CREATE TABLE `post_tag` (
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '关联编号',
    `post_id` INT UNSIGNED NOT NULL DEFAULT 0 COMMENT '文章编号',
    `tag_id` INT UNSIGNED NOT NULL DEFAULT 0 COMMENT '标签编号',
    `status` TINYINT NOT NULL DEFAULT 1 COMMENT '状态位，0失效 1有效',
    PRIMARY KEY(`id`)
) ENGINE = MyISAM DEFAULT CHARSET = utf8 COMMENT '文章-标签关联表';


