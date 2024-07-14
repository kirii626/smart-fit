-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-11-2023 a las 21:17:37
-- Versión del servidor: 8.0.33
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gorditosanonimos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recetas`
--

CREATE TABLE `recetas` (
  `ID` int NOT NULL,
  `Nombre` varchar(255) DEFAULT NULL,
  `Tipo` varchar(255) DEFAULT NULL,
  `Calorias_Recetas` decimal(6,2) DEFAULT NULL,
  `Precio_R` decimal(10,2) DEFAULT NULL,
  `MenuID` int DEFAULT NULL,
  `Imagen_R` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Volcado de datos para la tabla `recetas`
--

INSERT INTO `recetas` (`ID`, `Nombre`, `Tipo`, `Calorias_Recetas`, `Precio_R`, `MenuID`, `Imagen_R`) VALUES
(1, 'Sopa de Cebolla', 'Entrada', 120.00, 6.00, 1, 'C:\\Users\\Mateo\\Downloads\\fotosProjectoMamani\\SopaDeCebolla.jpg'),
(2, 'Ensalada de Pollo', 'Entrada', 150.00, 5.00, 1, 'C:\\Users\\Mateo\\Downloads\\fotosProjectoMamani\\EnsaladaDePollo.jpg'),
(3, 'Tostadas con Mermelada', 'Entrada', 80.00, 3.00, 1, 'C:\\Users\\Mateo\\Downloads\\fotosProjectoMamani\\TostadasConMermelada.jpg'),
(4, 'Bistec a la Ternera', 'Plato Principal', 350.00, 12.00, 2, 'C:\\Users\\Mateo\\Downloads\\fotosProjectoMamani\\BistecALaTernera.jpg'),
(5, 'Salmón a la Parrilla', 'Plato Principal', 280.00, 10.00, 2, 'C:\\Users\\Mateo\\Downloads\\fotosProjectoMamani\\SalmonALaParrilla.jpg'),
(6, 'Pollo al Curry', 'Plato Principal', 320.00, 8.00, 2, 'C:\\Users\\Mateo\\Downloads\\fotosProjectoMamani\\PolloAlCurry.jpg'),
(7, 'Tarta de Limón', 'Postre', 200.00, 5.00, 3, 'C:\\Users\\Mateo\\Downloads\\fotosProjectoMamani\\TartaDeLimon.jpg'),
(8, 'Helado de Chocolate', 'Postre', 160.00, 4.00, 3, 'C:\\Users\\Mateo\\Downloads\\fotosProjectoMamani\\HeladoDeChocolate.jpg'),
(9, 'Frutas en Yogur', 'Postre', 120.00, 3.00, 3, 'C:\\Users\\Mateo\\Downloads\\fotosProjectoMamani\\FrutasEnYogurt.jpg');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `recetas`
--
ALTER TABLE `recetas`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `MenuID` (`MenuID`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `recetas`
--
ALTER TABLE `recetas`
  ADD CONSTRAINT `recetas_ibfk_1` FOREIGN KEY (`MenuID`) REFERENCES `menus` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
