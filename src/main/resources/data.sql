/*Geoffrey Trenholm 991712128*/

-- Departments
INSERT INTO department (dept_id, dept_name, email) VALUES (10000000001, 'HR', 'hr@example.com');
INSERT INTO department (dept_id, dept_name, email) VALUES (10000000002, 'Finance', 'finance@example.com');
INSERT INTO department (dept_id, dept_name, email) VALUES (10000000003, 'IT', 'it@example.com');
INSERT INTO department (dept_id, dept_name, email) VALUES (10000000004, 'Marketing', 'marketing@example.com');
INSERT INTO department (dept_id, dept_name, email) VALUES (10000000005, 'Operations', 'operations@example.com');

-- Employees
INSERT INTO employee (emp_id, first_name, last_name, gender, email, hire_date)
VALUES (10000000011, 'John', 'Doe', 'M', 'john.doe@example.com', '2022-01-01');

INSERT INTO employee (emp_id, first_name, last_name, gender, email, hire_date)
VALUES (10000000012, 'Jane', 'Smith', 'F', 'jane.smith@example.com', '2021-06-15');

INSERT INTO employee (emp_id, first_name, last_name, gender, email, hire_date)
VALUES (10000000013, 'Alice', 'Johnson', 'F', 'alice.johnson@example.com', '2023-03-22');

INSERT INTO employee (emp_id, first_name, last_name, gender, email, hire_date)
VALUES (10000000014, 'Bob', 'Williams', 'M', 'bob.williams@example.com', '2020-11-09');

INSERT INTO employee (emp_id, first_name, last_name, gender, email, hire_date)
VALUES (10000000015, 'Charlie', 'Brown', 'M', 'charlie.brown@example.com', '2019-07-30');
