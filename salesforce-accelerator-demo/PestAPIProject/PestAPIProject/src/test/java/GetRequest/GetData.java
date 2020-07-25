package GetRequest;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class GetData {
	
	String api = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
	
	@Test
	public void testResponsecode()
	{
		int code=get(api).getStatuscode();
		System.out.println("Coide"+code);
		Assert.assertEquals(code, 200);
	}

	
	@Test
	public void testboday()
	{
		Long time =get(api).getTime();
		System.out.println("time"+time);
	}
}
