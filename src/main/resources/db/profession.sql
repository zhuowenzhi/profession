/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : profession

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2020-03-10 16:15:55
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
  `comment_count` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('13', '38', '1', '12', '1583478136200', '1583478136200', '0', '回复运行成功啦', '0');
INSERT INTO `comment` VALUES ('14', '38', '1', '12', '1583478245135', '1583478245135', '0', '回复啦啦啦啦啦啦啦啦啦啦啦啦啦啦', '0');
INSERT INTO `comment` VALUES ('15', '39', '1', '12', '1583478293566', '1583478293566', '0', '破0', '2');
INSERT INTO `comment` VALUES ('16', '39', '1', '12', '1583478301684', '1583478301684', '0', '破1', '5');
INSERT INTO `comment` VALUES ('17', '38', '1', '12', '1583484244807', '1583484244807', '0', '烦烦烦', '2');
INSERT INTO `comment` VALUES ('18', '16', '2', '12', '1583513069382', '1583513069382', '0', '零零零零', '0');
INSERT INTO `comment` VALUES ('19', '16', '2', '12', '1583515698680', '1583515698680', '0', '零零零零', '0');
INSERT INTO `comment` VALUES ('20', '16', '2', '12', '1583515708671', '1583515708671', '0', '啦啦啦啦啦', '0');
INSERT INTO `comment` VALUES ('21', '15', '2', '12', '1583515739343', '1583515739343', '0', '二级评论哦', '0');
INSERT INTO `comment` VALUES ('22', '17', '2', '12', '1583517810148', '1583517810148', '0', '111', '0');
INSERT INTO `comment` VALUES ('23', '14', '2', '12', '1583517826658', '1583517826658', '0', '111', '0');
INSERT INTO `comment` VALUES ('24', '17', '2', '12', '1583517934185', '1583517934185', '0', '2222', '0');
INSERT INTO `comment` VALUES ('43', '38', '1', '12', '1583563117091', '1583563117091', null, '提交回复出现问题', null);
INSERT INTO `comment` VALUES ('44', '47', '1', '12', '1583565251022', '1583565251022', null, '回复有数量吗', null);
INSERT INTO `comment` VALUES ('50', '52', '1', '12', '1583741579863', '1583741579863', null, '通知', null);
INSERT INTO `comment` VALUES ('51', '38', '1', '12', '1583750363477', '1583750363477', null, '我实现的', null);
INSERT INTO `comment` VALUES ('52', '54', '1', '12', '1583751269972', '1583751269972', null, '回复看看', null);

-- ----------------------------
-- Table structure for `notification`
-- ----------------------------
DROP TABLE IF EXISTS `notification`;
CREATE TABLE `notification` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `notifier` bigint(20) NOT NULL,
  `notifier_name` varchar(255) DEFAULT NULL,
  `receiver` bigint(20) NOT NULL,
  `outer_id` bigint(20) NOT NULL COMMENT '外键id',
  `type` int(11) NOT NULL COMMENT '区分评论还是回复',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '已读未读状态',
  `gmt_create` bigint(20) NOT NULL,
  `outer_title` varchar(50) DEFAULT NULL,
  `typeName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notification
-- ----------------------------
INSERT INTO `notification` VALUES ('1', '12', 'Spring MVC', '12', '52', '1', '0', '1583741579865', 'zwz', null);
INSERT INTO `notification` VALUES ('2', '12', '测试怎么学习', '12', '38', '1', '1', '1583750363488', 'zwz', null);
INSERT INTO `notification` VALUES ('3', '12', '我提交一个问题', '12', '54', '1', '1', '1583751269983', 'zwz', null);

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
  `tag` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of question
-- ----------------------------
INSERT INTO `question` VALUES ('38', '测试怎么学习', '**怎么样*实现那***', '1583410148387', '1583750238563', '12', '96', '5', '0', '测试工程师');
INSERT INTO `question` VALUES ('39', '问题2', '问题2问题2问题2问题2', '1583410163157', '1583410163157', '12', '38', '2', '0', '问题2标签');
INSERT INTO `question` VALUES ('40', '信息想你想你想你想你', '信息想你想你想你想你', '1583412113499', '1583478328956', '12', '13', '1', '0', '信息想你想你想你想你');
INSERT INTO `question` VALUES ('41', '怎么快速做完毕设', '怎么快速做完毕设', '1583478505468', '1583478505468', '12', '2', '0', '0', '天使加持');
INSERT INTO `question` VALUES ('42', '发布', '1', '1583479160198', '1583479160198', '12', '19', '1', '0', '1');
INSERT INTO `question` VALUES ('43', '测试id是否为null', '发现发布页面没有id', '1583479415638', '1583479415638', '12', '7', '0', '0', 'debug');
INSERT INTO `question` VALUES ('44', '测试id是否为null', '发现发布页面没有id', '1583479896568', '1583479896568', '12', '15', '2', '0', 'debug');
INSERT INTO `question` VALUES ('45', '测试debug', 'debug', '1583480034882', '1583480034882', '12', '0', '0', '0', 'debug');
INSERT INTO `question` VALUES ('46', 'Spring Java', 'Spring Java', '1583564171139', '1583564171139', '12', '1', '0', '0', 'Spring');
INSERT INTO `question` VALUES ('47', 'Spring MVC', 'Spring Java', '1583564189079', '1583564189079', '12', '11', '1', '0', 'Spring');
INSERT INTO `question` VALUES ('48', '你不知道的JS', 'js', '1583564470799', '1583564470799', '12', '6', '0', '0', '前端，js');
INSERT INTO `question` VALUES ('49', '测试标签', '测试标签', '1583571004782', '1583571004782', '12', '9', '0', '0', '测试标签1，测试标签2，测试标签3');
INSERT INTO `question` VALUES ('50', '前端开发', '标签', '1583590875064', '1583590875064', '12', '2', '0', '0', '前端开发,web前端,JavaScript,Flash开发,HTML5');
INSERT INTO `question` VALUES ('51', '如何学习前端开发', '要怎么样才能达到开发的岗位需求', '1583590917272', '1583591222897', '12', '5', '0', '0', '前端开发');
INSERT INTO `question` VALUES ('52', 'Spring MVC', 'Spring Java', '1583590935743', '1583590935743', '12', '12', '1', '0', '前端开发');
INSERT INTO `question` VALUES ('53', 'java代码', '```\r\n public Long unreadCount(Long userId) {\r\n        NotificationExample notificationExample = new NotificationExample();\r\n        notificationExample.createCriteria()\r\n                .andReceiverEqualTo(userId)\r\n                .andStatusEqualTo(NotificationStatusEnum.UNREAD.getStatus());\r\n        return notificationMapper.countByExample(notificationExample);\r\n\r\n    }\r\n```', '1583746377535', '1583746377535', '12', '7', '0', '0', 'Java');
INSERT INTO `question` VALUES ('54', '我提交一个问题', '提交看看![](/images/ucdn.png)\r\n有图片吗', '1583751246169', '1583753145654', '12', '6', '1', '0', '功能测试');

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
INSERT INTO `user` VALUES ('12', '26194285', 'zwz', '365a9276-544a-4011-be83-cf2e604012b3', '1582886551289', '1583750126744', 'https://avatars3.githubusercontent.com/u/26194285?v=4', null);
INSERT INTO `user` VALUES ('13', '27359316', null, 'a13df064-6af7-404a-91cc-cd497f31776c', '1583392105902', '1583392105902', 'https://avatars3.githubusercontent.com/u/27359316?v=4', null);
