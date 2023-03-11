package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LeadAssignment {
	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		String title = driver.getTitle();
        System.out.println(title);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("sukanya");
        driver.findElement(By.xpath("//input[@id='ext-gen250']")).sendKeys("Sundar");
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("sukanya");
        driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
        driver.findElement(By.xpath("//a[text()='15357']")).click();
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
        driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Leaftest");
        driver.findElement(By.className("smallSubmit")).click();
        Thread.sleep(2000);
        String text=new String();
        if (text.contains("Leaftest")) {
        	System.out.println("Leaftest is updated");
			
		} else {
			System.out.println("Leaftest is not updated");

		}
        driver.close();
       
		
	}

}
