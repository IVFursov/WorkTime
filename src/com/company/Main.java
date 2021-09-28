package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    /* Программа- калькулятор для рассчета отработанного времени
	    для работающих в свободном графике с почасовой зарплатой */
        System.out.print("Введите время начала работы (часы и минуты через пробел): ");
        Scanner scan = new Scanner(System.in);
        int startHour = 60 * scan.nextInt(), startMin = scan.nextInt(); // Время начала работы + перевод часов в минуты
        System.out.print("Введите время конца работы (часы и минуты через пробел): ");
        int finishHour = 60 * scan.nextInt(), finishMin = scan.nextInt(); // Время конца работы + перевод часов в минуты
        int totalHours = ((finishHour + finishMin) - (startHour + startMin))/60; // Рассчет количества отработанных часов
        int totalMin = ((finishHour + finishMin) - (startHour + startMin))%60; // Рассчет количества отработанных минут
        System.out.println("Время вашей работы составляет " + totalHours + " часов " + totalMin + " минут.");
        scan.close();
    }
}
