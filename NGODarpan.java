import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class NGO
{
	public static void main(String[] args) throws InterruptedException{
	WebDriver driver = new ChromeDriver();
    driver.get("https://ngodarpan.gov.in/index.php/home/statewise_ngo/13140/7/70?per_page=100");
   
    List<WebElement> list = driver.findElements(By.xpath("//tr/td/a"));
    
    for(WebElement i : list) {
    i.click();
    Thread.sleep(1000);
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
    String handle = driver.getWindowHandle();
    driver.switchTo().window(handle);
    String ngo_name = driver.findElement(By.id("ngo_name_title")). getText();
    Thread.sleep(1000);
    String mobile_number = driver.findElement(By.id("mobile_n")).getText();
    Thread.sleep(1000);
    String email = driver.findElement(By.id("email_n")). getText();
    System.out.print("\n");
    System.out.print(ngo_name);
    System.out.print(",\t");
    System.out.print(mobile_number);
    System.out.print(",\t");
    System.out.print(email);
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='ngo_info_modal']//button[@class='close']")).click();
    Thread.sleep(1000);
    driver.switchTo().defaultContent();
	}
    System.out.print("\n----------------------------------------------------------------------\n");
  }
}
