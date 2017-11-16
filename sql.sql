-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.6.34-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 financial_genius 的数据库结构
CREATE DATABASE IF NOT EXISTS `financial_genius` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `financial_genius`;

-- 导出  表 financial_genius.adminstor 结构
CREATE TABLE IF NOT EXISTS `adminstor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adminstorName` varchar(255) DEFAULT NULL,
  `adminstorPassword` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- 正在导出表  financial_genius.adminstor 的数据：~3 rows (大约)
DELETE FROM `adminstor`;
/*!40000 ALTER TABLE `adminstor` DISABLE KEYS */;
INSERT INTO `adminstor` (`id`, `adminstorName`, `adminstorPassword`) VALUES
	(1, '邓红林', '123456'),
	(2, '尤华', '1234567'),
	(3, '周畑亦', '123456');
/*!40000 ALTER TABLE `adminstor` ENABLE KEYS */;

-- 导出  表 financial_genius.balance 结构
CREATE TABLE IF NOT EXISTS `balance` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `income` double DEFAULT '0',
  `transfer` double DEFAULT '0',
  `userBalance` double DEFAULT '1000',
  `cardNumber` varchar(50) DEFAULT '0',
  `payword` varchar(50) DEFAULT '0',
  `cardType` varchar(50) DEFAULT '0',
  `msg` varchar(50) DEFAULT '0',
  `user_id` int(11) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `FK__user1` (`user_id`),
  CONSTRAINT `FK__user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- 正在导出表  financial_genius.balance 的数据：~4 rows (大约)
DELETE FROM `balance`;
/*!40000 ALTER TABLE `balance` DISABLE KEYS */;
INSERT INTO `balance` (`id`, `income`, `transfer`, `userBalance`, `cardNumber`, `payword`, `cardType`, `msg`, `user_id`) VALUES
	(1, 0, 0, 1e21, '6222023803013297860', '0', '工商银行', '添加成功', 3),
	(5, 0, 0, 1200, '256153513516', '0', '邮政储蓄', '添加成功', 4),
	(6, 0, 0, 1000, '1', '0', '中国银行', '添加成功', 4),
	(10, 0, 0, 0, '6228241196005656979', '0', '中国银行', '添加成功', 8);
/*!40000 ALTER TABLE `balance` ENABLE KEYS */;

-- 导出  表 financial_genius.bank_card 结构
CREATE TABLE IF NOT EXISTS `bank_card` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `balance` double NOT NULL,
  `cardName` varchar(255) DEFAULT NULL,
  `cardNum` varchar(255) DEFAULT NULL,
  `cardPwd` int(11) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_be8se6b3aas8enka2rp4wsqps` (`userid`),
  CONSTRAINT `FK_be8se6b3aas8enka2rp4wsqps` FOREIGN KEY (`userid`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  financial_genius.bank_card 的数据：~0 rows (大约)
DELETE FROM `bank_card`;
/*!40000 ALTER TABLE `bank_card` DISABLE KEYS */;
/*!40000 ALTER TABLE `bank_card` ENABLE KEYS */;

-- 导出  表 financial_genius.card 结构
CREATE TABLE IF NOT EXISTS `card` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `balance` double NOT NULL,
  `cardName` varchar(255) DEFAULT NULL,
  `cardNum` varchar(255) DEFAULT NULL,
  `cardPwd` int(11) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_e1k36ary6fqfwu0n4wnhdmppo` (`userid`),
  CONSTRAINT `FK_e1k36ary6fqfwu0n4wnhdmppo` FOREIGN KEY (`userid`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  financial_genius.card 的数据：~0 rows (大约)
DELETE FROM `card`;
/*!40000 ALTER TABLE `card` DISABLE KEYS */;
/*!40000 ALTER TABLE `card` ENABLE KEYS */;

-- 导出  表 financial_genius.friends 结构
CREATE TABLE IF NOT EXISTS `friends` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `friendAccount` varchar(50) NOT NULL,
  `start` int(11) NOT NULL DEFAULT '0',
  `myAccount` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- 正在导出表  financial_genius.friends 的数据：~2 rows (大约)
DELETE FROM `friends`;
/*!40000 ALTER TABLE `friends` DISABLE KEYS */;
INSERT INTO `friends` (`id`, `friendAccount`, `start`, `myAccount`) VALUES
	(1, '18288222212', 0, '0'),
	(2, '18288222212', 1, '0');
/*!40000 ALTER TABLE `friends` ENABLE KEYS */;

-- 导出  表 financial_genius.loan 结构
CREATE TABLE IF NOT EXISTS `loan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `loanMoney` double NOT NULL DEFAULT '500',
  `loanDate` varchar(50) DEFAULT NULL,
  `repayment` varchar(50) DEFAULT NULL,
  `userName` varchar(50) DEFAULT NULL,
  `processState` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- 正在导出表  financial_genius.loan 的数据：~9 rows (大约)
DELETE FROM `loan`;
/*!40000 ALTER TABLE `loan` DISABLE KEYS */;
INSERT INTO `loan` (`id`, `loanMoney`, `loanDate`, `repayment`, `userName`, `processState`) VALUES
	(1, 500, '2017-11-05', '2017-12-05', '老邓头', 1),
	(2, 500, '2017-10-06', '2017-13-05', 'denghongl', 1),
	(3, 1000, '2018-08-24', NULL, NULL, 1),
	(4, 200, '2018-08-24', NULL, NULL, 0),
	(5, 200, '2018-08-24', NULL, NULL, 0),
	(6, 100, '2018-08-24', NULL, '56465', 0),
	(7, 100, '2018-08-24', NULL, '周畑亦', 1),
	(8, 100, '2018-08-24', NULL, '周畑亦', 1),
	(9, 100, '2018-08-24', NULL, '周畑亦', 0);
/*!40000 ALTER TABLE `loan` ENABLE KEYS */;

-- 导出  表 financial_genius.message 结构
CREATE TABLE IF NOT EXISTS `message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sendName` varchar(50) NOT NULL,
  `receptionName` varchar(50) NOT NULL,
  `messages` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  financial_genius.message 的数据：~0 rows (大约)
DELETE FROM `message`;
/*!40000 ALTER TABLE `message` DISABLE KEYS */;
/*!40000 ALTER TABLE `message` ENABLE KEYS */;

-- 导出  表 financial_genius.records 结构
CREATE TABLE IF NOT EXISTS `records` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tradeAccount` double NOT NULL,
  `tradeDate` date DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_bl9unf35cq98f7wdugsbs51og` (`userid`),
  CONSTRAINT `FK_bl9unf35cq98f7wdugsbs51og` FOREIGN KEY (`userid`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8;

-- 正在导出表  financial_genius.records 的数据：~53 rows (大约)
DELETE FROM `records`;
/*!40000 ALTER TABLE `records` DISABLE KEYS */;
INSERT INTO `records` (`id`, `tradeAccount`, `tradeDate`, `userid`) VALUES
	(1, 5000, '2015-01-22', 1),
	(2, -90, '2015-01-24', 1),
	(3, 1000, '2015-02-28', 1),
	(4, -100, '2015-02-19', 1),
	(5, -200, '2015-03-23', 1),
	(6, 500, '2015-03-23', 1),
	(7, -700, '2015-03-26', 1),
	(8, 22, '2015-04-09', 1),
	(9, -34, '2015-04-11', 1),
	(10, -300, '2015-05-22', 1),
	(11, 567, '2015-05-23', 1),
	(12, -234, '2015-06-22', 1),
	(13, 200, '2015-06-22', 1),
	(14, -1050, '2015-07-09', 1),
	(15, 100, '2015-07-11', 1),
	(16, 600, '2015-08-19', 1),
	(17, -300, '2015-08-25', 1),
	(18, -500, '2015-09-26', 1),
	(19, 100, '2015-09-27', 1),
	(20, -400, '2015-09-28', 1),
	(21, 3500, '2015-09-17', 1),
	(22, -2800, '2015-09-28', 1),
	(23, 678, '2015-10-10', 1),
	(24, -340, '2015-10-12', 1),
	(25, 899, '2015-10-21', 1),
	(26, 100, '2015-11-07', 1),
	(27, -450, '2015-11-22', 1),
	(28, 300, '2015-12-22', 1),
	(29, -400, '2015-12-22', 1),
	(30, 300, '2016-01-24', 1),
	(31, -1255, '2016-01-25', 1),
	(32, 400, '2016-02-17', 1),
	(33, -345, '2016-02-25', 1),
	(34, -130, '2016-03-22', 1),
	(35, 1000, '2016-03-22', 1),
	(36, -1000, '2016-04-06', 1),
	(37, 400, '2016-04-07', 1),
	(38, -678, '2016-05-24', 1),
	(39, 600, '2015-05-26', 1),
	(40, -500, '2016-06-27', 1),
	(41, 1000, '2016-06-27', 1),
	(42, -500, '2016-07-09', 1),
	(43, 100, '2016-07-11', 1),
	(44, -400, '2016-08-14', 1),
	(45, 300, '2016-08-26', 1),
	(50, 100, '2016-09-14', 1),
	(51, -100, '2016-09-25', 1),
	(52, 111, '2016-10-22', 1),
	(53, -100, '2016-10-22', 1),
	(54, -1000, '2016-11-16', 1),
	(55, 300, '2016-11-22', 1),
	(56, -1000, '2016-12-22', 1),
	(57, 1000, '2016-12-22', 1);
/*!40000 ALTER TABLE `records` ENABLE KEYS */;

-- 导出  表 financial_genius.system 结构
CREATE TABLE IF NOT EXISTS `system` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `application` int(11) DEFAULT NULL,
  `systemMsg` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  financial_genius.system 的数据：~0 rows (大约)
DELETE FROM `system`;
/*!40000 ALTER TABLE `system` DISABLE KEYS */;
/*!40000 ALTER TABLE `system` ENABLE KEYS */;

-- 导出  表 financial_genius.system_message 结构
CREATE TABLE IF NOT EXISTS `system_message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `messages` varchar(50) DEFAULT NULL,
  `userName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- 正在导出表  financial_genius.system_message 的数据：~14 rows (大约)
DELETE FROM `system_message`;
/*!40000 ALTER TABLE `system_message` DISABLE KEYS */;
INSERT INTO `system_message` (`id`, `title`, `messages`, `userName`) VALUES
	(1, 'a', 'afa', '1'),
	(2, 'a', 'afa', '1'),
	(3, '还款通知', '请于2017.12.6号前偿还贷款', '邓红林'),
	(4, '还款通知', '请于2017.12.6号前偿还贷款', '老邓头1'),
	(5, '1', '1', '1'),
	(6, '1', '1', '1'),
	(7, '', 'afaf', ''),
	(8, '', 'sfda', ''),
	(9, '', 'sfda', ''),
	(10, '', '', ''),
	(11, '', '', ''),
	(12, '', '', ''),
	(13, '1', '1', '1'),
	(14, '你最胖', '如题', '尤华');
/*!40000 ALTER TABLE `system_message` ENABLE KEYS */;

-- 导出  表 financial_genius.treasure 结构
CREATE TABLE IF NOT EXISTS `treasure` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `totalMoney` double DEFAULT '0',
  `ableMoney` double DEFAULT '0',
  `disableMoney` double DEFAULT '0',
  `outMoney` double DEFAULT '0',
  `inMoney` double DEFAULT '0',
  `totalProfit` double DEFAULT '0',
  `dayProfit` double DEFAULT '0',
  `user_id` int(11) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `FK__user` (`user_id`),
  CONSTRAINT `FK__user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- 正在导出表  financial_genius.treasure 的数据：~5 rows (大约)
DELETE FROM `treasure`;
/*!40000 ALTER TABLE `treasure` DISABLE KEYS */;
INSERT INTO `treasure` (`id`, `totalMoney`, `ableMoney`, `disableMoney`, `outMoney`, `inMoney`, `totalProfit`, `dayProfit`, `user_id`) VALUES
	(1, 300, 300, 0, 0, 0, 200, 0.547945205479452, 3),
	(2, 300, 300, 0, 0, 0, 200, 0.547945205479452, 4),
	(3, 0, 0, 0, 0, 0, 0, 0, 1),
	(4, 0, 0, 0, 0, 0, 0, 0, 6),
	(5, 0, 0, 0, 0, 0, 0, 0, 8);
/*!40000 ALTER TABLE `treasure` ENABLE KEYS */;

-- 导出  表 financial_genius.user 结构
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `balance` double DEFAULT '500',
  `email` varchar(255) DEFAULT NULL,
  `idNumber` varchar(255) DEFAULT NULL,
  `income` double DEFAULT NULL,
  `loginAccount` varchar(255) DEFAULT NULL,
  `nickName` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `profit` double DEFAULT NULL,
  `cardNumber` varchar(50) DEFAULT NULL,
  `msg` varchar(50) DEFAULT NULL,
  `constellations` varchar(50) DEFAULT NULL,
  `payword` varchar(255) DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `company` varchar(255) DEFAULT NULL,
  `labelling` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `hobby` varchar(50) DEFAULT NULL,
  `occupation` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- 正在导出表  financial_genius.user 的数据：~9 rows (大约)
DELETE FROM `user`;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `address`, `balance`, `email`, `idNumber`, `income`, `loginAccount`, `nickName`, `password`, `profit`, `cardNumber`, `msg`, `constellations`, `payword`, `sex`, `state`, `userName`, `company`, `labelling`, `age`, `hobby`, `occupation`) VALUES
	(1, NULL, 1000, NULL, '6516', 0, '15314578641', NULL, '123456', NULL, NULL, '登录成功', NULL, '641615', '男', 0, '56465', NULL, NULL, NULL, NULL, NULL),
	(2, NULL, 2500, NULL, '6516', 0, '13245678452', NULL, '123456', NULL, NULL, NULL, NULL, '641615', '男', 0, '56465', NULL, NULL, NULL, NULL, NULL),
	(3, '重庆潼南', 300, NULL, '1513161561', NULL, '18285139421', NULL, '123321', 0, NULL, '登录成功', NULL, '123456', '男', 0, '尤华', NULL, NULL, 0, NULL, NULL),
	(4, NULL, 500, NULL, NULL, NULL, '13245998466', NULL, '132459', NULL, NULL, '登录成功', NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, NULL),
	(5, NULL, 0, NULL, NULL, NULL, '12345678910', NULL, '123456', NULL, NULL, '登录成功', NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, NULL),
	(6, NULL, 1100, NULL, NULL, NULL, '18984240332', NULL, '123456', NULL, NULL, '登录成功', NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, NULL),
	(7, NULL, 0, NULL, NULL, NULL, '17685321721', NULL, '123456', NULL, NULL, '注册成功', NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, NULL),
	(8, '凤仪镇桃园社区', 1200, '3094@qq.com', NULL, NULL, '18285259742', NULL, '123456', NULL, NULL, '登录成功', '白羊座', NULL, '男', 1, '周畑亦', 'hp', '酷', 12, '阿斯大苏打', '学生'),
	(9, NULL, 0, NULL, NULL, NULL, '12345678901', NULL, '111111', NULL, NULL, '注册成功', NULL, NULL, NULL, 0, NULL, NULL, NULL, NULL, NULL, NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
