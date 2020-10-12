public SafeDate(int newMonth, int newDay, int newYear) throws DateOutOfBoundsException

{

	if((newMonth <= 0) || (newMonth > 12))
	
		throws new DateOutOfBoundsException("Month " + newMonth + " illegal.");
	
	else 
		month = newMonth;

	day = newDay; 

	if(newYear < MINYEAR)
		
		throws new DateOutOfBoundsException("Year " + newYear + " too early.");
	
	else 
		
		year = newYear;
