package BangloreAssignment;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class Firefox {

	public static void main(String[] args) {
	WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Dimension d= new Dimension(300,400);
	
		driver.get("https://www.getcalley.com/calley-pro-features/");
Shutterbug.shootPage(driver, Capture.FULL, true).save("C:\\Users\\chava\\git\\repository\\eclipsecode1\\Maven123\\src\\main\\java\\BangloreAssignment\\firefox.png");
	}
	private static void setPageZoom(WebDriver driver, double zoomLevel) {
    
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        
        jsExecutor.executeScript("document.body.style.zoom = arguments[0]", zoomLevel);
    }


	}


