CREATE TABLE cities
(
    id               BIGINT NOT NULL,
    name_ru          VARCHAR(255),
    name_en          VARCHAR(255),
    number_residents INTEGER,
    region_id        BIGINT,
    CONSTRAINT pk_cities PRIMARY KEY (id)
);

CREATE TABLE regions
(
    id   BIGINT NOT NULL,
    code INTEGER,
    name VARCHAR(255),
    CONSTRAINT pk_regions PRIMARY KEY (id)
);

ALTER TABLE cities
    ADD CONSTRAINT FK_CITIES_ON_REGION FOREIGN KEY (region_id) REFERENCES regions (id);
CREATE TABLE cities
(
    id               BIGINT NOT NULL,
    name_ru          VARCHAR(255),
    name_en          VARCHAR(255),
    number_residents INTEGER,
    region_id        BIGINT,
    CONSTRAINT pk_cities PRIMARY KEY (id)
);

CREATE TABLE regions
(
    id   BIGINT NOT NULL,
    code INTEGER,
    name VARCHAR(255),
    CONSTRAINT pk_regions PRIMARY KEY (id)
);

ALTER TABLE cities
    ADD CONSTRAINT FK_CITIES_ON_REGION FOREIGN KEY (region_id) REFERENCES regions (id);