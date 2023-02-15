import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 0;
        switch (clientOS) {
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clinetDeviceYear = 2015;
        switch (clientOS){
            case 0:
                if (clinetDeviceYear > 2015){
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите обычную версию");
                }
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2021;
        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
        { System.out.println(year + " год является високосным");
        } else { System.out.println(year + " год не является високосным");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20){
            System.out.println("на доставку потребуется 1 день");
        }else if (deliveryDistance > 20 && deliveryDistance < 60){
            System.out.println("на доставку потребуется 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
            System.out.println("на доставку потребуется 3 дня");
        } else if (deliveryDistance > 100){
            System.out.println("Доставка свыше 100 км не осуществляется" );
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
    }
}