package basics.lesson1;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class HomeworkThree {
    @Test
    public void task1() {
        int brotherAge = 15;
        int sisterAge = 10;

        System.out.println("Together we are " + (sisterAge + brotherAge) + " years old!");


    }
    @Test
    public void task2() {
        int brotherAge = 15;
        int sisterAge = 10;

        System.out.println("Together we are " + sisterAge + brotherAge + " years old!");
    }

    @Test
    public void task3() {
        int firstDistance = 150;
        int secondDistance = 1520;
        String unit = "km";

        firstDistance = 151;

        System.out.println("Total distance is:" + (firstDistance + secondDistance));
    }

    @Test
    public void task4() {
        int workingDays = 17;
        Integer totalDays = null;

        System.out.println("We have worked " + workingDays + " of " + totalDays);
    }

    @Test
    public void task5() {
        String price = "15.30";
        String currency = "EUR";
        BigDecimal totalPrice = new BigDecimal(price);

        System.out.println("Total price is:" + price + currency);
//        System.out.println("Total price is: " + totalPrice + " " + currency);
        System.out.println("Total price is: " + totalPrice + currency);
        System.out.println("Total price is:" + price + " " + currency);

    }

    @Test
    public void task6() {
        String prefix = "Is that your e-mail address?";
        String address = "test@test.lv";
        String postfix = "received";
        String end = "days ago";
        String days = "33";

        System.out.println(prefix + address + postfix + Integer.parseInt(days) + end);
    }

    @Test
    public void task7() {
        String prefix = "You passed";
        String distance = "7.5";
        String postfix = "km";

        System.out.println(prefix + " " + Double.parseDouble(distance) + " " + postfix);
    }

    @Test
    public void task8() {
        LocalDateTime dateTime = LocalDateTime.parse("2019-12-15T15:14:21.629");
        dateTime = dateTime.plusYears(3).plusDays(13).plusMinutes(15);

        System.out.println(dateTime.getDayOfMonth() + dateTime.getMonth().getDisplayName(TextStyle.FULL, Locale.FRANCE) + dateTime.getYear());
    }

    @Test
    public void task9() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime dateTime = LocalDateTime.parse("2019-12-15T15:14:21.629");


        System.out.println(dateTime.format(formatter));

    }

    @Test
    public void task10() {
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(dateTime);
    }

    @Test
    public void task11() {
        String firstCar = "Audi";
        String secondCar= "BMW";

        boolean amIAudiFan = true;

        if (amIAudiFan) {
            System.out.println("My car is " + firstCar);
        } else {
            System.out.println("My car is " + secondCar);
        }
    }

    @Test
    public void poemLukomorje() {
        String line1 = "У лукоморья дуб зелёный;";
        String line2 = "Златая цепь на дубе том:";
        String line3 = "И днём и ночью кот учёный";
        String line4 = "Всё ходит по цепи кругом;";

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
    }

    @Test
    public void text () {
        String word1 = "Всем";
        String word2 = "привет!";
        String word3 = "Давайте";
        String word4 = "учиться";
        String word5 = "вместе!";

        System.out.println(word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5);

    }

    @Test
    public void countSymbols () {
        String text = "Текст (от лат. textus — ткань; сплетение, сочетание) — зафиксированная на каком-либо материальном носителе человеческая мысль;";


        System.out.println(text.length());
        String [] arr = text.split(" ");
        System.out.println(arr.length);
    }

}
