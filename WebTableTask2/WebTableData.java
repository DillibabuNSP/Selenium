package SeleniumProgram.WebTableTask2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebTableData {
    WebDriver driver;


    void openUrl(){

        System.setProperty("webdriver.chrome.driver","G:\\Atmecs Sep21\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

    }
    WebElement structure;
    void structure(){

        List<WebElement> cols = driver.findElements(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[1]/table/thead/tr[1]/th"));
        int colCount = cols.size();

        System.out.println(colCount );
        String beforeXpath ="//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[1]/table/tbody/tr[";
        String afterXpath ="]/th";


        for(int colNum=1;colNum<=4;colNum++){
            String actualXpath = beforeXpath + colNum + afterXpath;
             structure =driver.findElement(By.xpath(actualXpath));
            System.out.print('\t'+structure.getText());

        }
        System.out.println("");
    }
    WebElement country;
    void country(){



        String beforeXpath ="//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[1]/table/tbody/tr[";
        String afterXpath ="]/td[1]";


        for(int colNum=2;colNum<=4;colNum++){
            String actuaXpath = beforeXpath + colNum + afterXpath;
            country=driver.findElement(By.xpath(actuaXpath));
            System.out.print('\t'+country.getText());
    }
        System.out.println("");
    }
    WebElement city;
    void city(){


        String beforeXpath ="//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[1]/table/tbody/tr[";
        String afterXpath ="]/td[2]";


        for(int colNum=3;colNum<=4;colNum++){
            String actualXpath = beforeXpath + colNum + afterXpath;
            city =driver.findElement(By.xpath(actualXpath));
            System.out.print('\t'+city.getText());

        }
        System.out.println("");
    }
WebElement height;
    void height(){


        String beforeXpath ="//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[1]/table/tbody/tr[";
        String afterXpath ="]/td[3]";


        for(int colNum=1;colNum<=4;colNum++){
            String actualXpath = beforeXpath + colNum + afterXpath;
            height =driver.findElement(By.xpath(actualXpath));
            System.out.print('\t'+height.getText());

        }
        System.out.println("");
    }
WebElement built;
    void built(){


        String beforeXpath ="//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[1]/table/tbody/tr[";
        String afterXpath ="]/td[4]";


        for(int colNum=1;colNum<=4;colNum++){
            String actualXpath = beforeXpath + colNum + afterXpath;
            built =driver.findElement(By.xpath(actualXpath));
            System.out.print('\t'+built.getText());

        }
        System.out.println("");
    }
WebElement rank;
    void rank(){


        String beforeXpath ="//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[1]/table/tbody/tr[";
        String afterXpath ="]/td[5]";


        for(int colNum=1;colNum<=4;colNum++){
            String actualXpath = beforeXpath + colNum + afterXpath;
            rank =driver.findElement(By.xpath(actualXpath));
            System.out.print('\t'+rank.getText());

        }
        System.out.println("");
    driver.quit();
    }

}

