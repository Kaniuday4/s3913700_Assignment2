package Assignment2_partA;

class Zone12_2hours extends TravelPass
{
		public double GetCost(String type, String zone)
		{
			type = "2 hours";
			zone = "Zones 1 and 2";
			cost = 3.50;
			double travel_cost = super.GetCost(type,zone);
			return travel_cost;
		}

		public void setCost(double cost)
		{
			this.cost = cost;
		}
}
