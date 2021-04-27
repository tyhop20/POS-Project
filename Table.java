
public class Table {
	public int tableNumber;
	public boolean isClean;
	public boolean isSet;
	public int guests;
	
	public Table(int table, boolean clean, boolean set, int guest)
	{
		tableNumber = table;
		isClean = clean;
		isSet = set;
		guests = guest;
	}
	
	public int getNumber()
	{
		return tableNumber;
	}
	
	public void setNumber(int in)
	{
		tableNumber = in;
	}
	
	public boolean getClean()
	{
		return isClean;
	}
	
	public void setClean(boolean in)
	{
		isClean = in;
	}
	
	public boolean getSet()
	{
		return isSet;
	}
	
	public void setSet(boolean in)
	{
		isSet = in;
	}
	
	public int getGuests()
	{
		return guests;
	}
	
	public void setGuests(int in)
	{
		guests = in;
	}
	
	@Override
	public String toString()
	{
		return "Table #: " + tableNumber + "\nClean: " + isClean + "\nSet: " + isSet + "\nGuests: " + guests;
	}
	
	
	//Test Code
	/**
	public static void main(String[] args) {
		
		Table[] tableArray = new Table[30];
		
		for ( int i = 0; i < 30; i++)
		{
			tableArray[i] = new Table(i + 1, true, true, i);
		}
		
		for ( int i = 0; i < 30; i++)
		{
			System.out.println(tableArray[i]);
			System.out.println("");
		}
	}
	**/

}
