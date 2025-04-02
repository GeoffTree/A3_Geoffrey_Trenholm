/*Geoffrey Trenholm 991712128*/

DROP TABLE IF EXISTS emp_dept;
DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS department;

CREATE TABLE department (
    dept_id BIGINT(11) PRIMARY KEY,
    dept_name VARCHAR(45),
    email VARCHAR(45) UNIQUE
);

CREATE TABLE employee (
    emp_id BIGINT(11) PRIMARY KEY,
    first_name VARCHAR(45),
    last_name VARCHAR(45),
    gender VARCHAR(1),
    email VARCHAR(255) UNIQUE,
    hire_date DATE
);

CREATE TABLE emp_dept (
    emp_id BIGINT(11),
    dept_id BIGINT(11),
    PRIMARY KEY (emp_id, dept_id),
    FOREIGN KEY (emp_id) REFERENCES employee(emp_id),
    FOREIGN KEY (dept_id) REFERENCES department(dept_id)
);