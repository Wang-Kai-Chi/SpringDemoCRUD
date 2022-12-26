-- phpMyAdmin SQL Dump
-- version 5.1.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Dec 26, 2022 at 07:44 AM
-- Server version: 5.7.24
-- PHP Version: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `eeit53`
--

-- --------------------------------------------------------

--
-- Table structure for table `cust`
--

CREATE TABLE `cust` (
  `id` int(10) UNSIGNED NOT NULL,
  `cname` varchar(100) NOT NULL,
  `tel` varchar(100) NOT NULL,
  `birthday` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cust`
--

INSERT INTO `cust` (`id`, `cname`, `tel`, `birthday`) VALUES
(1, 'Laura', '0935655834', '1999-08-01'),
(3, 'Eric', '567', '1998-11-11'),
(13, 'Mark', '666', '1999-06-06'),
(14, 'Mark', '666', '1999-06-06'),
(15, 'Mark66', '666', '1999-06-06'),
(16, 'Ama', '333', '1999-03-17'),
(17, 'Ama', '333', '1999-03-17'),
(18, 'Betty', '0945669867', '1999-07-15'),
(19, 'Paul', '0945669833', '1999-05-23'),
(20, 'Paul002', '0945669833', '1999-05-23'),
(21, 'David', '0945669833', '1999-11-23'),
(22, 'David002', '0945669833', '1999-11-01'),
(23, 'Laura', '0935655834', '1999-08-01');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cust`
--
ALTER TABLE `cust`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cust`
--
ALTER TABLE `cust`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
