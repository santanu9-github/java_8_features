package all_interface;

interface Festival
{
	String greeting="Always be enthusiastic like in festive seasons";

	//defining default method
	public default void celebrate()
	{
		System.out.println("celebrating..."+greeting);
	}
}

class Dassera implements Festival
{
	public void start()
	{
		//reference for interface
		Festival festival;
		
		festival=new Dassera();
		
		festival.celebrate();
		
	}
	
}


abstract class Weather{
	int airSpeed;
	float temperature;
	float humidity;
	
	public abstract void timeTakentoVisitSeashore();
	
	public  void showWheather()
	{
		System.out.println("Temperature:"+temperature+" degrees celcius");
		System.out.println("Humidity in air:"+humidity);
		System.out.println("Air speed:"+airSpeed+" per km");
	}
	
	
	

}

class Bangaloreweather extends Weather
{
	float heightFromSealevel;

	public float getHeightFromSealevel() {
		return heightFromSealevel;
	}

	public void setHeightFromSealevel(float heightFromSealevel) {
		this.heightFromSealevel = heightFromSealevel;
	}
	public void timeTakentoVisitSeashore() {
		System.out.println("no near by sea locations in a couple of hours");
	}
	
	
}
class Chennaiweather extends Weather
{
	int dangerFlagatSeashore;
	
	public void timeTakentoVisitSeashore() {
		
		System.out.println("In a couple of hours, we can go to sea shore");
	}
	
}

class Location
{
	Float logitude;
	Float lattitude;
	boolean seaShore;
	Weather weather;
}




   class Refsdemo {

	public static void main(String[] args) {
		
		//creating object for a class
		Location bl=getLocation();
		Dassera dassera=new Dassera();
		
		dassera.start();
		
		//create reference for abstract class
		Weather bw;
		Bangaloreweather bwo=new Bangaloreweather();
		bw=bwo;
		
		//set properties for Bangaloreweather object
		
		Weather cw=new Chennaiweather();
		
		

	}
	
	public static Location getLocation()
	{
		return new Location();
	}

   }
