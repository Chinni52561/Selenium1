package emDetails;
    import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
		public class Currency{
		public static void main(String[] args) {
			
		
		        // step 1:open the  browser
		        
		        ChromeDriver driver = new ChromeDriver(); 
		         //maximize the browser
		         driver.manage().window().maximize();
				//add implicit wait

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			    
			    
		
		        // Step 2: Navigate to www.google.com
		        driver.get("https://www.google.com");

		        // Step 3: Enter text - USD to INR exchange rate
		        WebElement searchBox = driver.findElement(By.name("q"));
		        searchBox.sendKeys("USD to INR exchange rate");

		        // Step 4: Click on the search button
		        searchBox.submit();
		        
		        // Step 5: Read the exchange rupee value and print it in the console
		        WebElement result = driver.findElement(By.cssSelector("div[data-attrid='kc:/finance/currency_converter:currency_value']"));
		        String exchangeRate = result.getText();
		        System.out.println("Exchange Rate: " + exchangeRate);
				 
		
				        // Step 6: Close the browser
				        driver.quit();
				    
				        
		}}

