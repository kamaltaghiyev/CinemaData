package az.mycode;

import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {

        String[] arr = {"Ali", "Amrah", "Asadullah", "Elgun", "Emil", "Iqbal", "Kamal", "Mubariz", "Nurlan", "Parvin", "Saleh", "Seynur", "Shafig", "Valeh", "Vusal"};

        myMethod(arr);
    }

    public static void myMethod(String[] arr) {

        ArrayList<Integer> arrStr = new ArrayList<Integer>();
        int random;
        for (var item : arr) {


            do {
                random = (int) (Math.random() * arr.length)+1;

            } while (IsUnique(arrStr, random) == false);

            arrStr.add(random);

        }
        Show(arr, arrStr);

    }

    public static boolean IsUnique(ArrayList<Integer> arr, int random) {

        for (var item : arr) {
            if (item == random) {

                return false;
            }
        }

        return true;
    }

    public static void Show(String[] arrStr, ArrayList<Integer> arr) {
        int i = 0;
        for (var item : arr) {

            System.out.println(arrStr[i] + "-" + item);
            i++;
        }
    }
}
