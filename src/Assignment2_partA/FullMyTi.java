package Assignment2_partA;
import java.util.ArrayList;


public class FullMyTi implements User{
	
	
	String id;
	String type;
	String first_name;
	String last_name;
	String email;
	double user_credit;
	double discountRate;
	ArrayList<String> UserHistory;
	
	
	public FullMyTi(String id,String type, String first_name,String last_name, String email,double user_credit)
	{
		this.id = id;
		this.type = type;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.user_credit = user_credit;
		this.discountRate = 0;
	}
	public void setDiscountRate(double discount)
	{
		discountRate = discount;
	}
	public void AddUserJourney(String day,String depart_time,String arrival_time,String from_station,String to_station,String travel_pass,double cost)
	{
		UserHistory.add("");
	}
	public void rechargeMyti()
	{
		double credit = 0;
		this.user_credit+=credit;
	}
	public void showcredit()
	{
		System.out.println(this.user_credit);
	}
	public void printUserreport()
	{
		System.out.println(this.UserHistory);
	}


	
}
