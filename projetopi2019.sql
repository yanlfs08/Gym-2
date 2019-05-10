-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 10.129.76.12
-- Tempo de geração: 10/05/2019 às 02:34
-- Versão do servidor: 5.6.26-log
-- Versão do PHP: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de dados: `projetopi2019`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `avaliação`
--

CREATE TABLE IF NOT EXISTS `avaliação` (
  `idAvaliacao` varchar(11) NOT NULL,
  `data` varchar(50) NOT NULL,
  `peso` double NOT NULL,
  `altura` double NOT NULL,
  `gorduraCorporal` double NOT NULL,
  `CPF` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `avaliação`
--

INSERT INTO `avaliação` (`idAvaliacao`, `data`, `peso`, `altura`, `gorduraCorporal`, `CPF`) VALUES
('46844', '04/05/2019', 70, 1.74, 14, '14396465629'),
('46845', '04/05/2019', 72.5, 1.74, 18.6, '1784733679');

-- --------------------------------------------------------

--
-- Estrutura para tabela `cadastro`
--

CREATE TABLE IF NOT EXISTS `cadastro` (
  `CPF` varchar(20) NOT NULL,
  `Nome` varchar(100) NOT NULL,
  `DtNasc` varchar(100) NOT NULL,
  `Telefone` varchar(11) DEFAULT NULL,
  `Email` varchar(100) NOT NULL,
  `idTipoUsuarios` varchar(11) NOT NULL,
  `idFicha` varchar(11) DEFAULT NULL,
  `Senha` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `cadastro`
--

INSERT INTO `cadastro` (`CPF`, `Nome`, `DtNasc`, `Telefone`, `Email`, `idTipoUsuarios`, `idFicha`, `Senha`) VALUES
('123456789', 'Gagau', '1989-10-18', '99999999', 'ghleao89@gmail.com', '1', NULL, '123456'),
('14396465629', 'Admin', '1996-12-08', '992925162', 'yanlfs@hotmail.com', '1', NULL, '081296'),
('1784733679', 'Lucas Fernando L Gomes', '1999-08-16', '999535397', 'lucaslages01ghs@gmail.com', '2', '1', '123456789');

-- --------------------------------------------------------

--
-- Estrutura stand-in para view `calculo_imc`
--
CREATE TABLE IF NOT EXISTS `calculo_imc` (
`IMC` double
);
-- --------------------------------------------------------

--
-- Estrutura para tabela `exercicios`
--

CREATE TABLE IF NOT EXISTS `exercicios` (
  `idExercicios` varchar(11) NOT NULL,
  `descExercicio` varchar(100) NOT NULL,
  `idGrupos` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `exercicios`
--

INSERT INTO `exercicios` (`idExercicios`, `descExercicio`, `idGrupos`) VALUES
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
-- Estrutura para tabela `ficha`
--

CREATE TABLE IF NOT EXISTS `ficha` (
  `idFicha` varchar(11) NOT NULL,
  `idExercicios` varchar(11) NOT NULL,
  `carga` double NOT NULL,
  `repeticao` varchar(11) NOT NULL,
  `serie` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `ficha`
--

INSERT INTO `ficha` (`idFicha`, `idExercicios`, `carga`, `repeticao`, `serie`) VALUES
('1', '27', 10, '15', '3'),
('1', '35', 0, '25', '3');

-- --------------------------------------------------------

--
-- Estrutura para tabela `gruposmusculares`
--

CREATE TABLE IF NOT EXISTS `gruposmusculares` (
  `idGrupos` varchar(11) NOT NULL,
  `descGrupo` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `gruposmusculares`
--

INSERT INTO `gruposmusculares` (`idGrupos`, `descGrupo`) VALUES
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
-- Estrutura para tabela `tiposusuarios`
--

CREATE TABLE IF NOT EXISTS `tiposusuarios` (
  `idTipoUsuarios` varchar(11) NOT NULL,
  `tipoUsuarios` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `tiposusuarios`
--

INSERT INTO `tiposusuarios` (`idTipoUsuarios`, `tipoUsuarios`) VALUES
('1', 'Admin'),
('2', 'Cliente'),
('3', 'Medico'),
('4', 'Personal'),
('5', 'Atendente');

-- --------------------------------------------------------

--
-- Estrutura para view `calculo_imc`
--
DROP TABLE IF EXISTS `calculo_imc`;

CREATE ALGORITHM=UNDEFINED DEFINER=`projetopi`@`%` SQL SECURITY DEFINER VIEW `calculo_imc` AS select (`avaliação`.`peso` / pow(`avaliação`.`altura`,2)) AS `IMC` from `avaliação`;

--
-- Índices de tabelas apagadas
--

--
-- Índices de tabela `avaliação`
--
ALTER TABLE `avaliação`
 ADD PRIMARY KEY (`idAvaliacao`), ADD KEY `fkIdx_182` (`CPF`);

--
-- Índices de tabela `cadastro`
--
ALTER TABLE `cadastro`
 ADD PRIMARY KEY (`CPF`), ADD KEY `fkIdx_135` (`idTipoUsuarios`), ADD KEY `fkIdx_161` (`idFicha`);

--
-- Índices de tabela `exercicios`
--
ALTER TABLE `exercicios`
 ADD PRIMARY KEY (`idExercicios`), ADD KEY `fkIdx_172` (`idGrupos`);

--
-- Índices de tabela `ficha`
--
ALTER TABLE `ficha`
 ADD PRIMARY KEY (`idFicha`,`idExercicios`), ADD KEY `fkIdx_175` (`idExercicios`);

--
-- Índices de tabela `gruposmusculares`
--
ALTER TABLE `gruposmusculares`
 ADD PRIMARY KEY (`idGrupos`);

--
-- Índices de tabela `tiposusuarios`
--
ALTER TABLE `tiposusuarios`
 ADD PRIMARY KEY (`idTipoUsuarios`);

--
-- Restrições para dumps de tabelas
--

--
-- Restrições para tabelas `avaliação`
--
ALTER TABLE `avaliação`
ADD CONSTRAINT `avaliação_ibfk_1` FOREIGN KEY (`CPF`) REFERENCES `cadastro` (`CPF`);

--
-- Restrições para tabelas `cadastro`
--
ALTER TABLE `cadastro`
ADD CONSTRAINT `cadastro_ibfk_1` FOREIGN KEY (`idFicha`) REFERENCES `ficha` (`idFicha`),
ADD CONSTRAINT `cadastro_ibfk_2` FOREIGN KEY (`idTipoUsuarios`) REFERENCES `tiposusuarios` (`idTipoUsuarios`);

--
-- Restrições para tabelas `exercicios`
--
ALTER TABLE `exercicios`
ADD CONSTRAINT `exercicios_ibfk_1` FOREIGN KEY (`idGrupos`) REFERENCES `gruposmusculares` (`idGrupos`);

--
-- Restrições para tabelas `ficha`
--
ALTER TABLE `ficha`
ADD CONSTRAINT `ficha_ibfk_2` FOREIGN KEY (`idExercicios`) REFERENCES `exercicios` (`idExercicios`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
