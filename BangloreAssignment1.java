package BangloreAssignment;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class BangloreAssignment1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.getcalley.com/");
Shutterbug.shootPage(driver, Capture.FULL, true).save("C:\\Users\\chava\\git\\repository\\eclipsecode1\\Maven123\\src\\main\\java\\BangloreAssignment\\Assignment1.png");
	}
	private static void setPageZoom(WebDriver driver, double zoomLevel) {
    
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        
        jsExecutor.executeScript("document.body.style.zoom = arguments[0]", zoomLevel);
    }
		

	}

