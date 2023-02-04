public class Main {

    public static void main(String[] args) {
        isLeapYear(2021);

        determineVersionOS(0, 2015);
        determineVersionOS(0, 2023);

        determineVersionOS(1, 2015);
        determineVersionOS(1, 2023);

        int deliveryDistance = 110;

        delivery(deliveryDistance);


    }

    public static void isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год -високосный. ");
        } else {
            System.out.println(year + " год не високосный.");

        }


    }


    public static void determineVersionOS(int osType, int deviceYear) {
        int currentYear = 2023;
        if (osType == 0) {
            if (deviceYear == currentYear) {
                System.out.println(" Установить облегченную весрию IOS");
            } else {
                System.out.println("  Установите обычную версию IOS");
            }
        } else {
            if (deviceYear == currentYear) {
                System.out.println(" Устанвить облегченную Android");
            } else {
                System.out.println(" Установить обычную Android");
            }
        }

    }

    public static int delivery(int deliveryDistance) {
        if (20 >= deliveryDistance) {
            System.out.println("Потребуется дней 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней 3");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставка не осуществляется");


        }
        return deliveryDistance;
    }


}



