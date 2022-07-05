package Lesson3;

import java.util.Scanner;

/*
Занятие 3 Логические выражения, логические функции Красько Денис 05.07.2022
 */
public class Main {
    public static void main(String[] args) {
        //Boolean1◦
        //. Дано целое число A. Проверить истинность высказывания: «Число A является положительным»
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        boolean res = a > 0;
//        System.out.println(res);

        //Boolean2◦
        //. Дано целое число A. Проверить истинность высказывания: «Число A является нечетным».
//        System.out.println("Введите целое число: ");
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int a1 = a % 2;
//        boolean res = a1!=0;
//        System.out.println(res);

//        System.out.println("Введите целое число: ");
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        boolean res = a % 2 != 0;
//        System.out.println(res);

        //Boolean3◦
        //. Дано целое число A. Проверить истинность высказывания: «Число A является четным».
//        System.out.println("Введите целое число: ");
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        boolean res = a % 2 != 1;
//        System.out.println(res);

        //Boolean4◦
        //. Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Справедливы неравенства A > 2 и B ≤ 3».

        //Логическое И (&&), логическое умножение

//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        boolean res = (a > 3) && (b <= 3);
//        System.out.println(res);

        //Boolean5◦
        //. Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Справедливы неравенства A ≥ 0 или B < −2»

//        System.out.println("Введите два целых числа: ");
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        boolean res = (a >= 0) || (b < -2);
//        System.out.println(res);

        //Boolean6◦
        //. Даны три целых числа: A, B, C. Проверить истинность высказывания: «Справедливо двойное неравенство A < B < C»
//        System.out.println("Введите три целых числа: ");
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        boolean res = (a < b) && (b < c);
//        System.out.println(res);

        //Boolean7◦
        //. Даны три целых числа: A, B, C. Проверить истинность высказывания: «Число B находится между числами A и C».
//        System.out.println("Введите три целых числа: ");
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        boolean res = a < b && b < c || c < b && b < a;
//        System.out.println(res);

        //Boolean8◦
        //. Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Каждое из чисел A и B нечетное».
//        System.out.println("Введите три целых числа: ");
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        boolean res = a % 2 != 0 && b % 2 !=0;
//        System.out.println(res);


        //Boolean9◦
        //. Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Хотя бы одно из чисел A и B нечетное».
//        System.out.println("Введите три целых числа: ");
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        boolean res = a % 2 != 0 || b % 2 !=0;
//        System.out.println(res);

        //Boolean10◦
        //. Даны два целых числа: A, B. Проверить истинность высказывания: «Ровно одно из чисел A и B нечетное».
//        System.out.println("Введите три целых числа: ");
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        boolean res = (a % 2 != 0 && b % 2 == 0) || (a % 2 == 0 && b % 2 != 0);
//        System.out.println(res);

        // или можно a%2 !=0^b%2!=0 или это истино или это истино, тогда труе


        //Boolean11◦
        //. Даны два целых числа: A, B. Проверить истинность высказывания: «Числа A и B имеют одинаковую четность».
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        boolean res = (a % 2 != 0 && b % 2 != 0) || (a % 2 == 0 && b % 2 == 0);
//        System.out.println(res);
        // или res (a%2)==(b%2);

        //Boolean12◦
        //. Даны три целых числа: A, B, C. Проверить истинность высказывания: «Каждое из чисел A, B, C положительное»
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        boolean res = a > 0 && b > 0 && c > 0;
//        System.out.println(res);

        //Boolean13◦
        //. Даны три целых числа: A, B, C. Проверить истинность высказывания: «Хотя бы одно из чисел A, B, C положительное»
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        boolean res = a > 0 || b > 0 || c > 0;
//        System.out.println(res);

        //Boolean14◦
        //. Даны три целых числа: A, B, C. Проверить истинность высказывания: «Ровно одно из чисел A, B, C положительное».
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        boolean res = (a > 0 && b < 0 && c < 0) || (a < 0 && b > 0 && c < 0) || (a < 0 && b < 0 && c > 0);
//        System.out.println(res);

        //либо можно boolean res = a>0^b>0^c>0

        //Boolean15◦
        //. Даны три целых числа: A, B, C. Проверить истинность высказывания: «Ровно два из чисел A, B, C являются положительными».
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        boolean res = (a > 0 && b > 0 && c < 0) || (a < 0 && b > 0 && c > 0) || (a > 0 && b < 0 && c > 0);
//        System.out.println(res);

        //Boolean16◦
        //. Дано целое положительное число. Проверить истинность высказывания: «Данное число является четным двузначным»
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        boolean res = (a % 2 == 0) && ( a > 9 && a < 100);
//        //четное и двузначное
//        System.out.println(res);

        //Boolean18◦
        //. Проверить истинность высказывания: «Среди трех данных целых
        //чисел есть хотя бы одна пара совпадающих».
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        boolean res = (a==b)||(b==c)||(a==c);
//        System.out.println(res);

        //Boolean19◦
        //. Проверить истинность высказывания: «Среди трех данных целых
        //чисел есть хотя бы одна пара взаимно противоположных».
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        boolean res = (a==-b)||(b==c)||(a==c);
//        System.out.println(res);

        //не закончил

        //Boolean20◦
        //. Дано трехзначное число. Проверить истинность высказывания:
        //«Все цифры данного числа различны».

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int ed =  a % 10;
        int sot = a / 100;
        int des = (a/10)%10; //(a%100)/10;
        boolean res = (sot!=des) && (des!=ed)&&(sot!=ed);
        System.out.println(res);

        //Boolean21◦
        //. Дано трехзначное число. Проверить истинность высказывания:
        //«Цифры данного числа образуют возрастающую последовательность».
        // от сотен к еденицам (слева на право)



















    }
}
