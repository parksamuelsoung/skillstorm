
select * from bookstore.book_has_author;
select * from bookstore.bookstore_has_book;
select * from bookstore.author;
select * from bookstore.book;
select * from bookstore.location;

select location.name, location.address
from bookstore.location
inner join bookstore.bookstore_has_book on location.bookstore_id = bookstore_has_book.bookstore_id
where bookstore_has_book.ISBN = "4b00";