-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Ноя 17 2022 г., 00:52
-- Версия сервера: 5.5.25
-- Версия PHP: 5.3.13

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- База данных: `library`
--

-- --------------------------------------------------------

--
-- Структура таблицы `books`
--

CREATE TABLE IF NOT EXISTS `books` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) DEFAULT NULL,
  `text` varchar(100) DEFAULT NULL,
  `publisher` varchar(100) DEFAULT NULL,
  `year` int(11) DEFAULT NULL,
  `author` varchar(150) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=44 ;

--
-- Дамп данных таблицы `books`
--

INSERT INTO `books` (`id`, `title`, `text`, `publisher`, `year`, `author`, `date`) VALUES
(12, 'Harry Potter and the Philosopher''s stone', 'text', 'BLOOMSBURY', 1997, 'Rowling J.K', '2022-11-13 19:25:21'),
(26, 'Harry Porter and the Chamber of Secrets', 'text', 'BLOOMSBURY', 1998, 'Rowling J.K', '2022-11-15 19:51:51'),
(36, 'Harry Porter and the Prisoner of Azkaban', 'text', 'BLOOMSBURY', 1999, 'Rowling J.K', '2022-11-15 21:41:05'),
(43, 'Lord of the Rings: The Fellowship of The Ring', 'tet', 'HarperCollins UK', 2001, 'J. R. R. Tolkien', '2022-11-16 23:37:19');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
