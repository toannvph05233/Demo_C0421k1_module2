package QLNV;

public class MyException extends Exception{
    @Override
    public String getMessage() {
        return "dưới 18 tuổi không được";
    }
}
