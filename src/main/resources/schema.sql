create table Movie(
      id int not null primary key,
      name varchar_ignorecase(150) not null,
      category varchar_ignorecase(150) not null,
      point varchar_ignorecase(150) not null,
      create_year int
      );
