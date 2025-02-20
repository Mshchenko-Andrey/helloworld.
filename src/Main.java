import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//Домашнее задание  № 6. Циклы
        //Задача №1
        System.out.println("Задача №1");
        int[] box = new int[3];
        box[0] = 1;
        box[1] = 2;
        box[2] = 3;
        for (int i = 0; i < box.length; i++) {
            System.out.println(box[i]);
        }
        double[] number = {1.57, 7.654, 9.986};
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        int[] arbitrary = new int[5];
        arbitrary[0] = 10;
        arbitrary[1] = 20;
        arbitrary[2] = 30;
        arbitrary[3] = 40;
        arbitrary[4] = 50;
        for (int i = 0; i < arbitrary.length; i++) {
            System.out.println(arbitrary[i]);
        }
        //Задача №2
        System.out.println("Задача №2");

        for (int index = 0; index < box.length; index++) {
            if (index == box.length - 1) {
                System.out.println(box[index]);
                break;
            }
            System.out.print(box[index] + ", ");
        }
        for (int index = 0; index < number.length; index++) {
            if (index == number.length - 1) {
                System.out.println(number[index]);
                break;
            }
            System.out.print(number[index] + ", ");
        }
        for (int index = 0; index < arbitrary.length; index++) {
            if (index == arbitrary.length - 1) {
                System.out.println(arbitrary[index]);
                break;
            }
            System.out.print(arbitrary[index] + ", ");
        }
        //Задача №3
        System.out.println("Задача №3");
        for (int i = box.length - 1; i >= 0; i--) {
            System.out.print(box[i] + (i > 0 ? ", " : ""));
        }
        System.out.println();
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i] + (i > 0 ? ", " : ""));
        }
        System.out.println();
        for (int i = arbitrary.length - 1; i >= 0; i--) {
            System.out.print(arbitrary[i] + (i > 0 ? ", " : ""));
        }
        System.out.println();

        //Задача №4
        System.out.println("Задача №4");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }
        }
        System.out.print(Arrays.toString(arr) + " ");
    }
}







