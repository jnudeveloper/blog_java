## migration使用方法：
- 1、文件命名：V+版本号+__+描述
    注意V要大写，版本号由数字、点、下划线组成，__为两条下划线
- 2、文件内容：sql语句
- 3、使用方法：
    -  新建数据库blog: CREATE DATABASE blog
    - 把DataMigrationExample.java中的url、user、password填写成实际的信息
    - 运行DataMigrationExample，即可同步数据库