DROP USER if exists 'springcrm'@'localhost' ;

CREATE USER 'springcrm'@'localhost' IDENTIFIED BY 'springcrm';

GRANT ALL PRIVILEGES ON * . * TO 'springcrm'@'localhost';