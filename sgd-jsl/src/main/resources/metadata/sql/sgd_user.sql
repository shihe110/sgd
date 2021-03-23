/*
 Navicat Premium Data Transfer

 Source Server         : sgd
 Source Server Type    : MySQL
 Source Server Version : 50640
 Source Host           : localhost:3306
 Source Schema         : sgd

 Target Server Type    : MySQL
 Target Server Version : 50640
 File Encoding         : 65001

 Date: 10/02/2021 10:07:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sgd_user
-- ----------------------------
DROP TABLE IF EXISTS `sgd_user`;
CREATE TABLE `sgd_user`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `pass` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT '123456',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sgd_user
-- ----------------------------
INSERT INTO `sgd_user` VALUES (1, 'zhangsan', '123456');
INSERT INTO `sgd_user` VALUES (2, 'lisi', '123456');

SET FOREIGN_KEY_CHECKS = 1;
