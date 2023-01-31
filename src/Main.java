public class Main {

    public static void main(String[] args) {
        isLeapYear(2021);

        determineVersionOS(  0, 2015);
        determineVersionOS(0,2023);

        determineVersionOS(1,2015);
        determineVersionOS(1,2023);

        int time1 = calculateTime(50);
        int time2 = calculateTime(100);

        System.out.println(" Для дистанции 50 время = " + time1);
        System.out.println(" Для дистанции 100 время = " + time2);



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
        if (osType == 0){
            if (deviceYear == currentYear){
                System.out.println( " Установить облегченную весрию IOS");
            }
        } else{
           if (deviceYear == currentYear){
               System.out.println(" Устанвить облегченную Android");
           } else{
               System.out.println(" Установить обычную Android");
           }
        }

    }
     public static int calculateTime(int distance){
        int time =1;
        if(distance>=20 && distance<=60){
            time++;
         if(distance >60 && distance<=100){
             time++;

         }

        }

        return time;


     }

    }
