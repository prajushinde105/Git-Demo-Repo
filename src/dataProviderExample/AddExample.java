package dataProviderExample;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddExample {
  @Test(dataProvider = "add")
  public void add(int a, int b, int exp) 
  {
	  int sum = a+b;
	  System.out.println("Addition is "+ sum);
	  
	  Assert.assertEquals(sum ,exp);
	  
  }
  @DataProvider(name = "add")
  public Object[][] data()
  {
	  Object[][] obj= new Object[3][3];
	  
	  obj[0][0]=10;
	  obj[0][1]=20;
	  obj[0][2]=30;
	  
	  obj[1][0]=5;
	  obj[1][1]=6;
	  obj[1][2]=11;
	  
	  obj[2][0]=3;
	  obj[2][1]=5;
	  obj[2][2]=8;
	  
	  return obj;
	  
  }
}
