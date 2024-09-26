package com.xworkz.expection.servicerunner;

import com.xworkz.exception.*;

public class ServiceRunner {
	public static void main(String[] args) throws InvalidEmail {
		// TODO Auto-generated method stub

		Service servive = new Service();

		servive.saveEmail("deekshith935347@.com");

		System.out.println("=============");

		servive.acceptPrice(107);

	}

}
