package Assignment2_partA;

class Zone2_allday extends TravelPass
{
	public double GetCost(String type, String zone)
		{
			type = "All day";
			zone = "Zone 2";
			cost = 4.90;
			double travel_cost = super.GetCost(type,zone);
			return travel_cost;
		}
	
		public void setCost(double cost)
		{
			this.cost = cost;
		}

}