package testng;

import org.testng.annotations.Test;

public class demo02 {
  @Test(groups ={"signup"}, priority=0)
  public void signup() {
	  System.out.println("signup");
  }
  
  @Test(groups ={"login"}, priority=1)
  public void login() {
	  System.out.println("login");
  }
  
  @Test(groups ={"add to cart"}, priority=2)
  public void addtocart() {
	  System.out.println("add to cart");
  }
  
  @Test(groups ={"payment"}, priority=3)
  public void payment() {
	  System.out.println("payment");
  }
}
