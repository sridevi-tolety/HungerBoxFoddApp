DROP TABLE IF EXISTS item;

CREATE TABLE item (
id INT AUTO_INCREMENT PRIMARY KEY,
vendorname varchar(250) not null,
itemcode VARCHAR(250) NOT NULL,
itemname VARCHAR(250) NOT NULL,
  priceperunit number not null
);
