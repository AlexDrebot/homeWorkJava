package jav.Homework.Lessons;


public class Less_2 {

    public static void main (String[] args) {
        // Вопрос номер один (Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
        // [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0)
        int[] myArrayF = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        methodOne(myArrayF);
        System.out.println("Обратные значения");
        // Вопрос номер два (Задать пустой целочисленный массив размером 8. Написать метод, который c помощью цикла
        // заполнит его значениями 1 4 7 10 13 16 19 22)
        int[] myArrayS = new int[8];
        methodTwo(myArrayS);
        System.out.println("\n Answer of the question number three");
        // Вопрос номер три (Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на
        // вход массив и умножающий числа меньше 6 на 2)
        int[] myArrayT = {1,5,3,2,11,4,5,2,4,8,9,1};
        methodThree(myArrayT);
        // Вопрос номер четыре ( Задать одномерный массив. Написать методы поиска в нём минимального и
        // максимального элемента)
        int[] myArrayFf = {3,47,25,33,58,78,44,11,9,5,6,1,13,28};
        methodFour(myArrayFf);

//        System.out.println(indMax + max);
//        System.out.println(indMin + min);
//        methodFour(myArrayFf);



        // Вопрос номер пять (Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
        // заполнить его диагональные элементы единицами, используя цикл(ы))


        // Вопрос номер шесть (Написать метод, которому на вход подаётся одномерный массив и число n
        // (может быть положительным, или отрицательным), при этом метод должен циклически сместить все
        // элементы массива на n позиций.)



    }
    public static void methodOne(int[] myArrayF){
        for (int i = 0; i < myArrayF.length;i++) {
            System.out.print(myArrayF[i] + " | ");
        }
        System.out.println("Введенные значения");
        for (int i = 0; i < myArrayF.length; i++){
            if(myArrayF[i] == 1){
                myArrayF[i] = 0;
            } else myArrayF[i] = 1;
            System.out.print(myArrayF[i] + " | ");
        }
    }
    public static void methodTwo(int[] myArrayS){
        for (int i = 0; i < myArrayS.length; i++) {
            myArrayS[i] = i * 3 + 1;
        }
        System.out.println("Answer of the question number two");
        for (int i = 0; i < myArrayS.length; i++) {
            System.out.print(myArrayS[i] + " | ");
        }
    }
    public static void methodThree(int[] myArrayT){
        for (int i = 0; i < myArrayT.length;i++)
            System.out.print(myArrayT[i] + " | ");
        System.out.println("\n Final answer of the auestion number three");
        for (int i = 0; i < myArrayT.length;i++){
            if (myArrayT[i] < 6){
                myArrayT[i] = myArrayT[i] * 2;
            }
            System.out.print(myArrayT[i] + " | ");
        }
    }
    public static void methodFour(int[] myArrayFf){
        int minValue = myArrayFf[0];
        int minIndex = 0;
        int maxValue = myArrayFf[0];
        int maxIndex = 0;
        for (int i = 1; i < myArrayFf.length; i++) {
            if (myArrayFf[i] < minValue) {
                minValue = myArrayFf[i];
                minIndex = i;
            }
            if (myArrayFf[i] > maxValue) {
                maxValue = myArrayFf[i];
                maxIndex = i;
            }
        }
        System.out.println("\n min value: " + minValue + "  index " + minIndex);
        System.out.println("\n max value: " + maxValue + "  index " + maxIndex);
    }

    }

