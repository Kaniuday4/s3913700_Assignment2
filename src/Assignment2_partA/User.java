package Assignment2_partA;

import java.util.ArrayList;

public interface User
{
	String id = null;
	String type = null;
	String first_name = null;
	String last_name = null;
	String email = null;
	double user_credit = 0;
	double discountRate = 0;
	ArrayList<String> UserHistory = new ArrayList<String>();
	
	public void setDiscountRate(double discount);

	public void AddUserJourney(String day,String depart_time,String arrival_time,String from_station,String to_station,String travel_pass,double cost);

	public void rechargeMyti();

	public void showcredit();

	public void printUserreport();
	
}

