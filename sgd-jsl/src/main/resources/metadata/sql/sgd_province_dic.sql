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

 Date: 10/02/2021 10:06:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sgd_province_dic
-- ----------------------------
DROP TABLE IF EXISTS `sgd_province_dic`;
CREATE TABLE `sgd_province_dic`  (
  `id` int(11) NOT NULL COMMENT 'id',
  `p_code` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '代号',
  `full_name` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '全称',
  `half_full_name` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '半全称',
  `short_name` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '简称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sgd_province_dic
-- ----------------------------
INSERT INTO `sgd_province_dic` VALUES (1, 'BJ', '北京市', '北京', '京');
INSERT INTO `sgd_province_dic` VALUES (2, 'TJ', '天津市', '天津', '津');
INSERT INTO `sgd_province_dic` VALUES (3, 'HE', '河北省', '河北', '冀');
INSERT INTO `sgd_province_dic` VALUES (4, 'SX', '山西省', '山西', '晋');
INSERT INTO `sgd_province_dic` VALUES (5, 'NM', '内蒙古自治区', '内蒙古', '蒙');
INSERT INTO `sgd_province_dic` VALUES (6, 'LN', '辽宁省', '辽宁', '辽');
INSERT INTO `sgd_province_dic` VALUES (7, 'JL', '吉林省', '吉林', '吉');
INSERT INTO `sgd_province_dic` VALUES (8, 'HL', '黑龙江省', '黑龙江', '黑');
INSERT INTO `sgd_province_dic` VALUES (9, 'SH', '上海市', '上海', '沪');
INSERT INTO `sgd_province_dic` VALUES (10, 'JS', '江苏省', '江苏', '苏');
INSERT INTO `sgd_province_dic` VALUES (11, 'ZJ', '浙江省', '浙江', '浙');
INSERT INTO `sgd_province_dic` VALUES (12, 'AH', '安徽省', '安徽', '皖');
INSERT INTO `sgd_province_dic` VALUES (13, 'FJ', '福建省', '福建', '闽');
INSERT INTO `sgd_province_dic` VALUES (14, 'JX', '江西省', '江西', '赣');
INSERT INTO `sgd_province_dic` VALUES (15, 'SD', '山东省', '山东', '鲁');
INSERT INTO `sgd_province_dic` VALUES (16, 'HA', '河南省', '河南', '豫');
INSERT INTO `sgd_province_dic` VALUES (17, 'HB', '湖北省', '湖北', '鄂');
INSERT INTO `sgd_province_dic` VALUES (18, 'HN', '湖南省', '湖南', '湘');
INSERT INTO `sgd_province_dic` VALUES (19, 'GD', '广东省', '广东', '粤');
INSERT INTO `sgd_province_dic` VALUES (20, 'GX', '广西壮族自治区', '广西', '桂');
INSERT INTO `sgd_province_dic` VALUES (21, 'HI', '海南省', '海南', '琼');
INSERT INTO `sgd_province_dic` VALUES (22, 'SC', '四川省', '四川', '川');
INSERT INTO `sgd_province_dic` VALUES (23, 'GZ', '贵州省', '贵州', '黔');
INSERT INTO `sgd_province_dic` VALUES (24, 'YN', '云南省', '云南', '滇');
INSERT INTO `sgd_province_dic` VALUES (25, 'CQ', '重庆市', '重庆', '渝');
INSERT INTO `sgd_province_dic` VALUES (26, 'XZ', '西藏自治区', '西藏', '藏');
INSERT INTO `sgd_province_dic` VALUES (27, 'SN', '陕西省', '陕西', '陕');
INSERT INTO `sgd_province_dic` VALUES (28, 'GS', '甘肃省', '甘肃', '甘');
INSERT INTO `sgd_province_dic` VALUES (29, 'QH', '青海省', '青海', '青');
INSERT INTO `sgd_province_dic` VALUES (30, 'NX', '宁夏回族自治区', '宁夏', '宁');
INSERT INTO `sgd_province_dic` VALUES (31, 'XJ', '新疆维吾尔自治区', '新疆', '新');
INSERT INTO `sgd_province_dic` VALUES (32, 'TW', '台湾省', '台湾', '台');
INSERT INTO `sgd_province_dic` VALUES (33, 'XG', '香港特别行政区', '香港', '港');
INSERT INTO `sgd_province_dic` VALUES (34, 'AM', '澳门特别行政区', '澳门', '澳');

SET FOREIGN_KEY_CHECKS = 1;
