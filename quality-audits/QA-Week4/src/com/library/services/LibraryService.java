package com.library.services;

import java.time.LocalDateTime;

import com.library.models.Book;
import com.library.models.Customer;

public interface LibraryService {

	public String createCustomerProfile(Customer customer);
	public Customer getCustomerProfile(int CustomerId);
	public Customer updateCustomerProfile(Customer customer);
	public void deleteCustomerProfile(int CustomerId);
	public String saveBookInfo(Book book);
	public Book getBookInfo(int bookId);
	public Book updateBookInfo(int bookId, Book book);
	public void deleteBookInfo(int bookId);
	public String checkOutBook(int customerId, Book book);
	public String checkInBook(int customerId, Book book);
	public String changecheckOutTime(int customerId, LocalDateTime localDateTime);
	public String checkOutComputerStation(int customerId, int stationId);
	public String checkInComputerStation(int customerId, int stationId);
}
