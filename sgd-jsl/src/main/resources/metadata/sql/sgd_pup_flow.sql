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

 Date: 10/02/2021 10:06:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sgd_pup_flow
-- ----------------------------
DROP TABLE IF EXISTS `sgd_pup_flow`;
CREATE TABLE `sgd_pup_flow`  (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `city` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '城市',
  `statistical_year` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '统计年度',
  `population_local` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '户籍人口',
  `population_long_term` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '常驻人口',
  `population_inflow_num` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '人口净流入量-万',
  `inflow_rt` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '净流入占比%',
  `economic_circle` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '经济圈',
  `province` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '省份',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sgd_pup_flow
-- ----------------------------
INSERT INTO `sgd_pup_flow` VALUES (1, '上海', '2019', '1469.3', '2428.14', '958.84', '39.49', '长三角', '上海');
INSERT INTO `sgd_pup_flow` VALUES (2, '深圳', '2019', '550.71', '1343.88', '793.17', '59.02', '珠三角', '广东');
INSERT INTO `sgd_pup_flow` VALUES (3, '北京', '2019', '1397.4', '2153.6', '756.2', '35.11', '京津冀', '北京');
INSERT INTO `sgd_pup_flow` VALUES (4, '东莞', '2019', '251.06', '846.45', '595.39', '70.34', '珠三角', '广东');
INSERT INTO `sgd_pup_flow` VALUES (5, '广州', '2019', '953.72', '1530.59', '576.87', '37.69', '珠三角', '广东');
INSERT INTO `sgd_pup_flow` VALUES (6, '天津', '2019', '1108.18', '1561.83', '453.65', '29.05', '京津冀', '天津');
INSERT INTO `sgd_pup_flow` VALUES (7, '佛山', '2019', '436.98', '790.57', '353.59', '44.73', '珠三角', '广东');
INSERT INTO `sgd_pup_flow` VALUES (8, '苏州', '2019', '722.6', '1074.99', '352.39', '32.78', '长三角', '江苏');
INSERT INTO `sgd_pup_flow` VALUES (9, '宁波', '2019', '608.47', '854.2', '245.73', '28.77', '长三角', '浙江');
INSERT INTO `sgd_pup_flow` VALUES (10, '杭州', '2019', '795.37', '1036', '240.63', '23.23', '长三角', '浙江');
INSERT INTO `sgd_pup_flow` VALUES (11, '武汉', '2019', '906.4', '1121.2', '214.8', '19.16', '内陆沿江', '湖北');
INSERT INTO `sgd_pup_flow` VALUES (12, '厦门', '2019', '261.1', '429', '167.9', '39.14', '东南沿海', '福建');
INSERT INTO `sgd_pup_flow` VALUES (13, '成都', '2019', '1500.07', '1658.1', '158.03', '9.53', '西南沿江', '四川');
INSERT INTO `sgd_pup_flow` VALUES (14, '无锡', '2019', '502.83', '659.15', '156.32', '45.89', '长三角', '江苏');
INSERT INTO `sgd_pup_flow` VALUES (15, '中山', '2019', '182.89', '338', '155.11', '45.89', '珠三角', '广东');
INSERT INTO `sgd_pup_flow` VALUES (16, '郑州', '2019', '881.6', '1035.2', '153.6', '14.84', '中原', '河南');
INSERT INTO `sgd_pup_flow` VALUES (17, '南京', '2019', '709.82', '850.55', '140.73', '16.55', '中部沿江', '江苏');
INSERT INTO `sgd_pup_flow` VALUES (18, '哈尔滨', '2019', '951.34', '1076.3', '124.96', '11.61', '东北内陆', '黑龙江');
INSERT INTO `sgd_pup_flow` VALUES (19, '青岛', '2019', '831.07', '949.98', '118.91', '12.52', '东部沿海', '山东');
INSERT INTO `sgd_pup_flow` VALUES (20, '昆明', '2019', '578.46', '695', '116.54', '16.77', '西南内陆', '云南');
INSERT INTO `sgd_pup_flow` VALUES (21, '泉州', '2019', '760.7', '874', '113.3', '12.96', '东南沿海', '福建');
INSERT INTO `sgd_pup_flow` VALUES (22, '嘉兴', '2019', '363.7', '480', '116.3', '24.23', '长三角', '浙江');
INSERT INTO `sgd_pup_flow` VALUES (23, '大连', '2019', '598.69', '700.2', '101.51', '14.5', '东北沿海', '辽宁');
INSERT INTO `sgd_pup_flow` VALUES (24, '长沙', '2019', '738.24', '839.45', '101.21', '12.06', '长株潭', '湖南');

SET FOREIGN_KEY_CHECKS = 1;
