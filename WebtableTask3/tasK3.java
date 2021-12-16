package SeleniumProgram.WebtableTask3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;



public class tasK3 {

    WebDriver driver;

    void openUrl() {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    void getTableData(String data){
            String Firstpath="//th[text()='";
            String lastpath ="']/following-sibling::td[3]";
            String Xpath = Firstpath + data +lastpath;
            WebElement height =driver.findElement(By.xpath(Xpath));
            System.out.println(height.getText());
            driver.quit();
    }
}