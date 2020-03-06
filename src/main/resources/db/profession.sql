/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : profession

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2020-03-05 23:19:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `comment`
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_id` bigint(20) NOT NULL,
  `type` int(11) NOT NULL COMMENT '父类类型\n',
  `commentator` bigint(20) NOT NULL COMMENT '评论人id',
  `gmt_create` bigint(20) NOT NULL COMMENT '创建时间',
  `gmt_modified` bigint(20) NOT NULL,
  `like_count` bigint(20) DEFAULT '0' COMMENT '点赞数',
  `content` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------

-- ----------------------------
-- Table structure for `question`
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `description` text,
  `gmt_create` bigint(20) DEFAULT NULL,
  `gmt_modified` bigint(20) DEFAULT NULL,
  `creator` bigint(20) DEFAULT NULL,
  `view_count` int(11) DEFAULT '0',
  `comment_count` int(11) DEFAULT '0',
  `like_count` int(11) DEFAULT '0',
  `tags` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of question
-- ----------------------------
INSERT INTO `question` VALUES ('38', '问题1', '问题1问题1问题1问题1', '1583410148387', '1583410148387', '12', '6', '0', '0', '问题1标签');
INSERT INTO `question` VALUES ('39', '问题2', '问题2问题2问题2问题2', '1583410163157', '1583410163157', '12', '0', '0', '0', '问题2标签');
INSERT INTO `question` VALUES ('40', 'qqqqqqqqqqqq', 'qqqqqqqq', '1583412113499', '1583412113499', '12', '0', '0', '0', 'qqqqqqq');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `account_id` varchar(100) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `token` char(36) DEFAULT NULL,
  `gmt_create` bigint(20) DEFAULT NULL,
  `gmt_modified` bigint(20) DEFAULT NULL,
  `avatar_url` varchar(255) DEFAULT NULL,
  `bio` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('12', '26194285', 'zwz', 'af56146f-e200-4b7e-906e-fd65c4a4aeae', '1582886551289', '1583393751431', 'https://avatars3.githubusercontent.com/u/26194285?v=4', null);
INSERT INTO `user` VALUES ('13', '27359316', null, 'a13df064-6af7-404a-91cc-cd497f31776c', '1583392105902', '1583392105902', 'https://avatars3.githubusercontent.com/u/27359316?v=4', null);
