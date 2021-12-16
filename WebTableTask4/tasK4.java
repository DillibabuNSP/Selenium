package SeleniumProgram.WebTableTask4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;;

public class tasK4 {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        int row = driver.findElements(By.xpath("//tfoot/tr/*")).size();

        if(row==2)
        {
            System.out.println("The 6th Row has only "+row+" columns");
        }
        else{
            System.out.println("The 6th Row doesn't have 2 columns");
        }
        driver.quit();
    }
}