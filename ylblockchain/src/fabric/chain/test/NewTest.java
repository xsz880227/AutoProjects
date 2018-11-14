package fabric.chain.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  Logger log=Logger.getLogger(NewTest.class);
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
