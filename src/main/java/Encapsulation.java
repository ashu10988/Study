import org.testng.annotations.Test;

public class Encapsulation {

	String month;
	String date;
	
	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
 
	@Test
	public void test()
	{
		Encapsulation d1= new Encapsulation();
		d1.setMonth("November");
		d1.setDate("21");
		System.out.println("month :"+d1.getMonth());
		System.out.println("date: "+d1.getDate());
	}
	
}
