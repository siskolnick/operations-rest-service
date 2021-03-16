SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema operations
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema operations
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `operations` DEFAULT CHARACTER SET utf8 ;
USE `operations` ;

-- -----------------------------------------------------
-- Table `operations`.`operation_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `operations`.`operation_type` (
  `id` TINYINT(1) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `operations`.`operation_result`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `operations`.`operation_result` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `operator1` INT NOT NULL,
  `operator2` INT NULL,
  PRIMARY KEY (`id`))
  )
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
