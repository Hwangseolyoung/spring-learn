CREATE DATABASE mydb4;
USE mydb4;

CREATE TABLE Customers
SELECT * FROM w3schools.Customers;

DESC Customers;

ALTER TABLE Customers
MODIFY COLUMN CustomerID INT PRIMARY KEY AUTO_INCREMENT;

CREATE TABLE Employees
SELECT * FROM w3schools.Employees;

DESC Employees;

ALTER TABLE Employees
MODIFY COLUMN EmployeeID INT PRIMARY KEY AUTO_INCREMENT;

SELECT * FROM Customers; -- 91개
SELECT * FROM Employees; -- 10개

SELECT * FROM Customers ORDER BY CustomerID DESC;

CREATE TABLE Board
SELECT * FROM mydb2.Board;

CREATE TABLE Reply
SELECT * FROM mydb2.Reply;

ALTER TABLE Board MODIFY COLUMN id INT PRIMARY KEY AUTO_INCREMENT;
ALTER TABLE Reply MODIFY COLUMN id INT PRIMARY KEY AUTO_INCREMENT;

ALTER TABLE Reply ADD FOREIGN KEY (board_id) REFERENCES Board(id);

DESC Board;
DESC Reply;

SELECT * FROM Board;