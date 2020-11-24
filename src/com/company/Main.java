package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Привет, как тебя зовут?"); //1 задание
        String name = scan.nextLine();
        System.out.println("1. Привет " + name + "!");
        System.out.println("2. Вот твои аргументы в обратном порядке: ");
        for (int i = args.length - 1; i >= 0; i--)  //2 задание
            System.out.println(args[i]);

        System.out.println("Введи сколько хочешь случайных чисел, " + name + "!");
        int count = scan.nextInt(); //сканер на количество чисел
        System.out.println("3. Вот твои случайные числа от 0 до 100:");
        Random rand = new Random();//3 задание
        int[] randArr;
        randArr = new int[count];
        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = (int) rand.nextInt(100);
        }
        for (int i = 0; i < randArr.length; i++) {
            System.out.println(randArr[i]);
        }
        System.out.println("И они же в рядок!");
        for (int i = 0; i < randArr.length; i++) {
            System.out.print(randArr[i] + " ");

        }

        System.out.println();
        System.out.println("Введи password, " + name + "!"); // 4 задание
        String pass = "password";
        scan.nextLine(); //очистил сканнер от прошлого nextInt
        while (true) {  //повторяем вопрос пока не получим правильный пасс
            String pass1 = scan.nextLine();
            if (pass.equals(pass1)) {
                System.out.println("Правильно!");
                break; //прерывает while
            } else {
                System.out.println("Вы ввели неверный пароль! (подсказка-пароль на английском)");
            }
        }

        System.out.println("вот сумма аргументов:");    //задание 5 сумма
        int sum = 0;
        for (int a = 0; a < args.length; a++)
            sum += Integer.parseInt(args[a]);
        System.out.println(sum);
        System.out.println("вот произведения аргументов:"); //задание 5 произведение
        int pr = 1;
        for (int a = 0; a < args.length; a++) {
            pr *= Integer.parseInt(args[a]);
        }
        System.out.println(pr);

        System.out.println("Введите целые числа через пробел:"); //6 задание

        String str = scan.nextLine();
        String strArr[] = str.split(" ");
        int[] numArr = Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < numArr.length; i++)
            if (numArr[i] % 2 != 0) {
                System.out.println("6.1 Нечётное:" + numArr[i]);
            } else if (numArr[i] % 2 == 0)
                System.out.println("6.1 Чётное:" + numArr[i]);

        int min = numArr[0];
        for (int i = 0; i < numArr.length; i++) {
            if (min > numArr[i])
                min = numArr[i];
        }
        System.out.println("6.2 Наименьшее:" + min);

        int max = numArr[0];
        for (int i = 0; i < numArr.length; i++) {
            if (max < numArr[i])
                max = numArr[i];
        }
        System.out.println("6.2 Наибольшее:" + max);

        for (int i = 0; i < numArr.length; i++)
            if ((numArr[i] % 3 == 0) || (numArr[i] % 9 == 0))
                System.out.println("6.3 Делится на 3 или 9: " + numArr[i]);

        for (int i = 0; i < numArr.length; i++)
            if ((numArr[i] % 5 == 0) & (numArr[i] % 7 == 0))
                System.out.println("6.4 Делится на 5 и 7 одновременно: " + numArr[i]);

        int a = 0, b = 0, c = 0;
        for (int j = 0; j < numArr.length; j++)
            if ((numArr[j] > 99) && (numArr[j] < 1000)) {
                a = numArr[j] / 10 / 10;
                b = numArr[j] / 10 % 10;
                c = numArr[j] % 100 % 10;
                if (a != b && a != c && b != a && b != c)
                    System.out.println("6.5 Все 3х значные без одинаковых: " + numArr[j]);
                else if (a==c)
                    System.out.println("6.6 Все 3х значные фартовые(зеркальные): " + numArr[j]);

            }

        }

    }






