-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 30, 2015 at 11:07 AM
-- Server version: 5.5.32
-- PHP Version: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `cursoinces`
--
CREATE DATABASE IF NOT EXISTS `cursoinces` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `cursoinces`;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_estado`
--

CREATE TABLE IF NOT EXISTS `tbl_estado` (
  `clvcodigo` bigint(20) NOT NULL AUTO_INCREMENT,
  `clvregion` bigint(20) NOT NULL,
  `strdescripcion` varchar(45) NOT NULL,
  `strcapital` varchar(45) NOT NULL,
  `clvadministrador` bigint(20) NOT NULL DEFAULT '1',
  `blnborrado` tinyint(1) NOT NULL DEFAULT '0',
  `fecharegistro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fechamodificado` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`clvcodigo`),
  UNIQUE KEY `clvcodigo_UNIQUE` (`clvcodigo`),
  KEY `clvregion_INDEX` (`clvregion`),
  KEY `clvadministrador_INDEX` (`clvadministrador`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_maestro`
--

CREATE TABLE IF NOT EXISTS `tbl_maestro` (
  `clvcodigo` bigint(20) NOT NULL AUTO_INCREMENT,
  `clvpadre` bigint(20) NOT NULL DEFAULT '0',
  `descripcion` varchar(255) CHARACTER SET latin1 NOT NULL,
  `id_administrador` bigint(20) DEFAULT NULL,
  `blnborrado` tinyint(1) DEFAULT '0',
  `fecharegistro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fechamodificado` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`clvcodigo`),
  UNIQUE KEY `clvcodigo_UNIQUE` (`clvcodigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=11 ;

--
-- Dumping data for table `tbl_maestro`
--

INSERT INTO `tbl_maestro` (`clvcodigo`, `clvpadre`, `descripcion`, `id_administrador`, `blnborrado`, `fecharegistro`, `fechamodificado`) VALUES
(1, 0, 'Maestro Sistema', 1, 0, '2015-07-30 08:10:57', NULL),
(2, 1, 'Mestro Nacionalidad', 1, 0, '2015-07-30 08:11:34', NULL),
(3, 2, 'Venazol@', 1, 0, '2015-07-30 08:12:26', NULL),
(4, 2, 'Extrange@', 1, 0, '2015-07-30 08:12:52', NULL),
(5, 1, 'Maestro Sexo', 1, 0, '2015-07-30 08:13:25', NULL),
(6, 5, 'Femenino', 1, 0, '2015-07-30 08:14:01', NULL),
(7, 5, 'Masculino', 1, 0, '2015-07-30 08:14:19', NULL),
(8, 1, 'Maestro Estado Civil', 1, 0, '2015-07-30 08:15:07', NULL),
(9, 9, 'Soter@', 1, 0, '2015-07-30 08:15:26', NULL),
(10, 9, 'Casad@', 1, 0, '2015-07-30 08:16:18', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_municipio`
--

CREATE TABLE IF NOT EXISTS `tbl_municipio` (
  `clvcodigo` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_estado` bigint(20) NOT NULL,
  `strdescripcion` tinytext COLLATE utf8_spanish_ci NOT NULL,
  `blncapital` tinyint(1) NOT NULL DEFAULT '0',
  `clvadministrador` bigint(20) NOT NULL,
  `blnborrado` tinyint(1) NOT NULL DEFAULT '0',
  `fecharegistro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fechamodificado` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`clvcodigo`),
  UNIQUE KEY `clvcodigo_UNIQUE` (`clvcodigo`),
  KEY `id_estado_INDEX` (`id_estado`),
  KEY `clvadministrador_INDEX` (`clvadministrador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_parroquia`
--

CREATE TABLE IF NOT EXISTS `tbl_parroquia` (
  `clvcodigo` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_municipio` bigint(20) NOT NULL,
  `strdescripcion` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `blncapital` tinyint(1) NOT NULL DEFAULT '0',
  `clvadministrador` bigint(20) NOT NULL,
  `blnborrado` tinyint(1) DEFAULT NULL,
  `fecharegistro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fechamodificado` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`clvcodigo`),
  UNIQUE KEY `clvcodigo_UNIQUE` (`clvcodigo`),
  KEY `id_municipio_INDEX` (`id_municipio`),
  KEY `clvadministrador_INDEX` (`clvadministrador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_persona`
--

CREATE TABLE IF NOT EXISTS `tbl_persona` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombres` varchar(255) NOT NULL,
  `apellidos` varchar(255) NOT NULL,
  `cedula` int(15) NOT NULL,
  `correo` varchar(255) NOT NULL,
  `id_estadocivil` bigint(20) NOT NULL,
  `id_sexo` bigint(20) NOT NULL,
  `id_nacionalidad` bigint(20) NOT NULL,
  `fechanacimiento` varchar(45) NOT NULL,
  `tflmovil` varchar(13) DEFAULT NULL,
  `tlffijo` varchar(13) DEFAULT NULL,
  `bbpin` varchar(45) DEFAULT NULL,
  `whatsapp` varchar(45) DEFAULT NULL,
  `id_parroquia` bigint(20) NOT NULL,
  `id_sector` bigint(20) DEFAULT NULL,
  `direccion` text NOT NULL,
  `blnborrado` tinyint(1) NOT NULL DEFAULT '0',
  `fecharegistro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fechamodificacion` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `apellidos_UNIQUE` (`apellidos`),
  UNIQUE KEY `cedula_UNIQUE` (`cedula`),
  KEY `id_estadocivil_INDEX` (`id_estadocivil`),
  KEY `id_sexo_INDEX` (`id_sexo`),
  KEY `id_nacionalidad_INDEX` (`id_nacionalidad`),
  KEY `id_INDEX` (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 COMMENT='Tabla para guargar toda la informacion relacionada con personas' AUTO_INCREMENT=2 ;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_region`
--

CREATE TABLE IF NOT EXISTS `tbl_region` (
  `clvcodigo` bigint(20) NOT NULL AUTO_INCREMENT,
  `strdescripcion` varchar(45) NOT NULL,
  `clvadministrador` bigint(20) NOT NULL,
  `blnborrado` tinyint(1) NOT NULL DEFAULT '0',
  `fecharegistro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fechamodificado` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`clvcodigo`),
  UNIQUE KEY `clvcodigo_UNIQUE` (`clvcodigo`),
  KEY `clvadministrador_tbl_region_vs_tbl_usuario_idx` (`clvadministrador`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla para guardar la informacion de los estados' AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_sector`
--

CREATE TABLE IF NOT EXISTS `tbl_sector` (
  `clvcodigo` bigint(20) NOT NULL AUTO_INCREMENT,
  `clvparroquia` bigint(20) NOT NULL,
  `strdescripcion` varchar(255) COLLATE utf8_spanish_ci DEFAULT NULL,
  `clvadministrador` bigint(20) NOT NULL DEFAULT '1',
  `fecharegistro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fechamodificado` timestamp NULL DEFAULT NULL,
  `blnborrado` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`clvcodigo`),
  UNIQUE KEY `clvcodigo_UNIQUE` (`clvcodigo`),
  KEY `clvparroquia_INDEX` (`clvparroquia`),
  KEY `clvadministrador_INDEX` (`clvadministrador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_usuario`
--

CREATE TABLE IF NOT EXISTS `tbl_usuario` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `id_persona` bigint(20) NOT NULL,
  `usuario` varchar(255) CHARACTER SET latin1 NOT NULL,
  `contrasena` varchar(255) CHARACTER SET latin1 NOT NULL,
  `blnborrado` tinyint(1) NOT NULL,
  `fecharegistro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fechamodificacion` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `usuario_UNIQUE` (`usuario`),
  UNIQUE KEY `id_persona_UNIQUE` (`id_persona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Tabla para guargar toda la informacion relacionada con los usuarios que tienen acceso al sistema' AUTO_INCREMENT=1 ;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_estado`
--
ALTER TABLE `tbl_estado`
  ADD CONSTRAINT `fk_clvadministrador_tbl_estado_vs_tbl_region` FOREIGN KEY (`clvadministrador`) REFERENCES `tbl_usuario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_clvregion_tbl_estado_vs_tbl_region` FOREIGN KEY (`clvregion`) REFERENCES `tbl_region` (`clvcodigo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tbl_municipio`
--
ALTER TABLE `tbl_municipio`
  ADD CONSTRAINT `fk_clvadministrador_tbl_municipio_vs_tbl_usuario` FOREIGN KEY (`clvadministrador`) REFERENCES `tbl_usuario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_id_estado_tbl_municipio_vs_tbl_estado` FOREIGN KEY (`id_estado`) REFERENCES `tbl_estado` (`clvcodigo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tbl_parroquia`
--
ALTER TABLE `tbl_parroquia`
  ADD CONSTRAINT `fk_clvadministrador_tbl_parroquia_vs_tbl_municipio` FOREIGN KEY (`clvadministrador`) REFERENCES `tbl_usuario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_id_municipio_tblparroquia_vs_tbl_municipio` FOREIGN KEY (`id_municipio`) REFERENCES `tbl_municipio` (`clvcodigo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tbl_persona`
--
ALTER TABLE `tbl_persona`
  ADD CONSTRAINT `fk_id_nacionalidad_tbl_persona_vs_tbl_maestro` FOREIGN KEY (`id_nacionalidad`) REFERENCES `tbl_maestro` (`clvcodigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_id_estadocivil_tbl_persona_vstbl_maestro` FOREIGN KEY (`id_estadocivil`) REFERENCES `tbl_maestro` (`clvcodigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_id_sexo_tbl_persona_vs_tbl_maestro` FOREIGN KEY (`id_sexo`) REFERENCES `tbl_maestro` (`clvcodigo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tbl_region`
--
ALTER TABLE `tbl_region`
  ADD CONSTRAINT `clvadministrador_tbl_region_vs_tbl_usuario` FOREIGN KEY (`clvadministrador`) REFERENCES `tbl_usuario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tbl_sector`
--
ALTER TABLE `tbl_sector`
  ADD CONSTRAINT `fk_clvparroquia_tbl_sector_tbl_usuario` FOREIGN KEY (`clvadministrador`) REFERENCES `tbl_usuario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_clvparroquia_tbl_sector_tbl_parroquia` FOREIGN KEY (`clvparroquia`) REFERENCES `tbl_parroquia` (`clvcodigo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
  ADD CONSTRAINT `fk_id_persona_tbl_usuario_vs_tbl_persona` FOREIGN KEY (`id_persona`) REFERENCES `tbl_persona` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
