CREATE DATABASE product_db;

USE product_db;

CREATE TABLE products (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(255),
quota INT,
price DECIMAL(10, 2)
);


SELECT id, name, quota, price
FROM products;

