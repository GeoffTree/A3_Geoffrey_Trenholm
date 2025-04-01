/*Geoffrey Trenholm 991712128*/

CREATE TABLE IF NOT EXISTS department (
    dept_id BIGINT(11) PRIMARY KEY,
    dept_name VARCHAR(45),
    email VARCHAR(45) UNIQUE
);

CREATE TABLE IF NOT EXISTS employee (
    emp_id BIGINT(11) PRIMARY KEY,
    first_name VARCHAR(45),
    last_name VARCHAR(45),
    gender VARCHAR(1),
    email VARCHAR(255) UNIQUE,
    hire_date DATE
);

CREATE TABLE IF NOT EXISTS emp_dept (
    emp_id BIGINT(11),
    dept_id BIGINT(11),
    PRIMARY KEY (emp_id, dept_id),
    FOREIGN KEY (emp_id) REFERENCES employee(emp_id),
    FOREIGN KEY (dept_id) REFERENCES department(dept_id)
);