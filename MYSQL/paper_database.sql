/*
SQLyog Community v13.1.9 (64 bit)
MySQL - 8.0.34 : Database - paper
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`paper` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `paper`;

/*Table structure for table `cities` */

DROP TABLE IF EXISTS `cities`;

CREATE TABLE `cities` (
  `CID` int NOT NULL AUTO_INCREMENT,
  `NAME` varchar(200) NOT NULL,
  PRIMARY KEY (`CID`),
  UNIQUE KEY `CID` (`CID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `cities` */

insert  into `cities`(`CID`,`NAME`) values 
(1,'AGRA'),
(2,'BHOPAL'),
(3,'DELHI'),
(4,'NOIDA');

/*Table structure for table `city` */

DROP TABLE IF EXISTS `city`;

CREATE TABLE `city` (
  `cid` int NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  PRIMARY KEY (`cid`),
  UNIQUE KEY `cid` (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `city` */

insert  into `city`(`cid`,`name`) values 
(1,'balsore'),
(2,'cuttack'),
(3,'bhubaneswar'),
(4,'Jajpur');

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `COID` int NOT NULL AUTO_INCREMENT,
  `NAME` varchar(200) NOT NULL,
  PRIMARY KEY (`COID`),
  UNIQUE KEY `COID` (`COID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `course` */

insert  into `course`(`COID`,`NAME`) values 
(1,'PHP'),
(2,'JAVA'),
(3,'C++');

/*Table structure for table `employees` */

DROP TABLE IF EXISTS `employees`;

CREATE TABLE `employees` (
  `sid` int NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `city_id` int DEFAULT NULL,
  PRIMARY KEY (`sid`),
  UNIQUE KEY `sid` (`sid`),
  KEY `city_id` (`city_id`),
  CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`city_id`) REFERENCES `city` (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `employees` */

insert  into `employees`(`sid`,`name`,`city_id`) values 
(1,'Chandan',2),
(2,'Rajesh',3),
(3,'Suresh',2),
(4,'Ramesh',NULL);

/*Table structure for table `learners` */

DROP TABLE IF EXISTS `learners`;

CREATE TABLE `learners` (
  `LID` int NOT NULL AUTO_INCREMENT,
  `NAME` varchar(200) NOT NULL,
  `AGE` int NOT NULL,
  `COURSE_ID` int DEFAULT NULL,
  `CITY_ID` int DEFAULT NULL,
  PRIMARY KEY (`LID`),
  UNIQUE KEY `LID` (`LID`),
  KEY `CITY_ID` (`CITY_ID`),
  KEY `COURSE_ID` (`COURSE_ID`),
  CONSTRAINT `learners_ibfk_1` FOREIGN KEY (`CITY_ID`) REFERENCES `cities` (`CID`),
  CONSTRAINT `learners_ibfk_2` FOREIGN KEY (`COURSE_ID`) REFERENCES `course` (`COID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `learners` */

/*Table structure for table `students` */

DROP TABLE IF EXISTS `students`;

CREATE TABLE `students` (
  `id` int NOT NULL,
  `name` varchar(100) NOT NULL,
  `email` varchar(150) NOT NULL,
  `age` tinyint NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  UNIQUE KEY `email` (`email`),
  CONSTRAINT `students_chk_1` CHECK ((`age` >= 18))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `students` */

insert  into `students`(`id`,`name`,`email`,`age`,`status`) values 
(1,'chandan','chandan@gmail.com1',28,1),
(2,'ramesh','ramesh@gmail.com',28,1),
(5,'paresh','paresh@gmail.com',23,1),
(6,'Gajendra','gaj@gmail.com',24,1);

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int unsigned DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `email` varchar(150) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `contact` varchar(15) DEFAULT NULL,
  `address` text,
  `gender` enum('M','F','O') DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `dob` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `users` */

insert  into `users`(`id`,`name`,`email`,`password`,`contact`,`address`,`gender`,`status`,`dob`) values 
(1,'Ramesh','ramesh@gmail.com','12345678','8956785345','Balasore, Odisha','M',1,'1994-03-02'),
(1,'Ramesh','ramesh@gmail.com','12345678','8956785345','Balasore, Odisha','M',1,'1994-03-02'),
(2,'Ramesh','ramesh@gmail.com','12345678','8956785345','Balasore, Odisha','M',1,'1994-03-02'),
(3,'CHANDAN','chandan@gmail.com','12345678','98985685345','Balasore, Odisha','M',1,'1994-03-02'),
(4,'Rajesh','rajesh@gmail.com','12345678','4544565666','Balasore, Odisha','M',1,'1994-03-02'),
(4,'Ramesh','ramesh@gmail.com','12345678','8956785345','Balasore, Odisha','M',1,'1994-03-02'),
(5,'CHANDAN','chandan@gmail.com','12345678','98985685345','Balasore, Odisha','M',1,'1994-03-02'),
(6,'Rajesh','rajesh@gmail.com','12345678','4544565666','Balasore, Odisha','M',1,'1994-03-02');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
