insert into restaurant(id, name, address, cuisineType, rating) values(1, 'Fine Dining', '123 Main St', 'European', 5);
insert into restaurant(id, name, address, cuisineType, rating) values(2, 'Taco Bell', '456 Elm St', 'Fast Food', 3);
insert into restaurant(id, name, address, cuisineType, rating) values(3, 'Sushi Place', '789 Oak St', 'Japanese', 4);

insert into chef(firstName, lastName, expertise, experienceYears, restaurantId) values('John', 'Doe', 'Sous Chef', 5, 1);
insert into chef(firstName, lastName, expertise, experienceYears, restaurantId) values('Jane', 'Doe', 'Pastry Chef', 7, 1);
insert into chef(firstName, lastName, expertise, experienceYears, restaurantId) values('Mike', 'Smith', 'Head Chef', 10, 2);
insert into chef(firstName, lastName, expertise, experienceYears, restaurantId) values('Emily', 'Johnson', 'Sushi Chef', 8, 3);
insert into chef(firstName, lastName, expertise, experienceYears, restaurantId) values('Anna', 'Williams', 'Pastry Chef', 6, 3);
insert into chef(firstName, lastName, expertise, experienceYears, restaurantId) values('Mark', 'Brown', 'Sous Chef', 4, 2);
