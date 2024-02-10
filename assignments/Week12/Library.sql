-- comment
# comment
/* comment */ 

create database library_ms;

create table library_ms.library (
	Library_ID int not null auto_increment,
    Name varchar(45) null,
    Location varchar(45) null,
    primary key(Library_ID)
);

create table library_ms.book (
	Book_ID int not null auto_increment,
    Book_Name varchar(45) null,
    Author varchar(45) null,
    ISBN varchar(45) null,
    Library_ID int null,
    primary key(Book_ID),
    foreign key(Library_ID) references library_ms.library(Library_ID)
);

alter table library_ms.book
change column Book_Name Title varchar(45);

insert into library_ms.library (name, location)
values ("Piedmont Library", "Georgia"),
	("Memorial Library", "Texas"),
    ("Little Free Library", "Georgia"),
    ("Golden Gate Library", "California"),
    ("Willow Creek Library", "North Carolina"),
    ("The Library", "South Carolina")
;

delete from library_ms.library
where Library_ID >= 0;

update library_ms.library
set name = "Willow Creek Library"
where library_id = 12;

insert into library_ms.book (title, author, ISBN, library_id)
value ("Gone With The Wind", "Margaret Mitchell", "abc001001", 8),
	("Gone With The Wind", "Margaret Mitchell", "abc001001", 12),
	("The Color Purple", "Marsha Norman", "abc006121", 9),
    ("Can't Hurt Me", "David Goggis", "aec101101", 8),
    ("Guards! Guards!", "Terry Pratchett", "abd014021", 10),
    ("Little Women", "Lousia May Alcott", "abd014021", 13),
    ("Little Women", "Lousia May Alcott", "abd014022", 12),
    ("Little Women", "Lousia May Alcott", "abd014021", 13),
    ("The Catch in the Rye", "J. D. Salinger", "abd023661", 9),
    ("The Scarlett Letter", "Nathaneal Hawthorne", "abd024021", 11),
    ("The Princess Bride", "William Goldman", "abd014451", 11),
    ("The Simlarilioin", "J.R.R Tolkein", "abd001311", 12),
    ("The Fall of the House of Usher", "Edgar Allen Poe", "ace111431", 10),
    ("The Raven", "Edgar Allen Poe", "ace1431", 9)
;

update library_ms.book
set author = "Louisa May Alcott"
where book_id between 21 and 23;

select * from library_ms.book
where author = "Edgar Allen Poe";

select * from library_ms.library;
select * from library_ms.book;

