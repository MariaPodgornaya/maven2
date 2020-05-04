package tests;

import com.sun.org.glassfish.gmbal.ManagedAttribute;
import pages.BasePage;

     @RunWith(SerenityRunner.class)
 public abstract class SimpleTest {

     @Managed (driver = "chrome", uniqueSession = true)
     private WebDriver driver;

     @Steps
    public User user;

     @After
     public void tearDown() {
         driver.quit();
     }

}
