package mercurytours;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Id: ");
		String uid=sc.nextLine();
		System.out.println("Enter Password: ");
		String pwd=sc.nextLine();
		sc.close();
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(5000);
		String pgTitle=driver.getTitle();
		if(pgTitle.equals("Login: Mercury Tours")) {
			System.out.println("successful login operation");
		}
		else {
			System.out.println("unsuccessful login operation");
		}
		}
		
		

	}

