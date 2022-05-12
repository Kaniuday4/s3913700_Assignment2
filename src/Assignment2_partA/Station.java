package Assignment2_partA;

public class Station {
	String name;
	int zone;
	int startStationCount;
	int endStationCount;
	public Station(String name,int zone)
	{
		this.name = name;
		this.zone = zone;
	}
	public void CountStartStattion()
	{
		this.startStationCount+=1;
	}
	public void CountEndStattion()
	{
		this.endStationCount+=1;
	}
	public void printStationStats()
	{
		
	}
}
