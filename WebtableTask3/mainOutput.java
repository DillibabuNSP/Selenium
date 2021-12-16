package SeleniumProgram.WebtableTask3;

import java.util.Scanner;

public class mainOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value =sc.nextLine();
        tasK3 ref = new tasK3();
        ref.openUrl();
        ref.getTableData(value);
    }
}
//*[@id="post-body-5867683659713562481"]/div[1]/div[1]/table/thead/tr/th[1]
//*[@id="post-body-5867683659713562481"]/div[1]/div[1]/table/thead/tr/th[2]
//*[@id='post-body-5867683659713562481']/div[1]/div[1]/table/tbody/tr/th[text()='Burj Khalifa']/following-siblings::tr
//*[@id="post-body-5867683659713562481"]/div[1]/div[1]/table/tbody/tr/preceding-sibling::tr/td[3]
//tr[@class='odd']/td