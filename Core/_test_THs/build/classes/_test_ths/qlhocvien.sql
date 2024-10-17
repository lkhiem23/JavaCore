-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 11, 2024 at 10:49 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qlhv`
--

-- --------------------------------------------------------

--
-- Table structure for table `qlhocvien`
--

CREATE TABLE `qlhocvien` (
  `mahv` int(11) NOT NULL,
  `tenhv` varchar(30) NOT NULL,
  `quequan` varchar(30) NOT NULL,
  `diemthi` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `qlhocvien`
--

INSERT INTO `qlhocvien` (`mahv`, `tenhv`, `quequan`, `diemthi`) VALUES
(1, 'Nguyen Van A', 'Ha Noi', 8.5),
(2, 'Nguyen Thi B', 'Hai Phong', 7.5),
(3, 'Le Van C', 'Da Nang', 9),
(4, 'Nguyen Duc D', 'Ho Chi Minh', 7.8),
(5, 'Pham Van C', 'Can Tho', 8.2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `qlhocvien`
--
ALTER TABLE `qlhocvien`
  ADD PRIMARY KEY (`mahv`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `qlhocvien`
--
ALTER TABLE `qlhocvien`
  MODIFY `mahv` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
