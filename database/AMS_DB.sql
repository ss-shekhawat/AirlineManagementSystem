CREATE DATABASE  IF NOT EXISTS `airlinemanagementsystem` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `airlinemanagementsystem`;
-- MySQL dump 10.13  Distrib 8.0.45, for Win64 (x86_64)
--
-- Host: localhost    Database: airlinemanagementsystem
-- ------------------------------------------------------
-- Server version	8.0.45

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
-- Table structure for table `airmaster`
--

DROP TABLE IF EXISTS `airmaster`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `airmaster` (
  `airId` varchar(5) NOT NULL,
  `airName` varchar(20) DEFAULT NULL,
  `airMobNum` varchar(10) DEFAULT NULL,
  `airEmail` varchar(50) DEFAULT NULL,
  `airPinCode` decimal(6,0) DEFAULT NULL,
  `airAddress` varchar(100) DEFAULT NULL,
  `airCity` varchar(20) DEFAULT NULL,
  `airState` varchar(20) DEFAULT NULL,
  `airCountry` varchar(50) DEFAULT NULL,
  `airFleet` int DEFAULT NULL,
  `airEstDate` date DEFAULT NULL,
  `airRating` decimal(3,2) DEFAULT NULL,
  `airStatus` varchar(10) DEFAULT NULL,
  `airRemark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`airId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `airmaster`
--

LOCK TABLES `airmaster` WRITE;
/*!40000 ALTER TABLE `airmaster` DISABLE KEYS */;
INSERT INTO `airmaster` VALUES ('A001','Sky Airway','9876543210','ssssss@gmail.com',100010,'123 Sky Lane, New York, NY','New York','New York','India',300,'1996-06-08',4.50,'Active','No Remarks'),('A002','Oceanic Airlines','0000000000','info@oceanicairlines.com',941050,'456 Ocean Drive, San Francisco, CA','San Francisco','California','USA',45,'1985-08-10',4.50,'Active','Luxury Flights'),('A003','Global Jets','9345678901','support@globaljets.com',60601,'789 Global Blvd, Chicago, IL','Chicago','Illinois','USA',15,'2000-12-05',4.20,'Inactive','Premium'),('A004','Blue Sky Airlines','9234567890','contact@bluesky.com',90001,'101 Blue Sky Ave, Los Angeles, CA','Los Angeles','California','USA',25,'2010-01-01',4.00,'Active','Budget'),('A005','NorthWind Airways','9012345678','info@northwind.com',33101,'202 Northwind Street, Miami, FL','Miami','Florida','USA',20,'2005-05-25',4.30,'Active','Comfortable'),('A006','Swift Airlines','9123456780','support@swiftair.com',77001,'789 Swift Road, Houston, TX','Houston','Texas','USA',50,'1995-11-20',4.60,'Active','Fast Service'),('A007','SkyLuxe Airways','9345678902','contact@skyluxe.com',75201,'321 Luxe Blvd, Dallas, TX','Dallas','Texas','USA',35,'2008-09-15',4.80,'Active','Luxury'),('A008','Airlink Airlines','9876543211','info@airlink.com',2115,'123 Airlink Street, Boston, MA','Boston','Massachusetts','USA',20,'2012-01-01',4.40,'Active','Dependable'),('A009','JetBlue Airways','9156789123','support@jetblue.com',98101,'987 Blue Street, Seattle, WA','Seattle','Washington','USA',60,'1992-04-20',4.90,'Active','Best Value'),('A101','SkyJet Airways','9876543210','skyjet@gmail.com',110001,'Terminal 1, IGI Airport','Delhi','Delhi','India',25,'2005-01-01',4.50,'A','Active Airline'),('A102','Air India','9999999999','airindia@gmail.com',110001,'Delhi','Delhi','Delhi','India',30,'2005-01-01',4.20,'Active','Government Airline'),('A105','Air India','9999999999','airindia@gmail.com',110001,'Delhi','Delhi','Delhi','India',30,'2005-01-01',4.20,'Active','Government Airline');
/*!40000 ALTER TABLE `airmaster` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bookingpf`
--

DROP TABLE IF EXISTS `bookingpf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bookingpf` (
  `bkId` varchar(5) NOT NULL,
  `usrId` varchar(5) DEFAULT NULL,
  `fltId` varchar(5) DEFAULT NULL,
  `bkDate` date DEFAULT NULL,
  `bkDepDate` date DEFAULT NULL,
  `bkStatus` varchar(10) DEFAULT NULL,
  `bkRemark` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`bkId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookingpf`
--

LOCK TABLES `bookingpf` WRITE;
/*!40000 ALTER TABLE `bookingpf` DISABLE KEYS */;
INSERT INTO `bookingpf` VALUES ('B001','U001','F001','2025-07-01','2025-07-10','Completed','No Remarks'),('B002','U002','F002','2025-07-05','2025-07-12','Completed','No Remarks'),('B003','U003','F003','2025-07-07','2025-07-15','Cancelled','No Remarks'),('B004','U004','F004','2025-07-10','2025-07-20','Cancelled',' '),('B005','U005','F005','2025-07-12','2025-07-22','Completed','All good'),('B006','U006','F006','2025-07-15','2025-07-25','Cancelled','VIP booking'),('B007','U007','F007','2025-07-18','2025-07-28','Upcoming','Waitlisted'),('B008','U008','F008','2025-07-20','2025-07-30','Cancelled','Family'),('B101','U101','F101','2026-03-03','2026-03-10','U','Booked');
/*!40000 ALTER TABLE `bookingpf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `controltbl`
--

DROP TABLE IF EXISTS `controltbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `controltbl` (
  `ID` varchar(10) NOT NULL,
  `keyField1` varchar(10) DEFAULT NULL,
  `keyField2` varchar(10) DEFAULT NULL,
  `Value` varchar(10) DEFAULT NULL,
  `Description` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `controltbl`
--

LOCK TABLES `controltbl` WRITE;
/*!40000 ALTER TABLE `controltbl` DISABLE KEYS */;
INSERT INTO `controltbl` VALUES ('S001','India ','State','AP','Andhra Pradesh'),('S002','India ','State','ARR','Arunachal Pradesh'),('S003','India ','State','AS','Assam'),('S004','India ','State','BH','Bihar'),('S005','India ','State','CH','Chhattisgarh'),('S006','India ','State','GO','Goa'),('S007','India ','State','RJ','Rajasthan'),('S008','India','State','HR','Haryana'),('S009','abc','avc','123','1123');
/*!40000 ALTER TABLE `controltbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flightpf`
--

DROP TABLE IF EXISTS `flightpf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flightpf` (
  `fltId` varchar(5) NOT NULL,
  `airId` varchar(5) DEFAULT NULL,
  `fltRange` decimal(5,0) DEFAULT NULL,
  `fltFuelCap` decimal(6,0) DEFAULT NULL,
  `airModel` varchar(15) DEFAULT NULL,
  `fltTotSeat` decimal(3,0) DEFAULT NULL,
  `fltOrigin` varchar(20) DEFAULT NULL,
  `fltDest` varchar(20) DEFAULT NULL,
  `fltTkPrice` decimal(5,0) DEFAULT NULL,
  `fltArrTime` time DEFAULT NULL,
  `fltDepTime` time DEFAULT NULL,
  `fltEndTime` time DEFAULT NULL,
  `fltTotDur` time DEFAULT NULL,
  `fltCabBag` decimal(1,0) DEFAULT NULL,
  `fltMainBag` decimal(2,0) DEFAULT NULL,
  `fltStatus` varchar(1) DEFAULT NULL,
  `fltRemark` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`fltId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flightpf`
--

LOCK TABLES `flightpf` WRITE;
/*!40000 ALTER TABLE `flightpf` DISABLE KEYS */;
INSERT INTO `flightpf` VALUES ('','A001',NULL,NULL,'',NULL,'','',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('F001','A001',5000,20000,'Boeing',150,'Jaipur','Delhi',500,'12:00:00','10:00:00','14:30:00','06:30:00',5,25,'A','Comfortable'),('F002','A002',4500,18000,'Airbus A320',140,'Delhi','Mumbai',450,'15:00:00','13:00:00','17:00:00','04:00:00',5,20,'P','Luxury flight'),('F003','A003',4000,16000,'Boeing 777',160,'Mumbai','Goa',400,'18:00:00','16:00:00','19:30:00','03:30:00',5,30,'C','Business'),('F004','A004',3500,14000,'Embraer 175',120,'Goa','Jaipur',350,'20:00:00','18:00:00','21:30:00','03:30:00',5,15,'A','Budget flight'),('F005','A005',5500,22000,'Airbus A380',200,'Jaipur','Goa',600,'10:00:00','08:00:00','12:30:00','04:30:00',5,40,'A','Family-friendly'),('F006','A006',6000,25000,'Airbus A350',220,'Delhi','Dubai',550,'14:00:00','12:00:00','16:30:00','04:30:00',5,50,'A','Premium service'),('F007','A007',5200,20000,'Boeing 787',180,'Delhi','Jaipur',600,'10:00:00','08:00:00','12:30:00','04:30:00',5,35,'P','Luxury seats'),('F008','A008',4000,17000,'Airbus A319',150,'Boston','Chicago',400,'11:00:00','09:00:00','13:30:00','04:30:00',5,20,'A','Comfortable'),('F009','A009',5500,22000,'Boeing 747',240,'Seattle','San Francisco',700,'14:30:00','12:30:00','17:00:00','04:30:00',5,45,'A','Best for'),('F101','A101',2500,50000,'A320',180,'Delhi','Mumbai',5500,'12:00:00','10:00:00','12:00:00','02:00:00',7,20,'A','OnTime');
/*!40000 ALTER TABLE `flightpf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grievpf`
--

DROP TABLE IF EXISTS `grievpf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grievpf` (
  `grvId` varchar(5) NOT NULL,
  `usrId` varchar(5) DEFAULT NULL,
  `fltId` varchar(5) DEFAULT NULL,
  `Complaint` varchar(100) DEFAULT NULL,
  `Response` varchar(100) DEFAULT NULL,
  `Status` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`grvId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grievpf`
--

LOCK TABLES `grievpf` WRITE;
/*!40000 ALTER TABLE `grievpf` DISABLE KEYS */;
INSERT INTO `grievpf` VALUES ('C001','U001','F001','Not Clean','kuch nahi hai complain','Resolved'),('C002','U002','F001','Not Clean','jkjhkljkljkl','Resolved'),('C003','U003','F001','Not Clean',NULL,'Pending'),('C101','U101','F101','Flight was delayed by 2 hours','Sorry for inconvenience','R');
/*!40000 ALTER TABLE `grievpf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loginpf`
--

DROP TABLE IF EXISTS `loginpf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loginpf` (
  `userId` varchar(5) NOT NULL,
  `userPass` varchar(20) DEFAULT NULL,
  `userRole` varchar(10) DEFAULT NULL,
  `lastLogin` date DEFAULT NULL,
  `userQstn` varchar(30) DEFAULT NULL,
  `userAnswr` varchar(30) DEFAULT NULL,
  `Remark` varchar(15) DEFAULT NULL,
  `airStatus` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loginpf`
--

LOCK TABLES `loginpf` WRITE;
/*!40000 ALTER TABLE `loginpf` DISABLE KEYS */;
INSERT INTO `loginpf` VALUES ('A001','A001','Airline',NULL,'First School?','Birla School',NULL,NULL),('A101','Air@1234','Airline',NULL,'First School?','Delhi Public','SkyJet Airline','A'),('admin','admin','Admin',NULL,'First School?','Birla School',NULL,NULL),('U001','U001','User',NULL,'First School?','Birla School',NULL,NULL);
/*!40000 ALTER TABLE `loginpf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `psngrpf`
--

DROP TABLE IF EXISTS `psngrpf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `psngrpf` (
  `psgId` varchar(5) NOT NULL,
  `usrId` varchar(5) DEFAULT NULL,
  `psgName` varchar(20) DEFAULT NULL,
  `psgGender` varchar(10) DEFAULT NULL,
  `psgAge` decimal(2,0) DEFAULT NULL,
  `psgRltn` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`psgId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `psngrpf`
--

LOCK TABLES `psngrpf` WRITE;
/*!40000 ALTER TABLE `psngrpf` DISABLE KEYS */;
INSERT INTO `psngrpf` VALUES ('P001','U001','John Doe','Male',30,'Self'),('P002','U002','Jane Smith','Female',25,'Self'),('P003','U003','Mike Johnson','Male',45,'Self'),('P004','U004','Emily Davis','Female',35,'Self'),('P005','U005','Chris Brown','Male',28,'Self'),('P006','U006','David Miller','Male',33,'Self'),('P007','U007','Sophia Taylor','Female',29,'Self'),('P008','U008','Olivia White','Female',24,'Self'),('P009','U009','Liam Williams','Male',50,'Self'),('P010','U010','Ethan Brown','Male',27,'Self'),('P101','U101','Rahul Sharma','M',25,'Self');
/*!40000 ALTER TABLE `psngrpf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ratingpf`
--

DROP TABLE IF EXISTS `ratingpf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ratingpf` (
  `usrId` varchar(5) DEFAULT NULL,
  `fltId` varchar(5) DEFAULT NULL,
  `Rating` decimal(1,0) DEFAULT NULL,
  `Feedback` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ratingpf`
--

LOCK TABLES `ratingpf` WRITE;
/*!40000 ALTER TABLE `ratingpf` DISABLE KEYS */;
/*!40000 ALTER TABLE `ratingpf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticketpf`
--

DROP TABLE IF EXISTS `ticketpf`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ticketpf` (
  `tktId` varchar(5) NOT NULL,
  `bkId` varchar(5) DEFAULT NULL,
  `psgId` varchar(5) DEFAULT NULL,
  `TktSeatNum` decimal(3,0) DEFAULT NULL,
  `tktStatus` varchar(10) DEFAULT NULL,
  `tktRemark` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`tktId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticketpf`
--

LOCK TABLES `ticketpf` WRITE;
/*!40000 ALTER TABLE `ticketpf` DISABLE KEYS */;
INSERT INTO `ticketpf` VALUES ('T001','B001','P001',15,'Completed','No remarks'),('T002','B001','P002',10,'Upcoming','No remarks'),('T003','B001','P003',20,'Cancelled','No remarks'),('T004','B001','P004',25,'Upcoming','No remarks'),('T005','B002','P005',30,'Completed','No remarks'),('T006','B002','P006',35,'Completed','No remarks'),('T007','B002','P007',40,'Upcoming','No remarks'),('T008','B002','P008',45,'Completed','No remarks'),('T009','B003','P009',50,'Upcoming','No remarks'),('T010','B003','P010',55,'Cancelled','No remarks'),('T101','B101','P101',12,'C','Cancelled');
/*!40000 ALTER TABLE `ticketpf` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usermaster`
--

DROP TABLE IF EXISTS `usermaster`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usermaster` (
  `usrId` varchar(5) NOT NULL,
  `usrName` varchar(20) DEFAULT NULL,
  `usrDOB` date DEFAULT NULL,
  `usrGender` varchar(10) DEFAULT NULL,
  `usrMobNum` varchar(10) DEFAULT NULL,
  `usrEmail` varchar(50) DEFAULT NULL,
  `usrCity` varchar(20) DEFAULT NULL,
  `usrPinCode` decimal(6,0) DEFAULT NULL,
  `usrState` varchar(20) DEFAULT NULL,
  `usrCountry` varchar(20) DEFAULT NULL,
  `usrAddress` varchar(100) DEFAULT NULL,
  `usrAadhar` decimal(12,0) DEFAULT NULL,
  `usrStatus` varchar(10) DEFAULT NULL,
  `usrRemark` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`usrId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usermaster`
--

LOCK TABLES `usermaster` WRITE;
/*!40000 ALTER TABLE `usermaster` DISABLE KEYS */;
INSERT INTO `usermaster` VALUES ('U001','John Dass',NULL,'Male',NULL,'john.doe@email.com','New York',NULL,'New York','India','123 Main St, New York, NY',123456789012,'Active','Frequent'),('U002','Jane Smith','1997-03-22','Female','9123456789','jane.smith@email.com','San Francisco',94105,'California','USA','456 Ocean Drive, SF, CA',234567890123,'Active','New customer'),('U003','Mike Johnson','1980-02-10','Male','9345678901','mike.johnson@email.com','Chicago',60601,'Illinois','USA','789 Global Blvd, Chicago, IL',345678901234,'Inactive','On a break'),('U004','Emily Davis','1985-08-30','Female','9234567890','emily.davis@email.com','Los Angeles',90001,'California','USA','101 Blue Sky Ave, LA, CA',456789012345,'Active','VIP customer'),('U005','Chris Brown','1993-07-14','Male','9012345678','chris.brown@email.com','Miami',33101,'Florida','USA','202 Northwind Street, Miami, FL',567890123456,'Active','Frequent-flyer'),('U006','David Miller','1990-01-20','Male','9123456780','david.miller@email.com','Houston',77001,'Texas','USA','789 Swift Road, Houston, TX',678901234567,'Active','New user'),('U007','Sophia Taylor','1995-04-10','Female','9345678902','sophia.taylor@email.com','Dallas',75201,'Texas','USA','321 Luxe Blvd, Dallas, TX',789012345678,'Active','First-time '),('U008','Olivia White','1998-06-25','Female','9234567891','olivia.white@email.com','Boston',2115,'Massachusetts','USA','123 Airlink Street, Boston, MA',890123456789,'Active','Frequent '),('U009','Liam Williams','1987-09-18','Male','9012345679','liam.williams@email.com','Seattle',98101,'Washington','USA','987 Blue Street, Seattle, WA',901234567890,'Active','Family-traveler'),('U010','Ethan Brown','1992-07-22','Male','9012345680','ethan.brown@email.com','Chicago',60602,'Illinois','USA','111 High Road, Chicago, IL',234567890123,'Active','Solo traveler'),('U101','Rahul Sharma','1998-05-10','M','9876543210','rahul@gmail.com','Delhi',110001,'Delhi',NULL,'Karol Bagh',123456789012,'A','Active User');
/*!40000 ALTER TABLE `usermaster` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-03-31 17:38:48
