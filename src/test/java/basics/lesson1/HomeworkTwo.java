package basics.lesson1;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;


public class HomeworkTwo {
    @Test
    public void infoAboutMe() {
        String name = "Irina";
        String surname = "Šakeļe";
        byte age = 35;
        Date birthday = new Date(89, 9, 22);
        String dateOfBirth = "22 oct 1989";
        String email = "irina.sakele@test.com";
        String gender = "female";
        boolean isCarAvailable = true;
        int personalCode = 221097 - 11987;
        String address = "Riga, Brivibas 144-10, LV-1010";
        short height = 170;
        byte weight = 50;

        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM YYYY");
        String message = formatter.format(birthday);

        String a = "My name is " + name + ". " + "I'm " + age + ". " + "My birthday is " + message + ".";


        System.out.println(a);


    }

    @Test
    public void ageInDays() {
        LocalDate birthday = LocalDate.of(1989, 10,22);
        LocalDate currentDay = LocalDate.now();

        long daysBetween = ChronoUnit.DAYS.between(birthday, currentDay);
        System.out.println("Age in days " + daysBetween);
    }


}





