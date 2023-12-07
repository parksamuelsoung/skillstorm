package com.library.services;

public interface ComputerKeepingService {

	public String checkOutComputerStation(int customerId, int stationId);
	public String checkInComputerStation(int customerId, int stationId);
}
