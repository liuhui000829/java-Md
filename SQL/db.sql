/*
 Navicat Premium Data Transfer

 Source Server         : 123
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : db

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 17/01/2022 12:43:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `dep_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dep_location` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES (1, '开发部', '广州');
INSERT INTO `department` VALUES (2, '销售部', '深圳');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `NAME` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int NULL DEFAULT NULL,
  `dep_id` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `emp_dep_fk`(`dep_id`) USING BTREE,
  CONSTRAINT `emp_dep_fk` FOREIGN KEY (`dep_id`) REFERENCES `department` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES (1, '张三', 21, 1);
INSERT INTO `employee` VALUES (2, '李四', 21, 2);
INSERT INTO `employee` VALUES (3, '王五', 21, 1);
INSERT INTO `employee` VALUES (4, '刘六', 21, 2);

-- ----------------------------
-- Table structure for stu
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone_number` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `phone_number`(`phone_number`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stu
-- ----------------------------
INSERT INTO `stu` VALUES (1, '张三', NULL);
INSERT INTO `stu` VALUES (2, '李四', NULL);
INSERT INTO `stu` VALUES (3, '王五', NULL);

-- ----------------------------
-- Table structure for tab_category
-- ----------------------------
DROP TABLE IF EXISTS `tab_category`;
CREATE TABLE `tab_category`  (
  `cid` int NOT NULL AUTO_INCREMENT,
  `cname` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`cid`) USING BTREE,
  UNIQUE INDEX `cname`(`cname`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tab_category
-- ----------------------------
INSERT INTO `tab_category` VALUES (1, '第一分类');
INSERT INTO `tab_category` VALUES (2, '第二分类');

-- ----------------------------
-- Table structure for tab_favorite
-- ----------------------------
DROP TABLE IF EXISTS `tab_favorite`;
CREATE TABLE `tab_favorite`  (
  `rid` int NOT NULL,
  `uid` int NOT NULL,
  `date` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`rid`, `uid`) USING BTREE,
  INDEX `fav_user_fk`(`uid`) USING BTREE,
  CONSTRAINT `fav_router_fk` FOREIGN KEY (`rid`) REFERENCES `tab_route` (`rid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fav_user_fk` FOREIGN KEY (`uid`) REFERENCES `tab_user` (`uid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tab_favorite
-- ----------------------------
INSERT INTO `tab_favorite` VALUES (1, 1, NULL);
INSERT INTO `tab_favorite` VALUES (1, 2, NULL);
INSERT INTO `tab_favorite` VALUES (2, 1, NULL);
INSERT INTO `tab_favorite` VALUES (2, 2, NULL);

-- ----------------------------
-- Table structure for tab_route
-- ----------------------------
DROP TABLE IF EXISTS `tab_route`;
CREATE TABLE `tab_route`  (
  `rid` int NOT NULL AUTO_INCREMENT,
  `rname` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `price` double NULL DEFAULT NULL,
  `rdate` timestamp NULL DEFAULT 'now()',
  `cid` int NULL DEFAULT NULL,
  PRIMARY KEY (`rid`) USING BTREE,
  UNIQUE INDEX `rname`(`rname`) USING BTREE,
  INDEX `route_category_fk`(`cid`) USING BTREE,
  CONSTRAINT `route_category_fk` FOREIGN KEY (`cid`) REFERENCES `tab_category` (`cid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tab_route
-- ----------------------------
INSERT INTO `tab_route` VALUES (1, '旧线路1', NULL, '2021-12-20 19:26:06', 1);
INSERT INTO `tab_route` VALUES (2, '旧线路2', NULL, '2021-12-20 19:26:06', 1);
INSERT INTO `tab_route` VALUES (3, '新线路1', NULL, '2021-12-20 19:26:06', 2);
INSERT INTO `tab_route` VALUES (4, '新线路2', NULL, '2021-12-20 19:26:06', 2);

-- ----------------------------
-- Table structure for tab_user
-- ----------------------------
DROP TABLE IF EXISTS `tab_user`;
CREATE TABLE `tab_user`  (
  `uid` int NOT NULL AUTO_INCREMENT,
  `NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `birthday` date NULL DEFAULT NULL,
  `sex` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '男',
  `telephone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE,
  UNIQUE INDEX `username`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tab_user
-- ----------------------------
INSERT INTO `tab_user` VALUES (1, '张三', 'woshigeshen1', '123456', NULL, '男', NULL, NULL);
INSERT INTO `tab_user` VALUES (2, '李四', 'woshigeshen2', 'abc000', NULL, '男', NULL, NULL);
INSERT INTO `tab_user` VALUES (3, '王五', 'woshigeshen3', '88888', NULL, '男', NULL, NULL);
INSERT INTO `tab_user` VALUES (4, NULL, '薛刚', '123', NULL, '男', NULL, NULL);
INSERT INTO `tab_user` VALUES (6, NULL, '薛刚1', '11223', NULL, '男', NULL, NULL);
INSERT INTO `tab_user` VALUES (7, NULL, '123', '456', NULL, '男', NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
