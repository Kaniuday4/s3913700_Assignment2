package Assignment2_partA;

import java.util.ArrayList;

public class TravelPass {
	
		String type;
		String zone;
		double cost;
		String day;
		int arrival_time;
		int depart_time;
		String from_station;
		String to_station;
		
		public double GetCost(String type, String zone)
		{
			return this.cost;
		}
		public void setCost(double cost)
		{
			this.cost = cost;
		}
		public int computeZone(String from_station,String to_station,ArrayList<Station> station_list)
		{
			int[] zones = new int[3];
			int count = 0;
			for(int i=0;i<station_list.size();i++)
			{
				if(station_list.get(i).name == from_station)
				{
					zones[count] = station_list.get(i).zone;
					count++;
				}
				else if(station_list.get(i).name == to_station)
				{
					zones[count] = station_list.get(i).zone;
					count++;
				}
			}
			if(zones[0] != zones[1])
			{
				return 12;
			}
			else if(zones[0] == zones[1])
			{
				return zones[0];
			}
			return 0;
				
		}
		public double computeBestTravelPassCost(ArrayList<Station> station_list,User obj)
		{
			int zone = computeZone(this.from_station,this.to_station,station_list);
			int length = obj.UserHistory.size();
			double TravelCost = 0;
			if(length == 0)
			{
				if(zone == 1)
				{
					if(this.arrival_time - this.depart_time <= 200)
					{
						Zone1_2hours z = new Zone1_2hours();
						return z.cost;
					}
					else
					{
						Zone1_allday z = new Zone1_allday();
						return z.cost;
					}
				}
				else if(zone == 2)
				{
					if(this.arrival_time - this.depart_time <= 200)
					{
						Zone2_2hours z = new Zone2_2hours();
						return z.cost;
					}
					else
					{
						Zone2_allday z = new Zone2_allday();
						return z.cost;
					}
				}
				if(zone == 12)
				{
					if(this.arrival_time - this.depart_time <= 200)
					{
						Zone12_2hours z = new Zone12_2hours();
						return z.cost;
					}
					else
					{
						Zone12_allday z = new Zone12_allday();
						return z.cost;
					}
				}

			}
			else
			{
				String current_pass_string = obj.UserHistory.get(length-1);
				System.out.println(current_pass_string);
				
			}

		
			
			return 0;
		}
}

