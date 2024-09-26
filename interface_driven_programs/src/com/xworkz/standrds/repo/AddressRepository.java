package com.xworkz.standrds.repo;

public interface AddressRepository {
	boolean save();

	int update();

	void delete();

	String read();

}
