CREATE TABLE IF NOT EXISTS homework(
    id SERIAL PRIMARY KEY,
    name TEXT,
    description TEXT
);

CREATE TABLE IF NOT EXISTS lesson(
    id SERIAL PRIMARY KEY,
    name TEXT,
    upDATEdAt DATE,
    homework_id INTEGER REFERENCES homework(id)
);

CREATE TABLE IF NOT EXISTS schedule(
    id SERIAL PRIMARY KEY,
    name TEXT,
    upDATEdAt DATE,
    lessons INTEGER REFERENCES lesson(id)
);

-- schedule - lessons(many-to-many) relationship
CREATE TABLE IF NOT EXISTS schedule_lesson(
    schedule_id INTEGER REFERENCES lesson(id),
    lesson_id INTEGER REFERENCES schedule(id),
    CONSTRAINT schedule_lesson_pk PRIMARY KEY(schedule_id, lesson_id)
);


-- DB cleanup
--DROP TABLE if EXISTS homework, lesson, schedule, schedule_lesson;