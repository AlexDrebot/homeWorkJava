package jav.Homework.Lessons;

import java.util.Scanner;

public class less_1 {

    public static void main(String[] args) {

        System.out.println("The answer of the first question");
        // Ответ на первый вопрос:Ввод целочисленных значений для переменных
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value a");
        int a = scanner.nextInt();
        System.out.println("Enter value b");
        int b = scanner.nextInt();
        System.out.println("Enter value c");
        int c = scanner.nextInt();
        System.out.println("Enter value d");
        int d = scanner.nextInt();
        // Вывод на экран математической операции из метода
        System.out.println(questionOne(a, b, c, d));
        // Ответ на второй вопрос: Ввод целочисленных значений
        System.out.println("The answer of the second question");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter the first integer number");
        int e = scanner1.nextInt();
        System.out.println("Please enter the second integer number");
        int f = scanner1.nextInt();
        System.out.println(questionTwo(e, f));
        // Вывод на экран проверки полодительного или отрицательного числа
        System.out.println("The answer to the third question");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter the positive or negative number");
        int g = scanner2.nextInt();
        System.out.println(questionThree(g));
        // Вывод на экран приветствия введенного имени!!!
        System.out.println("Please enter the name");
        Scanner scanner3 = new Scanner(System.in);
        String h = scanner3.next();
        System.out.println(questionFour(h));
        // Определение высокосного года
        System.out.println("Please enter the year");
        Scanner scanner4 = new Scanner(System.in);
        int i = scanner4.nextInt();
        System.out.println(questionFive(i));
        System.out.println("Homework is done");

    }
    // Создание метода который производит
    // изменение типа вводимых переменных с целочисленных на переменные с плавающей точкой
    public static float questionOne(float myArgument1, float myArgument2, float myArgument3, float myArgument4) {
        return (myArgument1 * (myArgument2 + (myArgument3 / myArgument4)));
    }

    //Создание метода который проверяте сумму двух введенных целых чисел
    public static boolean questionTwo(int myArgument1, int myArgument2) {
        return ((myArgument1 + myArgument2 >= 10) && (myArgument1 + myArgument2 <= 20));
    }

    //Создание метода который проверяет положительное или отрицательное число
    public static boolean questionThree(int myArgument1){
        if (myArgument1 >= 0) {
            String positiv = "Positive number";
            System.out.println(positiv);
            return true;
        } else {
            String negativ = "Negative number";
            System.out.println(negativ);
            return false;
        }
    }
    //Создание метода который добавляет приветствие к введенному имени
    public static String questionFour(String myArgument1){
//        String result = "Hello, " + myArgument1 + "!!!";
//        System.out.println(result);
        return ("Hello, " + myArgument1 + "111");
        }
    //Создание метода который определяет высокосный ли это год
    public static boolean questionFive(int myArgument1){
        if ((myArgument1 % 4 == 0) || (myArgument1 % 400 == 0)){
            String year = "This is Leap Year";
            System.out.println(year);
            return true;
        } else if (myArgument1 % 100 == 0){
            String yearNotleap = "This is not leap year";
            System.out.println(yearNotleap);
            return false;
        } else {
            String yearNotleap = "This is not leap year";
            System.out.println(yearNotleap);
            return false;
        }
    }

}


