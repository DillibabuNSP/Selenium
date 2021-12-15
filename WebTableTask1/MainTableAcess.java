package SeleniumProgram.WebTableTask1;

public class MainTableAcess {
    public static void main(String[] args) {
        WebTableHandle ref= new WebTableHandle();
        ref.openUrl();
        ref.doTest();
        ref.totalColumn();
    }
}

