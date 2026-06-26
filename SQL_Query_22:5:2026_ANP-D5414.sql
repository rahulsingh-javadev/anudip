CREATE DATABASE college_db;

USE college_db;

CREATE TABLE students (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(50),
    age INT,
    course VARCHAR(50),
    city VARCHAR(50)
);

INSERT INTO students VALUES
(101, 'Amit', 21, 'Java', 'Delhi'),
(102, 'Rahul', 20, 'Python', 'Mumbai'),
(103, 'Anjali', 22, 'Java', 'Delhi'),
(104, 'Priya', 19, 'C++', 'Pune'),
(105, 'Arjun', 23, 'Web Development', 'Bangalore');

SELECT * FROM students;SELECT student_name, course FROM students;
SELECT * FROM students
WHERE city = 'Delhi';SELECT * FROM students WHERE age > 20;
SELECT * FROM students WHERE course = 'Java';
SELECT * FROM students WHERE student_name LIKE 'A%';
UPDATE students SET course = 'Spring Boot' WHERE student_id = 101;
UPDATE students SET city = 'Chennai' WHERE student_id = 102;
DELETE FROM students WHERE student_id = 105;
CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(50),
    department VARCHAR(50),
    salary DECIMAL(10,2)
);
INSERT INTO employees VALUES
(1, 'Rahul', 'IT', 50000),
(2, 'Sneha', 'HR', 45000),
(3, 'Aman', 'IT', 60000),
(4, 'Priya', 'Finance', 55000),
(5, 'Rohit', 'HR', 48000);
SELECT * FROM employees ORDER BY salary ASC;
SELECT employee_name FROM employees ORDER BY employee_name DESC;
SELECT * FROM employees ORDER BY salary DESC LIMIT 3;
SELECT COUNT(*) AS total_employees FROM employees;
SELECT AVG(salary) AS average_salary FROM employees;
SELECT MAX(salary) AS highest_salary FROM employees;
SELECT MIN(salary) AS lowest_salary FROM employees;
SELECT department, COUNT(*) AS total_employees FROM employees GROUP BY department;
SELECT department, AVG(salary) AS average_salary FROM employees GROUP BY department;
SELECT department, COUNT(*) AS total_employees FROM employees GROUP BY department HAVING COUNT(*) > 1;
CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(50),
    city VARCHAR(50)
);
CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    order_amount DECIMAL(10,2),
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);
 INSERT INTO customers VALUES
(1, 'Rahul', 'Delhi'),
(2, 'Priya', 'Mumbai'),
(3, 'Amit', 'Pune'),
(4, 'Sneha', 'Delhi'),
(5, 'Arjun', 'Bangalore');
INSERT INTO orders VALUES
(101, 1, 1200),
(102, 2, 3000),
(103, 1, 2500),
(104, 3, 1500),
(105, 5, 5000);

SELECT c.customer_name, o.order_amount
FROM customers c INNER JOIN orders o ON c.customer_id = o.customer_id;
SELECT c.customer_name, o.order_amount
FROM customers c LEFT JOIN orders o ON c.customer_id = o.customer_id;
SELECT c.customer_name, o.order_amount
FROM customers c INNER JOIN orders o ON c.customer_id = o.customer_id ORDER BY o.order_amount DESC LIMIT 1;
