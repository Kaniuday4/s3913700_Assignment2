package Assignment2_partA;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class MyTiSystem {
	final static double CREDIT_LIMIT = 100.0;
	final static int ALLOWED_MULTIPLE = 5;


    HashMap<String, User> user_list = new HashMap<String, User>();
    ArrayList<Station> station_list = new ArrayList<Station>();
    String[] station_names = {
    		  "Central", 
    		  "Flagstaff", 
    		  "Richmond", 
    		  "Lilydale",
    		  "Epping"
    		};

    int[] station_zones = {1,1,1,2,2}; 
    String[] days = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
    
    String[] user_ids = {"lc","o vm"};
    String[] user_type = {"Senior","Adult"};
    String[] user_firstnames = {"Lawrence","Xiang"};
    String[] user_lastnames = {"Cavedon","Li"};
    String[] user_emailid = {"lawrence.cavedon@rmit.edu.au","vuhuy.mai@rmit.edu.au"};
    double[] user_credit = {50.0,20.0};


	public static void main(String[] args)
	{
		System.out.println("Welcome to MyTi!");
		MyTiSystem menu = new MyTiSystem();
		menu.menufunc();
	}
	public void menufunc()
	{
		double credit = 0;
		init_station();
		init_users();
		Scanner input = new Scanner(System.in);
		System.out.println("\nChoose an option:\n1. Buy a travel pass\n2. Charge my MyTi\n3. Show remaining credit\n4. Print User report\n5. Update price\n6. Show station statistics\n7. Add a new user\n8. Print all purchases\n9. Exit");
		System.out.print("Please make a selection: ");
		int option;
		option = input.nextInt();
		switch(option)
		{
			case 1:
				BuyTravelPass();
				break;
			case 2:
				ChargeMyMyti();
				break;
			case 3:
				ShowRemainingCredit();
				break;
			case 4:
				PrintUserReports();
				break;
			case 5:
				UpdatePrice();
				break;
			case 6:
				ShowStationstats();
			case 7:
				AddNewUser();
				break;
			case 8:
				PrintAllPurchases();
				break;
			case 9:
				System.out.println("\nGoodBye!");
				System.exit(0);
			default:
				System.out.println("Sorry, that is an Invalid option!");
		}
	}
	public void init_station()
	{	 
	    for(int i=0;i<station_names.length;i++)
	    {
	    	Station s = new Station(station_names[i],station_zones[i]);
	    	station_list.add(s);
	    }
	}
	public void init_users()
	{
		System.out.println("Hi");
		for(int i=0;i<user_ids.length;i++)
		{
			if(user_type[i] == "Senior")
			{
				SeniorMyTi s = new SeniorMyTi(user_ids[i],user_type[i],user_firstnames[i],user_lastnames[i], user_emailid[i],user_credit[i]);
				user_list.put(user_ids[i],s);
			}
			else if(user_type[i] == "Junior")
			{
				JuniorMyTi j = new JuniorMyTi(user_ids[i],user_type[i],user_firstnames[i],user_lastnames[i], user_emailid[i],user_credit[i]);
				user_list.put(user_ids[i],j);
			}
			else if(user_type[i] == "Adult")
			{
				FullMyTi f = new FullMyTi(user_ids[i],user_type[i],user_firstnames[i],user_lastnames[i], user_emailid[i],user_credit[i]);
				user_list.put(user_ids[i],f);
			}
		}
		
	}
	
	public void BuyTravelPass()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter user ID: ");
		String user_id = input.next();
		
        if(user_list.containsKey(user_id))
        {
        	// get user object
        	User obj = user_list.get(user_id);
        	TravelPass t = new TravelPass();
    		System.out.print("From what station: ");
    		t.from_station = input.next();
    		System.out.print("\nTo what station: ");
    		t.to_station = input.next();
    		System.out.print("\nWhat day : ");
    		t.day = input.next();
    		System.out.print("\nDeparture time: ");
    		t.depart_time = input.nextInt();
    		System.out.print("\nArrival time: ");
    		t.arrival_time = input.nextInt();
    		
    		// get best travel pass type and cost based on user's last journey
    		double cost = t.computeBestTravelPassCost(station_list,obj);

    		// Put user travel history
    		//User obj = new User();
    		//obj.AddUserJourney(day,depart_time,arrival_time,from_station,to_station,travel_pass,cost);
    		
        }
        else
        {
        	System.out.println("Invaild user");
        }
        
	}

	public void ChargeMyMyti()
	{
		
	}
	public void ShowRemainingCredit()
	{
		
	}

	public void PrintUserReports()
	{
		
	}
	public void UpdatePrice()
	{
		TravelPass t = new TravelPass();
		double new_cost = 0;
		t.setCost(new_cost);
	}
	public void ShowStationstats()
	{
		for(int i = 0;i < station_list.size();i++)
		{
			
		}
	}
	public void AddNewUser()
	{   
		Scanner input = new Scanner(System.in);
		String user_id = input.next();
		String user_firstname = input.next();
		String user_lastname = input.next();
		String user_type = input.next();
		String user_email = input.next();
		double user_credit = 0;


		if(user_type == "Adult")
		{
			FullMyTi f = new FullMyTi(user_id,user_firstname,user_lastname,user_type,user_email,user_credit);
			user_list.put(user_id,f);
		}
		else if(user_type == "Junior")
		{
			JuniorMyTi j = new JuniorMyTi(user_id,user_firstname,user_lastname,user_type,user_email,user_credit);
			user_list.put(user_id,j);
		}
		else if(user_type == "Senior")
		{
			SeniorMyTi s = new SeniorMyTi(user_id,user_firstname,user_lastname,user_type,user_email,user_credit);
			user_list.put(user_id,s);
		}	
		
	}
	public void PrintAllPurchases()
	{
		// print all user history
	}
	
}
