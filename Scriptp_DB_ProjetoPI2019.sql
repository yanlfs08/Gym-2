-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 10.129.76.12
-- Tempo de geração: 10/05/2019 às 01:59
-- Versão do servidor: 5.6.26-log
-- Versão do PHP: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de dados: `ProjetoPI2019`
--
CREATE DATABASE IF NOT EXISTS `ProjetoPI2019` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `ProjetoPI2019`;

-- --------------------------------------------------------

--
-- Estrutura para tabela `Avaliacao`
--

CREATE TABLE IF NOT EXISTS `Avaliacao` (
  `IdAvaliacao` varchar(11) NOT NULL,
  `Data` varchar(50) NOT NULL,
  `Peso` double NOT NULL,
  `Altura` double NOT NULL,
  `GorduraCorporal` double NOT NULL,
  `CPF` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `Avaliacao`
--

INSERT INTO `Avaliacao` (`IdAvaliacao`, `Data`, `Peso`, `Altura`, `GorduraCorporal`, `CPF`) VALUES
('46844', '04/05/2019', 70, 1.74, 14, '14396465629'),
('46845', '04/05/2019', 72.5, 1.74, 18.6, '1784733679');

-- --------------------------------------------------------

--
-- Estrutura para tabela `Usuario`
--

CREATE TABLE IF NOT EXISTS `Usuario` (
  `CPF` varchar(20) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `DtNasc` varchar(100) NOT NULL,
  `Telefone` varchar(11) DEFAULT NULL,
  `Email` varchar(100) NOT NULL,
  `IdTipoUsuario` varchar(11) NOT NULL,
  `IdFicha` varchar(11) DEFAULT NULL,
  `Senha` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `Usuario`
--

INSERT INTO `Usuario` (`CPF`, `Nome`, `DtNasc`, `Telefone`, `Email`, `IdTipoUsuario`, `IdFicha`, `Senha`) VALUES
('123456789', 'Gagau', '1989-10-18', '99999999', 'ghleao89@gmail.com', '1', NULL, '123456'),
('14396465629', 'Admin', '1996-12-08', '992925162', 'yanlfs@hotmail.com', '1', NULL, '081296'),
('1784733679', 'Lucas Fernando L Gomes', '1999-08-16', '999535397', 'lucaslages01ghs@gmail.com', '2', '1', '123456789');

-- --------------------------------------------------------

--
-- Estrutura stand-in para view `Calculo_IMC`
--
CREATE TABLE IF NOT EXISTS `Calculo_IMC` (
`IMC` double
);
-- --------------------------------------------------------

--
-- Estrutura para tabela `Exercicio`
--

CREATE TABLE IF NOT EXISTS `Exercicio` (
  `IdExercicio` varchar(11) NOT NULL,
  `DescExercicio` varchar(100) NOT NULL,
  `IdGrupo` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `Exercicio`
--

INSERT INTO `Exercicio` (`IdExercicio`, `DescExercicio`, `IdGrupo`) VALUES
('1', 'Supino Reto', '27'),
('10', 'Remada Articulada', '19'),
('11', 'Puxador Alto', '19'),
('12', 'Puxador Baixo', '19'),
('13', 'Remo Cavalinho', '19'),
('14', 'Rosca Direta', '20'),
('15', 'Rosca Scott', '20'),
('16', 'Rosca Alternada', '20'),
('17', 'Rosca Concentrada', '20'),
('18', 'Rosca com barra EZ ou W e pegada fechada', '20'),
('19', 'Rosca com barra EZ ou W e pegada aberta', '20'),
('2', 'Supino Inclinado', '27'),
('20', 'Rosca Punho', '21'),
('21', 'Rosca Punho Inverso', '21'),
('22', 'Penturrilha Sentada', '22'),
('23', 'Panturrilha em Pé', '22'),
('24', 'Desenvol. de Ombro', '23'),
('25', 'Elevação Lateral', '23'),
('26', 'Elevação Frotal', '23'),
('27', 'Crucifixo Inverso', '23'),
('28', 'Remada Alta', '23'),
('3', 'Supino Declinado', '27'),
('30', 'Francês', '24'),
('31', 'Cabo', '24'),
('32', 'Cordas', '24'),
('33', 'Elevação de Perna', '25'),
('34', 'Rotação de Tronco', '25'),
('35', 'Abdominal', '25'),
('36', 'Flexão Lateral de Tronco', '25'),
('37', 'Extensão Lateral', '25'),
('38', 'Agachamento', '26'),
('39', 'Leg Press', '26'),
('4', 'Crucifixo', '27'),
('40', 'Hack Maquina', '26'),
('41', 'Extensora', '26'),
('43', 'Flexora Deitada', '26'),
('44', 'Flexora em Pé', '26'),
('45', 'Cadeira Abdutora', '26'),
('5', 'Iso Peitoral', '27'),
('6', 'Voador', '27'),
('7', 'Barra Fixa', '19'),
('780', 'TESTE', '23'),
('8', 'Remada Unilaretal', '19'),
('9', 'Remada Curvada', '19');

-- --------------------------------------------------------

--
-- Estrutura para tabela `Ficha`
--

CREATE TABLE IF NOT EXISTS `Ficha` (
  `IdFicha` varchar(11) NOT NULL,
  `IdExercicio` varchar(11) NOT NULL,
  `Carga` double NOT NULL,
  `Repeticao` varchar(11) NOT NULL,
  `Serie` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `Ficha`
--

INSERT INTO `Ficha` (`IdFicha`, `IdExercicio`, `Carga`, `Repeticao`, `Serie`) VALUES
('1', '27', 10, '15', '3'),
('1', '35', 0, '25', '3');

-- --------------------------------------------------------

--
-- Estrutura para tabela `GrupoMuscular`
--

CREATE TABLE IF NOT EXISTS `GrupoMuscular` (
  `IdGrupo` varchar(11) NOT NULL,
  `DescGrupo` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `GrupoMuscular`
--

INSERT INTO `GrupoMuscular` (`IdGrupo`, `DescGrupo`) VALUES
('19', 'Costas'),
('20', 'Bíceps'),
('21', 'Ante Braço'),
('22', 'Pernas'),
('23', 'Ombros'),
('24', 'Triceps'),
('25', 'Abdomen'),
('26', 'Coxas/Glúteo'),
('27', 'Peito');

-- --------------------------------------------------------

--
-- Estrutura para tabela `TipoUsuario`
--

CREATE TABLE IF NOT EXISTS `TipoUsuario` (
  `IdTipoUsuario` varchar(11) NOT NULL,
  `DescTipoUsuario` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `TipoUsuario`
--

INSERT INTO `TipoUsuario` (`IdTipoUsuario`, `DescTipoUsuario`) VALUES
('1', 'Admin'),
('2', 'Cliente'),
('3', 'Medico'),
('4', 'Personal'),
('5', 'Atendente');

-- --------------------------------------------------------

--
-- Estrutura para view `Calculo_IMC`
--
DROP TABLE IF EXISTS `Calculo_IMC`;

CREATE ALGORITHM=UNDEFINED DEFINER=`ProjetoPI`@`%` SQL SECURITY DEFINER VIEW `Calculo_IMC` AS select (`Avaliacao`.`Peso` / pow(`Avaliacao`.`Altura`,2)) AS `IMC` from `Avaliacao`;

--
-- Índices de tabelas apagadas
--

--
-- Índices de tabela `Avaliacao`
--
ALTER TABLE `Avaliacao`
 ADD PRIMARY KEY (`IdAvaliacao`), ADD KEY `fkIdx_182` (`CPF`);

--
-- Índices de tabela `Usuario`
--
ALTER TABLE `Usuario`
 ADD PRIMARY KEY (`CPF`), ADD KEY `fkIdx_135` (`IdTipoUsuario`), ADD KEY `fkIdx_161` (`IdFicha`);

--
-- Índices de tabela `Exercicio`
--
ALTER TABLE `Exercicio`
 ADD PRIMARY KEY (`IdExercicio`), ADD KEY `fkIdx_172` (`IdGrupo`);

--
-- Índices de tabela `Ficha`
--
ALTER TABLE `Ficha`
 ADD PRIMARY KEY (`IdFicha`,`IdExercicio`), ADD KEY `fkIdx_175` (`IdExercicio`);

--
-- Índices de tabela `GrupoMuscular`
--
ALTER TABLE `GrupoMuscular`
 ADD PRIMARY KEY (`IdGrupo`);

--
-- Índices de tabela `TipoUsuario`
--
ALTER TABLE `TipoUsuario`
 ADD PRIMARY KEY (`IdTipoUsuario`);

--
-- Restrições para dumps de tabelas
--

--
-- Restrições para tabelas `Avaliacao`
--
ALTER TABLE `Avaliacao`
ADD CONSTRAINT `Avaliacao_ibfk_1` FOREIGN KEY (`CPF`) REFERENCES `Usuario` (`CPF`);

--
-- Restrições para tabelas `Usuario`
--
ALTER TABLE `Usuario`
ADD CONSTRAINT `Usuario_ibfk_1` FOREIGN KEY (`IdFicha`) REFERENCES `Ficha` (`IdFicha`),
ADD CONSTRAINT `Usuario_ibfk_2` FOREIGN KEY (`IdTipoUsuario`) REFERENCES `TipoUsuario` (`IdTipoUsuario`);

--
-- Restrições para tabelas `Exercicio`
--
ALTER TABLE `Exercicio`
ADD CONSTRAINT `Exercicio_ibfk_1` FOREIGN KEY (`IdGrupo`) REFERENCES `GrupoMuscular` (`IdGrupo`);

--
-- Restrições para tabelas `Ficha`
--
ALTER TABLE `Ficha`
ADD CONSTRAINT `Ficha_ibfk_2` FOREIGN KEY (`IdExercicio`) REFERENCES `Exercicio` (`IdExercicio`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
