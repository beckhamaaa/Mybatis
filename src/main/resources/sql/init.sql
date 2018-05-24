/*
Navicat MySQL Data Transfer

Source Server         : MYSQL
Source Server Version : 50533
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50533
File Encoding         : 65001

Date: 2018-05-25 00:19:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptno` int(6) NOT NULL AUTO_INCREMENT,
  `dname` varchar(20) DEFAULT NULL,
  `loc` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', '财务部', '北京A');
INSERT INTO `dept` VALUES ('2', '研发部', '上海AB');
INSERT INTO `dept` VALUES ('3', '销售部', '西安a');
INSERT INTO `dept` VALUES ('4', '业务部', '深圳abA');

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `empno` int(6) NOT NULL AUTO_INCREMENT,
  `ename` varchar(20) DEFAULT NULL,
  `job` varchar(20) DEFAULT NULL,
  `mgr` int(6) DEFAULT NULL,
  `hiredate` date DEFAULT NULL,
  `sal` double(7,2) DEFAULT NULL,
  `comm` double(7,2) DEFAULT NULL,
  `deptno` int(6) DEFAULT NULL,
  PRIMARY KEY (`empno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES ('7369', 'Smith', '职员', '7902', '1980-12-17', '800.00', null, '2');
INSERT INTO `emp` VALUES ('7499', 'Allen', '销售员', '7698', '1981-02-20', '1600.00', '300.00', '3');
INSERT INTO `emp` VALUES ('7521', 'Ward', '销售员', '7698', '1981-02-22', '1250.00', '500.00', '3');
INSERT INTO `emp` VALUES ('7566', 'Jones', '经理', '7839', '1981-04-02', '2975.00', null, '2');
INSERT INTO `emp` VALUES ('7654', 'Martin', '销售员', '7698', '1981-09-28', '1250.00', '1400.00', '3');
INSERT INTO `emp` VALUES ('7698', 'Blake', '经理', '7839', '1981-05-01', '2850.00', null, '3');
INSERT INTO `emp` VALUES ('7782', 'Clark', '经理', '7839', '1981-06-09', '2450.00', null, '1');
INSERT INTO `emp` VALUES ('7788', 'Scott', '分析师', '7566', '1987-04-19', '3000.00', null, '2');
INSERT INTO `emp` VALUES ('7839', 'King', '总经理', null, '1981-11-17', '5000.00', null, '1');
INSERT INTO `emp` VALUES ('7844', 'Turner', '销售员', '7698', '1981-11-18', '1500.00', null, '3');
INSERT INTO `emp` VALUES ('7876', 'Adams', '职员', '7788', '1981-11-19', '1100.00', null, '2');
INSERT INTO `emp` VALUES ('7900', 'James', '职员', '7698', '1981-11-20', '950.00', null, '3');
INSERT INTO `emp` VALUES ('7902', 'Ford', '分析师', '7566', '1981-11-30', '3000.00', null, '2');
INSERT INTO `emp` VALUES ('7934', 'Miller', '职员', '7782', '1981-11-22', '1300.00', null, '1');
INSERT INTO `emp` VALUES ('8888', 'Torres', '经理', '7839', '1981-11-25', '2600.00', '400.00', '1');
INSERT INTO `emp` VALUES ('9999', 'Beckham', '分析师', '7839', '1981-12-17', '2600.00', '400.00', '2');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) DEFAULT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `birthday` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'fda', 'FD', '11', 'FDAS', '120');
INSERT INTO `t_user` VALUES ('10', 'wang888', 'FD', '30', 'FDAS', '120');
INSERT INTO `t_user` VALUES ('20', 'wang888', 'FD', '30', 'FDAS', '110');
