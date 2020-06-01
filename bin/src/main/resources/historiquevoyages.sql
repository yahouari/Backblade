-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : lun. 25 mai 2020 à 02:55
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP : 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `voyages`
--

-- --------------------------------------------------------

--
-- Structure de la table `historiquevoyages`
--

CREATE TABLE `historiquevoyages` (
  `idparticipation` int(11) NOT NULL,
  `datedeparticipation` varchar(255) DEFAULT NULL,
  `destination` varchar(255) DEFAULT NULL,
  `nombredepersonnes` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `historiquevoyages`
--

INSERT INTO `historiquevoyages` (`idparticipation`, `datedeparticipation`, `destination`, `nombredepersonnes`, `username`) VALUES
(1, '19/05/2020', 'Marrakech', 11, 'user@mail.com'),
(2, '23/06/2020', 'Dakhla', 8, 'user@mail.com'),
(3, '11/04/2020', 'Chefchaouen', 7, 'user@mail.com'),
(4, '17/03/2020', 'Ait Benhaddou', 13, 'user@mail.com'),
(5, '14/06/2020', 'Marrakech', 11, 'user2@mail.com'),
(6, '25/06/2020', 'Ait Benhaddou', 4, 'user2@mail.com');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `historiquevoyages`
--
ALTER TABLE `historiquevoyages`
  ADD PRIMARY KEY (`idparticipation`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
