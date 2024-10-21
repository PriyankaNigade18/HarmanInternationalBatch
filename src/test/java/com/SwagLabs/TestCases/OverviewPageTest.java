package com.SwagLabs.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLabs.Base.BaseTest;
import com.SwagLabs.Utility.Utility;

public class OverviewPageTest extends BaseTest
{
	
	@BeforeClass
	public void pageSetUp()
	{
		ip=lp.doLogin(prop.getData("un"),prop.getData("psw"));
		addWait();
		
		ip.addProductToCart(prop.getData("pname2"));
		addWait();
		cp=ip.getCartPage();
		addWait();
		ch=cp.doCheckOut();
		op=ch.doContinue(prop.getData("fn"),prop.getData("ln"),prop.getData("zc"));
		
	}
	
	
  @Test(priority=1)
  public void validateSummary() 
  {
	  op.getSummary();
  }
  
  @Test(priority=2)
  public void validateOrderCompleteProcess()
  {
	  op.doCompleteOrder();
  }
}
