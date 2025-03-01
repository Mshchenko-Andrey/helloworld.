import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача №1");
        leapYearCheck(2020);

        System.out.println("Задача №2");
        suggestAppVersion(0, 2014);

        System.out.println("Задача №3");
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);


        if (deliveryDays == -1) {
            System.out.println("Доставка невозможна.");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }
    public static void leapYearCheck(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void suggestAppVersion(int osType, int yearDeviceClient) {
        int currentYear = LocalDate.now().getYear();
        String osName;
        if (osType == 0) {
            osName = "iOS";
        } else {
            osName = "Android";
        }

        if (yearDeviceClient < currentYear) {
            System.out.println("Установите облегченную версию приложения для " + osName + " по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для " + osName + " по ссылке");
        }
    }
    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 0) {
            return -1;
        } else if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}


















