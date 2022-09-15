Create database gestion_concours;
\c gestion_concours;

create table candidacy(
    id_candidacy serial primary key,
    serie varchar(50)
);

Create table candidate(
    id_candidate serial primary key,
    name_candidate varchar(100),
    firstname_candidate varchar(100),
    birth_date date,
    mail varchar(60),
    contact varchar(10),
    id_candidacy int references candidacy(id_candidacy) not null
);
create table topic(
    id_topic serial primary key,
    name_topic varchar (50)
);

create table Average(
    id_Average serial primary key,
    points float check (points <= 20) not null,
    id_candidate int references candidate (id_candidate) not null
);
