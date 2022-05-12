package Assignment2_partA;

class Zone12_allday extends TravelPass
{
		public double GetCost(String type, String zone)
		{
			type = "All day";
			zone = "Zones 1 and 2";
			cost = 6.80;
			double travel_cost = super.GetCost(type,zone);
			return travel_cost;
		}
		
		public void setCost(double cost)
		{
			this.cost = cost;
		}

}
