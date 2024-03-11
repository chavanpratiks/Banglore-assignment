package BangloreAssignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class BangloreAssignment2 {
	
	
    
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(" https://demo.dealsdray.com/");
		
		
		WebElement Name = driver.findElement(By.name("username"));
		Name.sendKeys("prexo.mis@dealsdray.com");
		
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("prexo.mis@dealsdray.com");
		
		WebElement  Login = driver.findElement(By.xpath("//button[@type='submit']"));
		Login.click();
		
		WebElement Order = driver.findElement(By.xpath("//span[@class='material-icons notranslate MuiIcon-root MuiIcon-fontSizeSmall css-va0op3']"));
		Order.click();
		
		WebElement Orders = driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root css-1hytwp4'])[2]"));
		Orders.click();
		
		WebElement AddBulkOrder= driver.findElement(By.xpath("//button[@align='right']"));
		AddBulkOrder.click();
		
		WebElement ChooseFile = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		ChooseFile.sendKeys("C:\\Users\\chava\\Downloads\\demo-data.xlsx");
		
		WebElement Import = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		Import.click();
setPageZoom(driver, 0.5);
	Shutterbug.shootPage(driver, Capture.FULL, true).save("C:\\Users\\chava\\git\\repository\\eclipsecode1\\Maven123\\src\\main\\java\\BangloreAssignment\\Assignment2.png\\Assignment.png");
		

	}
	private static void setPageZoom(WebDriver driver, double zoomLevel) {
    
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        
        jsExecutor.executeScript("document.body.style.zoom = arguments[0]", zoomLevel);
    }
}

 