-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-07-2015 a las 17:25:57
-- Versión del servidor: 5.6.20
-- Versión de PHP: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `cursoinces`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_maestro`
--

CREATE TABLE IF NOT EXISTS `tbl_maestro` (
`clvcodigo` bigint(20) NOT NULL,
  `clvpadre` bigint(20) DEFAULT '0',
  `stritem_a` varchar(255) CHARACTER SET latin1 NOT NULL,
  `stritem_b` varchar(255) CHARACTER SET latin1 DEFAULT 'Sin Especificar',
  `stritem_c` varchar(255) CHARACTER SET latin1 DEFAULT 'Sin Especificar',
  `fecharegistro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fechamodificado` timestamp NULL DEFAULT NULL,
  `blnborrado` tinyint(1) DEFAULT '0'
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `tbl_maestro`
--

INSERT INTO `tbl_maestro` (`clvcodigo`, `clvpadre`, `stritem_a`, `stritem_b`, `stritem_c`, `fecharegistro`, `fechamodificado`, `blnborrado`) VALUES
(1, 0, 'Nacionalidad', 'Sin Especificar', 'Sin Especificar', '2015-07-27 12:35:54', NULL, 0),
(2, 0, 'Venezolan@', 'Sin Especificar', 'Sin Especificar', '2015-07-27 12:36:37', NULL, 0),
(3, 0, 'Extranger@', 'Sin Especificar', 'Sin Especificar', '2015-07-27 12:37:36', NULL, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_usuario`
--

CREATE TABLE IF NOT EXISTS `tbl_usuario` (
`id` bigint(20) NOT NULL,
  `nombres` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `cedula` varchar(45) NOT NULL,
  `correo` varchar(45) NOT NULL,
  `estadocivil` varchar(45) NOT NULL,
  `nacionalidad` varchar(45) NOT NULL,
  `fechanacimieno` varchar(45) NOT NULL,
  `tflmovil` varchar(45) NOT NULL,
  `tlffijo` varchar(45) NOT NULL,
  `bbpin` varchar(45) NOT NULL,
  `whatsapp` varchar(45) NOT NULL,
  `idparroquia` varchar(45) NOT NULL,
  `idsector` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `usario` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `rol` varchar(45) NOT NULL,
  `estatus_usuario` varchar(45) NOT NULL,
  `fecharegistro` varchar(45) NOT NULL,
  `fechamodificacion` varchar(45) DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `tbl_usuario`
--

INSERT INTO `tbl_usuario` (`id`, `nombres`, `apellidos`, `cedula`, `correo`, `estadocivil`, `nacionalidad`, `fechanacimieno`, `tflmovil`, `tlffijo`, `bbpin`, `whatsapp`, `idparroquia`, `idsector`, `direccion`, `usario`, `password`, `rol`, `estatus_usuario`, `fecharegistro`, `fechamodificacion`) VALUES
(1, 'Juan José', 'Moreno Araujo', '17832963', 'j_j_m_a0904@hotmail.com', '1', '1', '09-04-1983', '04124462347', '04124462347', '04124462347', '04124462347', '1', '1', 'san juan de los morros', 'jjma', '123456', '1', 'Activo', '27-07-2015', '27-07-2015');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbl_maestro`
--
ALTER TABLE `tbl_maestro`
 ADD PRIMARY KEY (`clvcodigo`);

--
-- Indices de la tabla `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tbl_maestro`
--
ALTER TABLE `tbl_maestro`
MODIFY `clvcodigo` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
