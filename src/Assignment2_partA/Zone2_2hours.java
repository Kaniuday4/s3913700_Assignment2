package Assignment2_partA;

class Zone2_2hours extends TravelPass
{
		public double GetCost(String type, String zone)
		{
			type = "2 hours";
			zone = "Zone 2";
			cost = 2.50;
			double travel_cost = super.GetCost(type,zone);
			return travel_cost;
		}
		
		public void setCost(double cost)
		{
			this.cost = cost;
		}
	
}
