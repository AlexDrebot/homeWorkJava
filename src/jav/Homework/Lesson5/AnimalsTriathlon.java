package jav.Homework.Lesson5;

public class AnimalsTriathlon {

    public static void main(String[] args){
        // Переменные с описанием действий
        String actionDone = " действие получилось.";
        String actionFail = " действие не получилось.";
        String actionName;
        String actionResult;
        // Создание объектов и наполнение полей
        Bird bird = new Bird("Bird", "Anna", 4.9f, 0.7f,0f);
        Bird bird1 = new Bird("Bird", "Elena", 4.7f, 0.8f,0f);
        Cat cat = new Cat("Cat", "Viktor", 200f, 2f,0f);
        Cat cat1 = new Cat("Cat", "Maks", 195.5f, 1.5f,0f);
        Dog dog = new Dog ("Dog", "Egor", 455F, 9.5f,1.5f);
        Dog dog1 = new Dog ("Dog", "Natalia", 500f, 8.5f,2.6f);
        Horse horse = new Horse ("Horse", "Roman", 1250f, 15f,2.6f);
        Horse horse1 = new Horse ("Horse", "Liza", 1500f, 13.5f,5.6f);
        // Создание массива из созданных объектов
        Animals[] pets = {bird, bird1, cat, cat1, dog, dog1, horse, horse1};
        // Задаем значение для выполенения бега, прыжка, плавания
        float runLength = 150f;
        float jumpLength = 4.5f;
        float swimLength = 2f;
        // Цикл действий
        for (int i = 0; i < pets.length; i++){
            String nameString = i + 1 + " " + pets[i].getType() + " " + pets[i].getName() + " имеет возможность";
            actionName = " может пробежать " + pets[i].getRunValue() + " m. Пытается пробежать на ";
            actionResult = ((pets[i].run(runLength)) ? actionDone : actionFail);
            account(nameString, actionName, runLength,actionResult);

            actionName = " может выпрыгнуть на " + pets[i].getJumpValue() + " m. Совершает прыжок длиной ";
            actionResult = ((pets[i].jump(jumpLength)) ? actionDone : actionFail);
            account(nameString, actionName, runLength,actionResult);

            float swimAction = pets[i].swim(swimLength);
            actionName = " может проплыть на " + pets[i].getSwimValue() + " m. Проплывает дистанцию в  ";
            actionResult = (swimAction == Animals.swimDone) ? actionDone : actionFail;
            if (swimAction == Animals.swimCant)
                actionResult = " проплыть не получилось так как питомец не умеет плавать ";
            account(nameString,actionName,swimLength,actionResult);
        }


    }
    //Метод который выводит результат действий
    private static void account(String namePet, String nameAction, float length, String result){
        System.out.println(namePet + nameAction + length + " m и" + result);
    }

}
