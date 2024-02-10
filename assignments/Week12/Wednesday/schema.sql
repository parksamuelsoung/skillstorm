-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Bookstore
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Bookstore
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Bookstore` DEFAULT CHARACTER SET utf8 ;
USE `Bookstore` ;

-- -----------------------------------------------------
-- Table `Bookstore`.`Bookstore`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Bookstore`.`Bookstore` (
  `Bookstore_Id` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NOT NULL,
  `Address` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Bookstore_Id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Bookstore`.`Book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Bookstore`.`Book` (
  `ISBN` VARCHAR(45) NOT NULL,
  `Name` VARCHAR(45) NOT NULL,
  `Genre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ISBN`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Bookstore`.`Author`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Bookstore`.`Author` (
  `Author_Id` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Author_Id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Bookstore`.`Book_has_Author`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Bookstore`.`Book_has_Author` (
  `ISBN` VARCHAR(45) NOT NULL,
  `Author_Id` INT NOT NULL,
  PRIMARY KEY (`ISBN`, `Author_Id`),
  INDEX `fk_Book_has_Author_Author1_idx` (`Author_Id` ASC) VISIBLE,
  INDEX `fk_Book_has_Author_Book_idx` (`ISBN` ASC) VISIBLE,
  CONSTRAINT `fk_Book_has_Author_Book`
    FOREIGN KEY (`ISBN`)
    REFERENCES `Bookstore`.`Book` (`ISBN`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Book_has_Author_Author1`
    FOREIGN KEY (`Author_Id`)
    REFERENCES `Bookstore`.`Author` (`Author_Id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Bookstore`.`Bookstore_has_Book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Bookstore`.`Bookstore_has_Book` (
  `Bookstore_Id` INT NOT NULL,
  `ISBN` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`Bookstore_Id`, `ISBN`),
  INDEX `fk_Bookstore_has_Book_Book1_idx` (`ISBN` ASC) VISIBLE,
  INDEX `fk_Bookstore_has_Book_Bookstore1_idx` (`Bookstore_Id` ASC) VISIBLE,
  CONSTRAINT `fk_Bookstore_has_Book_Bookstore1`
    FOREIGN KEY (`Bookstore_Id`)
    REFERENCES `Bookstore`.`Bookstore` (`Bookstore_Id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Bookstore_has_Book_Book1`
    FOREIGN KEY (`ISBN`)
    REFERENCES `Bookstore`.`Book` (`ISBN`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
