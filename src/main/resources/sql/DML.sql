INSERT INTO homework (name, description)
VALUES ('homework1', 'description1'),
       ('homework2', 'description1'),
       ('homework3', 'description3');

INSERT INTO lesson (name, updatedat, homework_id)
VALUES ('lesson1', '2023-11-19', 1),
       ('lesson2', '2023-11-19', 2),
       ('lesson3', '2023-11-19', 3);

INSERT INTO schedule (name, updatedat, lessons)
VALUES ('schedule1', '2023-11-19', 1),
       ('schedule2', '2023-11-19', 2),
       ('schedule1', '2023-11-19', 3);

-- Delete all records
--TRUNCATE homework, lesson, schedule, schedule_lesson;
