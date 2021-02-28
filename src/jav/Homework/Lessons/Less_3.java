package jav.Homework.Lessons;

import java.util.Random;
import java.util.Scanner;

public class Less_3 {
    // Начальные условия и необходимые компоненты для игры
    public static char[][] map;
    public static int blockWins = 4; // кол-во занятых клеток для победы
    public static int sizeField = 5; // размерность карты

    // Ввод данных в игру
    public static final char humanChar = 'X';
    public static final char aiChar = '0';
    public static final char emptyChar = '_';
    // Ввод симоволов игроками
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    // Ход игры
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в игру Крестики нолики!");
        createMap();
        printmap();
        System.out.println("Вы игратете Крестиками!");
        while (true) {
            humanTurn();
            if (checkWin(humanChar)) {
                System.out.println(humanChar + " WIN !!!");
                break;
            }
            if (isMapFull()) {
                System.out.println("DRAW");
                break;
            }
            aiTurn();
            if (checkWin(aiChar)) {
                System.out.println(aiChar + " WIN !!!");
                break;
            }
            if (isMapFull()) {
                System.out.println("DRAW");
                break;
            }
            printmap();
        }
        printmap();
        System.out.println("GAME OVER");
    }    // Close the main

    // Создание игрового поля
    public static void createMap() {
        sizeField  = 5; // Так как квадрат, использую одну переменную
        map = new char[sizeField][sizeField];
        for (int x = 0; x < sizeField ; x++) {
            for (int y = 0; y < sizeField ; y++) {
                map[x][y] = emptyChar;
            }
        }
    }
    // Метод прорисовки карты c добавлением разметки осей
    public static void printmap() {
        for (int i = 0; i <= sizeField; i++) {
            System.out.print(i +  " ");
        }
        System.out.println();
        for (int i = 0; i < sizeField; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < sizeField; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    // Проврека на победу, Данный метод передает проверку из 2 вспомагательных методов на совпадение
    public static boolean checkWin(char playerChar) {
        for (int col = 0; col <sizeField - blockWins + 1;col++){
            for (int row = 0;row <sizeField - blockWins + 1;row++){
                if (checkHorVer(playerChar, col, row)||checkDiag(playerChar, col, row))
                    return true;
            }
        }
        return false;
    }
    // Метод проверки по диагонали, для проверки на победу передем значение размера поля через
    // int для проверки поля с соответсвтующим смещением (так как серия побед это блок из 4 а поле большего размера
    // мы проверяем его со смещением.
    public static boolean checkDiag(char playerChar, int offsetX, int offsetY){ //
        boolean toright, toleft; // присваиваем лог значение 1
        toright = true;
        toleft = true;
        for (int i = 0; i < blockWins; i++){
            toright &= (map[i+offsetX][i+offsetY] == playerChar);
            toleft &= (map[blockWins-i-1 + offsetX][i+offsetY] == playerChar);
        } if (toright||toleft) return true; // возвращаем true если во всех клетках встретили символы
        return false; // если встретили не во всех клектах символы возвращаем false
    }
    // Метод проверки по горизонтали и вертикали
    public static boolean checkHorVer(char playerChar, int offsetX, int offsetY){
        boolean cols, rows;
        for (int col = offsetX; col < blockWins + offsetX; col++){
            cols = true;
            rows = true;
            for (int row = offsetY; row < blockWins + offsetY; row++){
                cols &=(map[col][row] == playerChar);
                rows &=(map[row][col] == playerChar);
            }
            if (cols || rows) return true;
        }
        return false;
    }
    // Метод проверки на заполненность полей
    public static boolean isMapFull() {
        for (int x = 0; x < sizeField ; x++) {
            for (int y = 0; y < sizeField ; y++) {
                if (map[x][y] == emptyChar) {
                    return false;
                }
            }
        }
        return true;
    }
    // Метод введения игроком значений поля для постановки в него символа
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isValidCell(x, y));
        map[y][x] = humanChar;
    }

    // Метод проверяющий валидность и занятости клетки, я решил так сделать ? это можно оставить или нужно имет 2 метода
    // как вы описывали на лекции ?
    public static boolean isValidCell(int x, int y) {
        if (x < 0 || x >= sizeField || y < 0 || y >= sizeField) return false;
        if (map[y][x] == emptyChar) return true;
        return false ;
    }
    // Метод хода компьютера,
    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(sizeField);
            y = random.nextInt(sizeField);
        } while (!isValidCell(x, y));

        System.out.println("aiTurn is " + (x + 1) + " " + (y + 1));
        map[x][y] = aiChar;
    }

} // Close the class
