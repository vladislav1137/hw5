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
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("первый месяц - январь. Это зима");
                break;
            case 2:
                System.out.println("второй месяц - февраль. Это зима");
                break;
            case 3:
                System.out.println("третий месяц - март. Это весна");
                break;
            case 4:
                System.out.println("четвертый месяц - апрель. Это весна");
                break;
            case 5:
                System.out.println("пятый месяц - май. Это весна");
                break;
            case 6:
                System.out.println("шестой месяц - июнь. Это лето");
                break;
            case 7:
                System.out.println("седьмой месяц - июль. Это лето");
                break;
            case 8:
                System.out.println("восьмой месяц - август. Это лето");
                break;
            case 9:
                System.out.println("девятый месяц - сентябрь. Это осень");
                break;
            case 10:
                System.out.println("десятый месяц - октябрь. Это осень");
                break;
            case 11:
                System.out.println("одинадцатый месяц - ноябрь. Это осень");
                break;
            case 12:
                System.out.println("двенадцатый месяц - декабрь. Это зима");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }
    }
}