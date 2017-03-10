-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: localhost    Database: stu_association
-- ------------------------------------------------------
-- Server version	5.6.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `associationactivitylist`
--

DROP TABLE IF EXISTS `associationactivitylist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `associationactivitylist` (
  `ActivityID` int(11) NOT NULL AUTO_INCREMENT,
  `ActivityName` varchar(20) NOT NULL,
  `ActivityPosition` varchar(20) NOT NULL,
  `ActivityPersonNum` int(11) DEFAULT NULL,
  `ActivityTime` date NOT NULL,
  `ActivityContent` varchar(150) DEFAULT NULL,
  `Association` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ActivityID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `associationactivitylist`
--

LOCK TABLES `associationactivitylist` WRITE;
/*!40000 ALTER TABLE `associationactivitylist` DISABLE KEYS */;
/*!40000 ALTER TABLE `associationactivitylist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `associationapplist`
--

DROP TABLE IF EXISTS `associationapplist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `associationapplist` (
  `AssoID` int(11) NOT NULL AUTO_INCREMENT,
  `AssoName` varchar(20) NOT NULL,
  `AssoPosition` varchar(20) NOT NULL,
  `AssoPersonNum` int(11) DEFAULT NULL,
  `AssoResClass` varchar(10) NOT NULL,
  `AssoResPhone` varchar(11) NOT NULL,
  `AssoResName` varchar(20) NOT NULL,
  `AssoIntroduce` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`AssoID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `associationapplist`
--

LOCK TABLES `associationapplist` WRITE;
/*!40000 ALTER TABLE `associationapplist` DISABLE KEYS */;
INSERT INTO `associationapplist` VALUES (1,'街舞社','艺术',100,'高三1班','18976102422','邓程夫','ssssssssssssss'),(2,'街舞社','艺术',200,'高三1班','18976102422','邓程夫','跳舞');
/*!40000 ALTER TABLE `associationapplist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `associationinformation`
--

DROP TABLE IF EXISTS `associationinformation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `associationinformation` (
  `AssoID` int(11) NOT NULL AUTO_INCREMENT,
  `AssoName` varchar(20) DEFAULT NULL,
  `AssoPosition` varchar(20) DEFAULT NULL,
  `AssoPersonNum` int(11) DEFAULT NULL,
  `AssoBuildDate` date DEFAULT NULL,
  `AssoResName` varchar(20) DEFAULT NULL,
  `AssoIntroduce` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`AssoID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `associationinformation`
--

LOCK TABLES `associationinformation` WRITE;
/*!40000 ALTER TABLE `associationinformation` DISABLE KEYS */;
/*!40000 ALTER TABLE `associationinformation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `associationpersonlist`
--

DROP TABLE IF EXISTS `associationpersonlist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `associationpersonlist` (
  `AssoPersonID` int(11) NOT NULL AUTO_INCREMENT,
  `AssoPersonCode` varchar(20) NOT NULL,
  `AssoPersonPassword` varchar(20) NOT NULL,
  `AssoPersonName` varchar(20) DEFAULT NULL,
  `AssoPersonSex` varchar(2) DEFAULT NULL,
  `AssoPersonAge` int(11) DEFAULT NULL,
  `AssoPersonEmail` varchar(30) DEFAULT NULL,
  `AssoPersonPhone` varchar(11) DEFAULT NULL,
  `AssoPersonPosition` varchar(15) DEFAULT NULL,
  `AssoPersonCollege` varchar(20) DEFAULT NULL,
  `Association` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`AssoPersonID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `associationpersonlist`
--

LOCK TABLES `associationpersonlist` WRITE;
/*!40000 ALTER TABLE `associationpersonlist` DISABLE KEYS */;
/*!40000 ALTER TABLE `associationpersonlist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `associationrespeople`
--

DROP TABLE IF EXISTS `associationrespeople`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `associationrespeople` (
  `AssoResID` int(11) NOT NULL AUTO_INCREMENT,
  `AssoResCode` varchar(20) NOT NULL,
  `AssoResPassword` varchar(20) NOT NULL,
  `AssoResName` varchar(20) DEFAULT NULL,
  `AssoResSex` varchar(2) DEFAULT NULL,
  `AssoResAge` int(11) DEFAULT NULL,
  `AssoResEmail` varchar(30) DEFAULT NULL,
  `AssoResPhone` varchar(11) DEFAULT NULL,
  `AssoResPosition` varchar(15) DEFAULT NULL,
  `AssoResClass` varchar(20) DEFAULT NULL,
  `Association` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`AssoResID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `associationrespeople`
--

LOCK TABLES `associationrespeople` WRITE;
/*!40000 ALTER TABLE `associationrespeople` DISABLE KEYS */;
INSERT INTO `associationrespeople` VALUES (1,'w1sw','123456','航行','男',21,'12312@163.com','123456789','社长','计算机学院','热舞社');
/*!40000 ALTER TABLE `associationrespeople` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `newslist`
--

DROP TABLE IF EXISTS `newslist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `newslist` (
  `NewsID` int(11) NOT NULL AUTO_INCREMENT,
  `NewsDate` date NOT NULL,
  `NewsCurrentAddress` varchar(20) NOT NULL,
  `NewsAuthor` varchar(20) NOT NULL,
  `NewsContent` varchar(150) NOT NULL,
  `NewsTitle` varchar(20) NOT NULL,
  PRIMARY KEY (`NewsID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `newslist`
--

LOCK TABLES `newslist` WRITE;
/*!40000 ALTER TABLE `newslist` DISABLE KEYS */;
/*!40000 ALTER TABLE `newslist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `newusers`
--

DROP TABLE IF EXISTS `newusers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `newusers` (
  `UsersID` int(11) NOT NULL AUTO_INCREMENT,
  `UsersCode` varchar(20) NOT NULL,
  `UsersPassword` varchar(20) NOT NULL,
  `UsersName` varchar(20) DEFAULT NULL,
  `UsersSex` varchar(2) DEFAULT NULL,
  `UsersAge` int(11) DEFAULT NULL,
  `UsersEmail` varchar(30) DEFAULT NULL,
  `UsersPhone` varchar(11) DEFAULT NULL,
  `UsersClass` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`UsersID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `newusers`
--

LOCK TABLES `newusers` WRITE;
/*!40000 ALTER TABLE `newusers` DISABLE KEYS */;
INSERT INTO `newusers` VALUES (1,'zhangsan','123456','张三','男',30,'1233@163.com','1234567890','高三1班'),(2,'zhangsan','123456','张三','男',30,'1233@163.com','1234567890','高三1班'),(3,'zhangsan','123456','张三','男',30,'1233@163.com','1234567890','高三1班'),(4,'zhangsan','123456','李四','男',30,'1233@163.com','1234567890','高三1班'),(5,'zhangsan','123456','李四','男',30,'1233@163.com','1234567890','高三1班'),(6,'zhangsan','123456','李四','男',30,'1233@163.com','1234567890','高三1班'),(7,'wangwu','123','王五','男',18,'123@163.com','18976102422','高三1班');
/*!40000 ALTER TABLE `newusers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teacher` (
  `TeacherID` int(11) NOT NULL AUTO_INCREMENT,
  `TeacherName` varchar(20) NOT NULL,
  `TeacherCode` varchar(20) NOT NULL,
  `TeacherPassword` varchar(20) NOT NULL,
  `TeacherSex` varchar(2) DEFAULT NULL,
  `TeacherAge` int(11) DEFAULT NULL,
  `TeacherEmail` varchar(30) DEFAULT NULL,
  `TeacherPhone` varchar(11) DEFAULT NULL,
  `TeacherPosition` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`TeacherID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES (1,'张三','w1sw','123456','男',21,'123@163.com','18976102422','教务处'),(2,'李晓芳','w2sw','111111','女',21,'456@163.com','1887273423','教务处');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-03-14 16:57:55
