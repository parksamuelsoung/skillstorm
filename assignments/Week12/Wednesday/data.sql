


# Table location
insert into bookstore.location
values (1, "Livingston's Cafe and Books", "409 Oliver St."),
	(2, "Books N' More", "1122 Maple St."),
    (3, "College Textbooks", "48 E. Washington Ave.")
;

# Table Book
insert into bookstore.book
values ("1a00", "Fish Facts", "Informational"),
	("2b00", "The Phantom Tollbooth", "Fantasy"),
    ("3b00", "The Three Billy Goats", "Fable"),
    ("4b00", "Shrek", "Fairy Tale"),
    ("5b00", "Our Space Trip", "Sci-Fi")
;

# Table Author
insert into bookstore.author
values (1, "Frank Fishman"),
	(2, "Sally Shuman"),
    (3, "Laura Liem"),
    (4, "Parker Prince"),
    (5, "Abby Apples")
;

insert into bookstore.bookstore_has_book
values (1, "1a00"), (1, "2b00"), (1, "3b00"), (1, "4b00"), (1, "5b00"),
	(2, "3b00"), (2, "4b00"), (2, "5b00"),
    (3, "5b00")
;

insert into bookstore.book_has_author
values ("1a00", 1), ("1a00", 2), ("1a00", 3), ("1a00", 4), ("1a00", 5),
	("2b00", 2), ("2b00", 3), ("2b00", 4), ("2b00", 5),
    ("3b00", 3), ("3b00", 4), ("3b00", 5),
    ("4b00", 4), ("4b00", 5),
    ("5b00", 5)
;
