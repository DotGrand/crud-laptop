CREATE DATABASE  IF NOT EXISTS `laptopdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `laptopdb`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: laptopdb
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `characteristic`
--

DROP TABLE IF EXISTS `characteristic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `characteristic` (
  `id` int NOT NULL AUTO_INCREMENT,
  `screen_diagonal` varchar(25) DEFAULT NULL,
  `memory` varchar(30) DEFAULT NULL,
  `cores` varchar(30) DEFAULT NULL,
  `processor` varchar(60) DEFAULT NULL,
  `graphics` varchar(40) DEFAULT NULL,
  `storage` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `characteristic`
--

LOCK TABLES `characteristic` WRITE;
/*!40000 ALTER TABLE `characteristic` DISABLE KEYS */;
INSERT INTO `characteristic` VALUES (1,'14','16 GB','4','Intel Core i5-11320H (3.2 - 4.5 GHz)',' nVidia GeForce MX450','512 GB SSD'),(2,'15.6','16 GB','2',' Intel Pentium Gold 6805 (1.1 - 3.0 GHz)','Intel UHD Graphics','256 GB SSD'),(3,'15.6','8 GB','2','Intel Core i3-1115G4 (1.7 - 4.1 GHz)','Intel UHD Graphics','256 GB SSD'),(4,'14','16 GB','8',' AMD Ryzen 7 5700U (1.8 - 4.3 GHz)','AMD Radeon','512 GB SSD'),(5,' 16.2','16 GB','10','Apple M1 Pro',' Apple M1 Graphics','512 GB SSD'),(6,'13.3','16 GB','8',' Apple M1',' Apple M1 Graphics','256 GB SSD');
/*!40000 ALTER TABLE `characteristic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `laptop`
--

DROP TABLE IF EXISTS `laptop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `laptop` (
  `id` int NOT NULL AUTO_INCREMENT,
  `model` varchar(130) DEFAULT NULL,
  `producing_country` varchar(64) DEFAULT NULL,
  `characteristic_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `characteristic_id` (`characteristic_id`),
  CONSTRAINT `laptop_ibfk_1` FOREIGN KEY (`characteristic_id`) REFERENCES `characteristic` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laptop`
--

LOCK TABLES `laptop` WRITE;
/*!40000 ALTER TABLE `laptop` DISABLE KEYS */;
INSERT INTO `laptop` VALUES (1,'Mi RedmiBookPro 14Pli5','China',1),(2,'ASUS X515JA-EJ2803 (90NB0SR3-M02P30)','China',2),(3,'Acer Aspire 5 A515-56 (NX.A1HEU.00Q)','China',3),(4,'Mi RedmiBook Pro 14 (JYU4322CN-1)','China',4),(5,'Apple MacBook Pro 16','USA',5),(6,'Apple MacBook Air 13 M1 (MGN63)','USA',6);
/*!40000 ALTER TABLE `laptop` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-26 18:59:29
