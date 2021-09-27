-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 27, 2021 at 04:00 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbcontact`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_contact_management`
--

CREATE TABLE `tbl_contact_management` (
  `id` int(11) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `telepon` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_contact_management`
--

INSERT INTO `tbl_contact_management` (`id`, `nama`, `telepon`, `email`) VALUES
(1, 'Muhammad', '081283292376', 'yuharimuhammadrizky@gmail.com'),
(4, 'Yussi Riyanti', '081270347975', 'yussi@gmail.com'),
(5, 'Yasin Alfi Yahya', '081237483733', 'yasinalfi@gmail.com'),
(6, 'dummy', '182039', 'fasdfasdf@gmail.com'),
(7, 'dummy1', '182039', 'fasdfadfgvsdf@gmail.com'),
(8, 'dummy2', '08182039', 'fasdfasdjf@gmail.com'),
(9, 'dummy3', '082039', 'fasdfasdfgsdf@gmail.com'),
(10, 'dummy1', '182039', 'fasdfadfgvsdf@gmail.com'),
(11, 'dummy2', '08182039', 'fasdfasdjf@gmail.com'),
(12, 'dummy2', '08182039', 'fasdfasdjf@gmail.com'),
(13, 'dummy3', '082039', 'fasdfasdfgsdf@gmail.com'),
(14, 'dummy1', '182039', 'fasdfadfgvsdf@gmail.com'),
(15, 'dummy3', '082039', 'fasdfasdfgsdf@gmail.com'),
(16, 'Aprillia', '0812498712', 'aprilia@gmail.com'),
(17, 'r', '0812', 'r@gmail.com'),
(18, 'coba', '01823', 'coba@gmail.com'),
(19, 'asdf', '12332423', 'adf'),
(20, 'gits', '0218383', 'gits@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_contact_management`
--
ALTER TABLE `tbl_contact_management`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_contact_management`
--
ALTER TABLE `tbl_contact_management`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
