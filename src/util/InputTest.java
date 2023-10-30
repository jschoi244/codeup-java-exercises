package util;

public class InputTest {
    public static void main(String[] args) {
        Input ip = new Input();
        System.out.println(ip.getString());
        System.out.println(ip.yesNo());
        System.out.println(ip.getInt(1,10));
        System.out.println(ip.getDouble(1,10));
    }
}
