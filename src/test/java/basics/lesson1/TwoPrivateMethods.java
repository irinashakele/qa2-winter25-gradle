package basics.lesson1;

import org.junit.jupiter.api.Test;

public class TwoPrivateMethods {
    @Test
    public void divisionMethod() {


        int x = 999;
        int y = 33;

        System.out.println(x / y);
    }
    @Test
    public void sumOfTwoWords() {

        String a = "my";
        String b = "work";
        String c = a + " " +b;

        System.out.println(c);

    }
}
