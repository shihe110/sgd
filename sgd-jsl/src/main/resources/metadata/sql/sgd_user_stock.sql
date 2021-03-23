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

 Date: 10/02/2021 10:07:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sgd_user_stock
-- ----------------------------
DROP TABLE IF EXISTS `sgd_user_stock`;
CREATE TABLE `sgd_user_stock`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `stock_code` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '代码',
  `user_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT 'userID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sgd_user_stock
-- ----------------------------
INSERT INTO `sgd_user_stock` VALUES (1, '515790', '1');
INSERT INTO `sgd_user_stock` VALUES (2, '515120', '1');
INSERT INTO `sgd_user_stock` VALUES (3, '588000', '1');
INSERT INTO `sgd_user_stock` VALUES (4, '512170', '1');
INSERT INTO `sgd_user_stock` VALUES (5, '510310', '1');
INSERT INTO `sgd_user_stock` VALUES (6, '159928', '1');
INSERT INTO `sgd_user_stock` VALUES (7, '510300', '1');
INSERT INTO `sgd_user_stock` VALUES (8, '510500', '1');
INSERT INTO `sgd_user_stock` VALUES (9, '510150', '1');

SET FOREIGN_KEY_CHECKS = 1;
