package com.library.services;

import java.time.LocalDateTime;
import com.library.models.Book;

public interface BookKeepingService {

	public String checkOutBook(int customerId, Book book);
	public String checkInBook(int customerId, Book book);
	public String changecheckOutTime(int customerId, LocalDateTime localDateTime);

}
