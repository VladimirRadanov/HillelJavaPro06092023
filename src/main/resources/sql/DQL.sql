SELECT * FROM homework;
SELECT * FROM lesson;
SELECT * FROM schedule;

-- Extract all homework details;
SELECT homework.name, homework.description,
       lesson.name, lesson.updatedat,
       schedule.name, schedule.updatedat
FROM homework
INNER JOIN lesson ON homework.id = lesson.homework_id
INNER JOIN schedule ON lesson.id = schedule.lessons;