-- -- 1.查询所有的库
-- show databases;
-- 
-- -- 2.创建一个数据库 先判断有没有
-- create database if not exists db2 character set gbk;
-- 
-- -- 3.查看某个收据库的创建语句
-- show create database db;
-- 
-- -- 4.修改字符集
-- alter database db character set utf8;
-- 
-- -- 5.删除数据库 判断是否存在 存在删除
-- drop database if  exists  db2;
-- -- 使用数据库 以及查询数据库的名称
-- use db;
-- select database();
-- 
-- 
-- 
-- use db;
-- show tables;
-- drop table if exists student;

-- create table if not exists student(
-- 					id int,
-- 					name varchar(32) NOT NULL,  -- NAME不能为空
-- 					age int ,
-- 					phone_number VARCHAR(20)    -- 添加了唯一约束
-- 					math double(4,2) ,
-- 					english double(4,2) ,
-- 					birthday date,
-- 					insert_time timestamp DEFAULT(CURRENT_TIMESTAMP)  -- 默认的让获取系统时间
-- 				);
-- -- 				
-- desc student;
-- 
-- -- 复制一份表
-- create table if not exists stu like student;
-- desc stu;
-- drop table if exists stu;
-- 
-- 
-- -- 修改表名
-- alter table students rename to student;
-- -- 修改表的字符集
-- alter table student character set gbk;
-- -- 添加一列
-- alter table student add math double(4,2);
-- alter table student add english double(4,2);
-- 
-- -- 修改列名字 以及类型
-- alter table student change bordCards bordCard varchar(20);
-- alter table student modify score  double(5,2);
-- desc student;
-- -- 删除列
-- alter table student drop bordCard;
-- 
-- -- 查看表的创建语句
-- show create table student;
-- 
-- -- 新增
-- insert into student(id,name,age,math,english)values(1,'张无忌',18,80,60);
-- insert into student(id,name,age,math,english)values(2,'张无忌',19,80,70);
-- insert into student(id,name,age,math,english)values(3,'张无忌',20,82,80);
-- 
-- insert into student(id,name,age,math,english)values(4,'张无忌',20,82,91);
-- insert into student(id,name,age,math,english)values(5,'张无忌',20,82,82);
-- insert into student(id,name,age,math,english)values(6,'张无忌',20,82,83);


-- -- 删除: 有多少记录就删除多少次,效率比较慢
-- delete from  student; 
-- -- 删除: 一次性删除所有数据 并且生成一个新表的结构
-- truncate table student;
-- SELECT * FROM student;
-- 
-- delete from student where id = 1;
-- 
-- 
-- -- 查询
-- select * from student;
-- 
-- update student set math=null where age = 20;
-- 
-- ;select * from student;
-- 
-- -- 排序方式
-- select * from student ORDER BY math DESC,english desc;
-- 
-- --  聚合函数 ifnull(math,0) 如果math为null则替换为0
-- select count(id) 人数 ,sum(IFNULL(math,0))  总成绩,avg(IFNULL(math,0)) 平均成绩,
-- MAX(english)  最大成绩, MIN(english)  最小成绩  from student; 
-- 
-- -- 分组查询 英语成绩大于70 并且人数大于1
-- select english, count(id) as numCount ,avg(IFNULL(english,0)) 平均分  from student where english>70 GROUP BY english HAVING numCount>1;
-- 
--  select * from student limit 0,3;
--  select * from student limit 3,3;
--  
--  -- 去除重复练习
--  -- 聚合查询不能跟普通字段混在一起 比如  select count(distinct age),name from student; 报错
--  select count(distinct age) from student;
--  
--  select distinct age,name from student;
 
 -- 条件查询
--  ;select * from student;
 
 -- 不等于19
--  SELECT * FROM student WHERE age<>20;
--  -- 成绩在 60 -90之间
--  SELECT * FROM student WHERE english BETWEEN 60 AND 80;
--  -- 或者练习 
--  SELECT * FROM student WHERE english = 60 or english=70 or english=80;
--  -- 等价于 上方写法
--  SELECT * FROM student WHERE english in(60,70,80);
--  -- 查询score不为null
--  SELECT * FROM student WHERE score is not  null;
--  
--  -- like 模糊查询
--  SELECT * FROM student WHERE name LIKE '马%' ;	 -- 马字开头的人
--  SELECT * FROM student WHERE name LIKE '_冬%';	 -- 第二个字是冬的人
--  SELECT * FROM student WHERE name LIKE '___';		 -- 名字是三个字的人
--  SELECT * FROM student WHERE name LIKE '%无%';   -- 名字包含无的 



-- 约束的练习

-- drop table if exists stu;
-- create table if not exists stu(
-- 					id INT PRIMARY KEY AUTO_INCREMENT,	  -- 添加主键约束 自增
-- 					name varchar(20),  		-- NAME不能为空
-- 					phone_number VARCHAR(20) UNIQUE  -- 添加非空约束
-- 				);
-- 				show create table stu;
-- 				
--  insert into stu(name,phone_number)values('张三',NULL);
--  insert into stu(name,phone_number)values('李四',NULL);
--  insert into stu(name,phone_number)values('王五',NULL);

 -- 修改 name的约束 不能为null
 -- ALTER TABLE stu MODIFY NAME VARCHAR(20) NOT NULL;
 
 -- unique 不能添加重复的值
 -- 删除stu的主键
 -- ALTER TABLE stu DROP PRIMARY KEY;
--  SELECT * FROM stu;




-- 员工表与部门表
-- 部门表
-- TRUNCATE TABLE department;
-- CREATE TABLE IF NOT EXISTS department(
-- 	id INT PRIMARY KEY AUTO_INCREMENT,
-- 	dep_name VARCHAR(20),   -- 部门名称
-- 	dep_location VARCHAR(20)  -- 部门地址 
-- 	
-- );
-- 
-- 
-- -- 员工表
-- TRUNCATE TABLE employee;
-- CREATE TABLE IF NOT EXISTS employee(
-- 	id INT PRIMARY KEY AUTO_INCREMENT,
-- 	NAME VARCHAR(20),
-- 	age INT,
-- 	dep_id INT  -- 外键约束
-- 	-- CONSTRAINT emp_dep_fk FOREIGN KEY(dep_id) REFERENCES department(id)
-- );


-- 删除外键约束
-- ALTER TABLE employee  DROP  FOREIGN KEY  emp_dep_fk;
-- 添加外键 设置级联更新 级联删除
-- ALTER TABLE employee add CONSTRAINT emp_dep_fk FOREIGN KEY(dep_id) REFERENCES department(id)
-- ON UPDATE CASCADE ON DELETE CASCADE;
-- 
-- 
-- -- SHOW CREATE TABLE employee;
-- 
-- 
-- INSERT INTO department(dep_name,dep_location)VALUES('开发部','广州');
-- INSERT INTO department(dep_name,dep_location)VALUES('销售部','深圳');
-- 
-- INSERT INTO employee (NAME,age,dep_Id) VALUE('张三',21,1);
-- INSERT INTO employee (NAME,age,dep_Id) VALUE('李四',21,2);
-- INSERT INTO employee (NAME,age,dep_Id) VALUE('王五',21,1);
-- INSERT INTO employee (NAME,age,dep_Id) VALUE('刘六',21,2);
-- 
-- SELECT * FROM employee;
-- SELECT * FROM department;







-- 创建四张表 分类线路 线路 用户  

-- 分析 一个分类线路可以有多个线路 ,一个线路对应多个用户,一个用户对用多个香炉 1对多 多对多，
-- 用第四张表把 线路跟用户 关联起来

-- 分类线路

-- 	create TABLE IF NOT EXISTS tab_category(
-- 					cid INT PRIMARY KEY auto_increment,
-- 					cname VARCHAR(100) NOT NULL UNIQUE
-- 	); 
-- -- 线路
-- 	
-- 	create TABLE IF NOT EXISTS tab_route(
-- 					rid INT PRIMARY KEY auto_increment,
-- 					rname VARCHAR(100) NOT NULL UNIQUE,
-- 					price DOUBLE,
-- 					rdate TIMESTAMP DEFAULT(CURRENT_TIMESTAMP),
-- 					cid INT, -- 外键约束
-- 					CONSTRAINT route_category_fk FOREIGN KEY(cid) REFERENCES tab_category(cid)
-- 	);
-- 	
-- 	-- 用户
-- 
-- 	create TABLE IF NOT EXISTS tab_user(
-- 			uid INT PRIMARY KEY auto_increment,
-- 			NAME VARCHAR(100) NOT null,
-- 			username VARCHAR(100) NOT NULL UNIQUE,
-- 			password VARCHAR(30) NOT NULL,
-- 			birthday date,
-- 			sex CHAR(1) DEFAULT '男',
-- 			telephone VARCHAR(11) ,
-- 			email VARCHAR(100)
-- 	
-- 	
-- 	);
-- 	 
-- 	-- 用户跟线路 关联的新表
-- 
-- 	create TABLE IF NOT EXISTS tab_favorite(
-- 					rid int, -- 线路id
-- 					uid int, -- 用户id
-- 					date datetime ,
-- 					-- 创建复合主键 +
-- 					PRIMARY KEY(rid,uid),
-- 					CONSTRAINT  fav_router_fk FOREIGN KEY(rid) REFERENCES tab_route(rid),
-- 					CONSTRAINT  fav_user_fk FOREIGN KEY(uid) REFERENCES tab_user(uid)
-- 
-- 	);
-- 	
-- 	INSERT INTO tab_category(cname)values('第一分类');
-- 	INSERT INTO tab_category(cname)values('第二分类');
-- 	
-- 	INSERT INTO tab_route(rname,cid)values('旧线路1',1);
-- 	INSERT INTO tab_route(rname,cid)values('旧线路2',1);
-- 	INSERT INTO tab_route(rname,cid)values('新线路1',2);
-- 	INSERT INTO tab_route(rname,cid)values('新线路2',2);
-- 	
-- 	INSERT INTO tab_user(NAME,username,password)values('张三','woshigeshen1','123456');
-- 	INSERT INTO tab_user(NAME,username,password)values('李四','woshigeshen2','abc000');
-- 	INSERT INTO tab_user(NAME,username,password)values('王五','woshigeshen3','88888');
-- 	
-- 	INSERT INTO tab_favorite(rid,uid)values(1,1);
-- 	INSERT INTO tab_favorite(rid,uid)values(1,2);
-- 	INSERT INTO tab_favorite(rid,uid)values(2,1);
-- 	INSERT INTO tab_favorite(rid,uid)values(2,2);
-- 
-- 	 
-- 
-- 	
-- 	SELECT * from tab_category;
-- 	SELECT * from tab_route;
-- 	SELECT * from tab_user;
-- 	SELECT * from tab_favorite;


-- 多表查询
-- SELECT * from department,employee;



-- 查询所有的员工信息 以及对应的部门的信息

-- SELECT 
-- 			t1.name,
-- 			t1.age,
-- 			t2.dep_name,
-- 			t2.dep_location 
-- FROM 
-- 			employee t1,
-- 			department t2 
-- WHERE 
-- 			t1.dep_id = t2.id; 
-- 			
-- 			
-- -- 左外连接 (换个位置就成了 右外连接)
-- 
-- SELECT 
-- 			*
-- FROM 
-- 			  department t2
-- LEFT JOIN
-- 			  employee t1
-- ON 
-- 			t1.dep_id = t2.id; 
-- 			
-- 			
-- -- 
-- SELECT * from department;
-- SELECT * from employee;
-- 	
-- 	
-- -- 子查询
-- -- 查询 年龄是25的员工 以及部门
-- 
-- SELECT * FROM employee INNER JOIN department  ON  employee.dep_id = department.id
-- WHERE age = (SELECT MAX(age) FROM employee) ;
-- 
-- -- 查询 部门式销售部和 市场部的 员工的信息
-- SELECT * FROM employee INNER JOIN department  ON  employee.dep_id = department.id
-- WHERE employee.dep_id in  (SELECT id FROM department WHERE dep_name in('销售部','市场部','开发部')) ;
-- 
-- 
-- -- 查询年龄大于21岁的员工 和部门信息
-- 
-- SELECT * from (select * from employee WHERE age>21) as t1,department as t2 WHERE t1.dep_id=t2.id;

	
	-- 事务的练习
	-- 张三给李四转账500元
-- 	;
-- 	 SELECT @@autocommit;    -- 查询是否则自动提交
-- 
-- 	 
-- 	
-- 	
-- 	
--  -- begin
-- 	SET @@autocommit = 0;
-- 	START TRANSACTION;
-- 			UPDATE stu SET blance = blance - 500 WHERE name='张三';
-- 			123456789
-- 			UPDATE stu SET blance = blance + 500 WHERE name='李四';
-- 	COMMIT;
-- 	ROLLBACK;
-- 	SET @@autocommit = 1;
-- -- -- end
-- -- 
-- --  
--  SELECT * FROM stu; 
--  
--  ALTER  TABLE stu ADD blance DOUBLE;
--  SHOW CREATE TABLE stu;	
--  
-- UPDATE stu SET  = 1000 WHERE `name` in('张三','李四');
-- ALTER TABLE stu drop phone_number;






-- 创建用户
;use mysql;
CREATE USER 'test'@'localhost' IDENTIFIED BY 'test';

select * from tab_user;
update tab_user set username='woshigeshen1',password='123' where username='woshigeshen1'


	




	
	
	

	







 
 
 
 












