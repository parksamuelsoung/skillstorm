package com.library.services.impl;

import java.time.LocalDateTime;

import com.library.models.Book;
import com.library.models.Customer;
import com.library.services.LibraryService;

public class ComputerServiceImpl implements LibraryService{

	@Override
	public String createCustomerProfile(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerProfile(int CustomerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomerProfile(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomerProfile(int CustomerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String saveBookInfo(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String checkOutBook(int customerId, Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String checkInBook(int customerId, Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changecheckOutTime(int customerId, LocalDateTime localDateTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String checkOutComputerStation(int customerId, int stationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String checkInComputerStation(int customerId, int stationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBookInfo(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book updateBookInfo(int bookId, Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBookInfo(int bookId) {
		// TODO Auto-generated method stub
		
	}

}
