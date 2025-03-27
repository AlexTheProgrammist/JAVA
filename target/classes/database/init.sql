-- Clear the students table before adding new data
DELETE FROM students;

-- Create the students table if it doesn't exist
CREATE TABLE IF NOT EXISTS students (
                                        id INTEGER PRIMARY KEY AUTOINCREMENT,
                                        last_name TEXT NOT NULL,
                                        first_name TEXT NOT NULL,
                                        patronymic TEXT NOT NULL,
                                        birth_date DATE NOT NULL,
                                        record_book_number TEXT NOT NULL
);

-- Insert sample students data
INSERT INTO students (last_name, first_name, patronymic, birth_date, record_book_number)
VALUES
    ('Smith', 'John', 'Michael', '2001-01-10', '10001'),
    ('Johnson', 'Emma', 'Olivia', '2000-02-20', '10002'),
    ('Williams', 'Liam', 'James', '1999-11-15', '10003'),
    ('Jones', 'Sophia', 'Elizabeth', '2002-04-04', '10004'),
    ('Brown', 'Mason', 'Alexander', '2001-07-25', '10005'),
    ('Davis', 'Isabella', 'Charlotte', '2000-09-18', '10006'),
    ('Miller', 'Lucas', 'Daniel', '1998-12-30', '10007'),
    ('Wilson', 'Ava', 'Grace', '2003-06-12', '10008'),
    ('Moore', 'Elijah', 'David', '2002-03-01', '10009'),
    ('Taylor', 'Harper', 'Amelia', '1999-08-09', '10010'),
    ('Anderson', 'Jackson', 'William', '2000-01-11', '10011'),
    ('Thomas', 'Charlotte', 'Zoe', '2001-05-14', '10012'),
    ('Jackson', 'Benjamin', 'Ryan', '2000-11-27', '10013'),
    ('White', 'Evelyn', 'Sophia', '1999-03-03', '10014'),
    ('Harris', 'Sebastian', 'Lucas', '2002-10-17', '10015'),
    ('Martin', 'Amelia', 'Mia', '2001-08-30', '10016'),
    ('Thompson', 'James', 'Henry', '1998-04-25', '10017'),
    ('Garcia', 'Madison', 'Emily', '2001-02-14', '10018'),
    ('Martinez', 'Aiden', 'Daniel', '2003-05-19', '10019'),
    ('Roberts', 'Chloe', 'Victoria', '2000-06-23', '10020');
