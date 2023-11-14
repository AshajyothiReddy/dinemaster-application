create table if not exists restaurant(
    id INT primary key AUTO_INCREMENT,
    name varchar(255),
    address varchar(255),
    cuisineType varchar(255),
    rating INT
);

create table if not exists chef(
    id INT primary key AUTO_INCREMENT,
    firstName varchar(255),
    lastName varchar(255),
    expertise varchar(255),
    experienceYears INT,
    restaurantId INT,
    FOREIGN KEY restaurantId references restaurant(id)
);