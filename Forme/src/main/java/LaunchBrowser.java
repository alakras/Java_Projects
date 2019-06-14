import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\newworkspace\\Forme\\src\\main\\resources\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.gajananmaharaj.org/");
driver.getTitle();


	}

}
