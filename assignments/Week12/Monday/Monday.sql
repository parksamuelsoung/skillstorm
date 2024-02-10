
# Monday Sql

#1
select * from sakila.customer;

#2
select title from sakila.film;

#3
select first_name, last_name, email from sakila.customer;

#4
select rental_id, rental_date, return_date from sakila.rental;

#5 
select title, description from sakila.film where rating like "r";

#6
select rental_id, customer_id, return_date from sakila.rental where return_date < current_date;

#7
select distinct city from sakila.city;

#8
select title, rental_rate from sakila.film where rental_rate > 4.50;

#9
select first_name, last_name from sakila.staff;

#10
select customer.first_name, customer.last_name, address.phone
from sakila.customer
inner join sakila.address on customer.address_id = address.address
where address.phone != 0 
and customer.last_name like "s%";

