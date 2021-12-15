package SeleniumProgram.WebTableTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebTableHandle {

        WebDriver driver;
    public int rowCount;

    void openUrl(){

        System.setProperty("webdriver.chrome.driver","G:\\Atmecs Sep21\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        }

        void doTest(){

        List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[1]/table/tbody/tr"));
        rowCount = rows.size();
        this.rowCount=rowCount;
        System.out.println(rowCount );
        String beforeXpath ="//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[1]/table/tbody/tr[";
        String afterXpath ="]/th";

        for(int rowNum=1;rowNum<=rowCount;rowNum++){
            String actualXpath = beforeXpath + rowNum + afterXpath;
            WebElement element =driver.findElement(By.xpath(actualXpath));
            System.out.println(element.getText());

        }
        }
        void totalColumn(){

            String Total =driver.findElement(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[1]/table/tfoot/tr/td")).getText();
            System.out.println("There are "+Total+" in Total Column and Total Rows present in Structure is "+this.rowCount);
            driver.quit();
    }



    }