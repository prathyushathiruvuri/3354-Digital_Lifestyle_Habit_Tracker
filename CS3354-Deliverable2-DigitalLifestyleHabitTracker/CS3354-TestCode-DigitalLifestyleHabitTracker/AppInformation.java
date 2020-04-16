
public class AppInformation 
{
	//Time limit for app in minutes.
	private float timeLimit = -1;
	//Time spent in app total in minutes.
	private float timeSpentTotal = 0;
	//Time spent in app for today in minutes.
	private float timeSpentToday = 0;
	//Whether or not the app is locked and the user can access it.
	private boolean isLocked = false;
	
	//Sets limit for app. Returns true if valid limit, returns false if invalid.
	public String setLimit(int limit)
	{
		timeLimit = limit;
		if(limit > 0)
		{
			isLocked = false;
			return "Time limit set";
		}
		else if(limit < 0)
		{
			isLocked = false;
			return "App unlocked";
		}
		else
		{
			isLocked = true;
			return "App locked";
		}
	}
	
	public float getTimeLimit()
	{
		return timeLimit;
	}
	
	public float getTimeSpentTotal()
	{
		return timeSpentTotal;
	}
	
	public float getTimeSpentToday()
	{
		return timeSpentToday;
	}
	
	public boolean getIsLocked()
	{
		return isLocked;
	}
}
