package com.blog.migration;


import org.flywaydb.core.Flyway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * 数据库同步
 */
@Component
public class DataMigrationExample {
    private static Logger log = LoggerFactory.getLogger(DataMigrationExample.class);

    private static String url = "";  // 数据库地址，例如：jdbc:mysql://localhost:3306/blog
    private static String user = ""; // 数据库用户名
    private static String password = ""; // 数据库密码

    public static void main(String[] args) {
        // 创建Flyway实例
        log.info("创建Flyway实例");
        Flyway flyway = new Flyway();

        // 设置数据库
        log.info("设置数据库");
        flyway.setDataSource(url, user, password);

        // 开始迁移
        log.info("开始迁移");
        flyway.migrate();
    }

}
