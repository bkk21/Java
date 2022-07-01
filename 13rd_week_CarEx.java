class Car
{
	String color;
	int speed;
	
	public Car(String color) 
	{
		this.color = color;
		this.speed = 0;
	}
	
	public void engineStart() 
	{
		System.out.println("engine start");
	}

	public void engineStop() 
	{
		System.out.println("engine stop");
	}
		
	public void speedUp() 
	{
		speed++;
		System.out.println("speed up(" + speed + ")");
	}
	
	public void speedDown() 
	{
		if (speed > 0)
			speed--;
		System.out.println("speed down(" + speed + ")");
	}
}

class CarDF extends Car
{
	int cargoSize;
	
	public CarDF(String color, int cargoSize) 
	{
		super(color);
		this.cargoSize = cargoSize;
	}
}

class Convertible extends Car
{
	public Convertible(String color) 
	{
		super(color);
	}
	
	public void openRoof() 
	{
		System.out.println("open roof");
	}
	
	public void closeRoof() 
	{
		System.out.println("close roof");
	}
}

class DumpTruck extends CarDF
{	
	public DumpTruck(String color, int cargoSize) 
	{
		super(color, cargoSize);
	}
	
	public void dump() 
	{
	System.out.println("dump");
	}
}

class FreezerTruck extends CarDF
{
	int temperature;
	public FreezerTruck(String color, int cargoSize, int temp) 
	{
		super(color, cargoSize);
		temperature = temp;
	}

	public void setTemperature(int temp) 
	{
	temperature = temp;
	System.out.println("set temperature(" + temperature + ")");
	}
}

public class CarEx
{
	public static void main(String[] args)
	{
		Convertible c = new Convertible("red");
		System.out.println("Convertible: ");
		c.engineStart();
		c.speedUp();
		c.openRoof();
		c.closeRoof();
		c.speedDown();
		c.engineStop();
		System.out.println();
		
		DumpTruck d = new DumpTruck("blue", 10);
		System.out.println("Dump truck: ");
		d.engineStart();
		d.speedUp();
		d.speedDown();
		d.dump();
		d.engineStop();
		System.out.println();
		
		FreezerTruck f = new FreezerTruck("blue", 10, 0);
		System.out.println("Freezer truck: ");
		f.engineStart();
		f.setTemperature(-20);
		f.speedUp();
		f.speedDown();
		f.engineStop();
		System.out.println();
	}
}
