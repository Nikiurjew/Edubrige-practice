package stringbuffer;

import stringbuffer.Enum_1.Month;


public class Enum {

	enum Day {
		SUNDAY,
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY;
		
	}
	
	enum Month{
		JANUARY,
		FEBRUARY,
		MARCH,
		APRIL,
		MAY,
		JUNE,
		JULY,
		AUGUST,
		SEPTEMBER,
		OCTOBER,
		NOVEMBER,
		DECEMBER;
	}
	enum Season {
		Spring,
		Summer,
		Monsoon,
		Authun,
		Winter;
		
	}
	
	public static void main(String[] args) {
		Day today = Day.MONDAY;
		System.out.println("Today is " +today);
		Month A = Month.NOVEMBER;
		System.out.println("Today's Month is " +A);
		Season b = Season.Winter;
		System.out.println(b);
	}

}
