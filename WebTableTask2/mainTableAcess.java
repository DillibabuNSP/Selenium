package SeleniumProgram.WebTableTask2;

public class mainTableAcess {
    public static void main(String[] args) {
        WebTableData ref =new WebTableData();
        ref.openUrl();
        ref.structure();
        ref.country();
        ref.city();
        ref.height();
        ref.built();
        ref.rank();
    }
}
