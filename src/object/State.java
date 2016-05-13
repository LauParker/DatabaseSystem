package object;

public class State
{
	public enum state {
			ACTIVE, ON_HOLD, BLACKLIST, DECEASED, COLLECTED, CREATED,
			DELIVERED ,LOADING, OVERDUE, PAID, RETURNED, SUBMITTED, 
			CHECKED, COMPLETE, INCOMPLETE
	}
	
	public State getStateFromString(String stringEnum) {
		switch (stringEnum) {
		case "active":
			System.out.println("this is working");
		}
		return null;
	}
}
