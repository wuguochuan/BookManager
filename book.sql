/*
 Navicat Premium Data Transfer

 Source Server         : Mysql
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : book

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 23/12/2021 11:55:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_book
-- ----------------------------
DROP TABLE IF EXISTS `t_book`;
CREATE TABLE `t_book`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `bookName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `author` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` float(20, 2) NULL DEFAULT NULL,
  `bookTypeId` int(0) NULL DEFAULT NULL,
  `bookDesc` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `book_ibkf_1`(`bookTypeId`) USING BTREE,
  CONSTRAINT `book_ibkf_1` FOREIGN KEY (`bookTypeId`) REFERENCES `t_booktype` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_book
-- ----------------------------
INSERT INTO `t_book` VALUES (6, 'java编程思想', 'Bruce Eckel', '男', 54.99, 13, '本书赢得了全球程序员的广泛赞誉。');
INSERT INTO `t_book` VALUES (7, 'java核心技术卷I', 'Cay S.Horstmann', '男', 79.98, 13, 'Java核心技术卷1:基础知识 ');
INSERT INTO `t_book` VALUES (8, '一个人世界杯 ', '费翔', '男', 52.00, 12, '你不是一个人世界杯 黄健翔 / 2014-06-01');
INSERT INTO `t_book` VALUES (9, '足球与科学', '赖利', '男', 23.52, 12, '足球与科学- (第2版) （英）赖利，（英）威廉姆斯 主编');
INSERT INTO `t_book` VALUES (10, '观看之道', '约翰·伯格', '女', 99.49, 15, '带给我的艺术在社会学、人类学中的思考是非常有哲学意味');

-- ----------------------------
-- Table structure for t_booktype
-- ----------------------------
DROP TABLE IF EXISTS `t_booktype`;
CREATE TABLE `t_booktype`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `bookTypeName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `bookTypeDesc` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_booktype
-- ----------------------------
INSERT INTO `t_booktype` VALUES (12, '体育类', '体育相关书籍');
INSERT INTO `t_booktype` VALUES (13, '计算机类', '计算机相关书籍');
INSERT INTO `t_booktype` VALUES (14, '数学类', '数学相关书籍');
INSERT INTO `t_booktype` VALUES (15, '艺术类', '艺术类书籍');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'user', '123456');
INSERT INTO `t_user` VALUES (2, 'root', '123456');

SET FOREIGN_KEY_CHECKS = 1;
