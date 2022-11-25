-- `springboot-vue`.book definition

CREATE TABLE `book` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `author` varchar(20) DEFAULT NULL,
  `tid` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `book_FK` (`tid`),
  CONSTRAINT `book_FK` FOREIGN KEY (`tid`) REFERENCES `book` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;