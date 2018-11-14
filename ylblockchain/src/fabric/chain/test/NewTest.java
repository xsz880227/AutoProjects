package fabric.chain.test;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  Logger log=Logger.getLogger(NewTest.class);
	  log.error("error");
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
