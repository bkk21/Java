public class AlarmTime 
{
	int hour;
	int minute;
	boolean active;
	
	public AlarmTime(int hour, int minute) 
	{
		setHour(hour);
		setMinute(minute);
	}
	
	public AlarmTime(int hour, int minute, boolean active) 
	{
		this(hour, minute);
		
		if(active == true)
			this.active = active;
		else
			this.active = false;
	}
	
	public int getHour() 
	{
		return hour;
	}
	
	public int getMinute() 
	{
		return minute;
	}
	
	public boolean isActive() 
	{
		return active;
	}
	
	public void setHour(int hour) 
	{
		if(hour>= 0 && hour < 24)
			this.hour = hour;
		else
			this.hour = 0;
	}
	
	public void setMinute(int minute) 
	{
		if(minute >= 0 && minute < 60)
			this.minute = minute;
		else
			this.minute = 0;
	}
	
	public static void main(String[] args) 
	{
		AlarmTime[] arr = new AlarmTime[10];
		
		arr[0] = new AlarmTime(3, 45, true);
		arr[1] = new AlarmTime(10, 30, true);
		arr[2] = new AlarmTime(18, 10);
		
		System.out.println("<Default AlarmTime>");
		for(int i = 0; i<10; i++)
		{
			if(arr[i] != null)
				System.out.printf("%02d:%02d %s\n", arr[i].getHour(), arr[i].getMinute(), arr[i].isActive());
		}
		
		System.out.println();
		System.out.println("<Set AlarmTime>");
		
		arr[0].setHour(12);
		arr[1].setMinute(22);
		arr[2].setHour(12);
		arr[2].setMinute(22);
		
		for(int i=0; i<10; i++)
		{
			if(arr[i] != null)
				System.out.printf("%02d:%02d %s\n", arr[i].getHour(), arr[i].getMinute(), arr[i].isActive());
		}
	}
}

