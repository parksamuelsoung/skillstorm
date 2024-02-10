
/*
Samuel Park
Week 12 - Thursday SQL
*/

-- Order by Query Practice
#1
select * from sakila.customer
order by customer.last_name desc;

#2
select * from sakila.film
order by film.release_year;

#3
select first_name, last_name, email
from sakila.customer
order by last_name;

select first_name, last_name, email
from sakila.customer
order by first_name;

#4 
select rental_id, rental_date, return_date
from sakila.rental
order by rental_date desc;

#5
select first_name, last_name, phone
from sakila.customer
inner join sakila.address
on customer.address_id = address.address_id
where last_name like "S%"
order by last_name desc;



-- Join Query Practice
#1
select title, name
from sakila.film
inner join sakila.language
on film.language_id = language.language_id;

#2
select first_name, store_id
from sakila.staff;

#3
select first_name, rental_date
from sakila.rental
inner join sakila.customer
where rental.customer_id = customer.customer_id;

#4
select staff.first_name, count(customer_id) as "Num of Assisted Cust"
from sakila.staff
inner join sakila.customer
on staff.store_id = customer.store_id
group by first_name;

#5
select first_name, sum(amount) as "Total Payment Amount"
from sakila.customer
inner join sakila.payment
on customer.customer_id = payment.customer_id
group by first_name;

#6
select first_name, last_name, title
from sakila.customer
inner join sakila.rental
inner join sakila.inventory
inner join sakila.film
on customer.customer_id = rental.customer_id
and rental.inventory_id = inventory.inventory_id
and inventory.film_id = film.film_id
order by first_name;
