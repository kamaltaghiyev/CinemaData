package az.mycode;

import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        myText("9dgegi %  n34in  @inij4n6ini nib456ibib ib4b6u5b6ub 4565");
    }

    public static void myText(String text) {

        text = text.replaceAll("[0-9]", "").trim();
        var arr = text.split("[\\s]+");

        for (var item : arr) {

            System.out.println(item);

        }


    }
}
