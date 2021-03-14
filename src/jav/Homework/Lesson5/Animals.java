package jav.Homework.Lesson5;

public abstract class Animals {
    //Вввод данных объектов
    private String type;
    private String name;
    private float runValue;
    private float jumpValue;
    private float swimValue;
    // Переменные для определения возможности плавания объекта
    static final int  swimDone = 1;
    static final int  swimDont = 0;
    static final int  swimCant = -1;
    // Конструктор для ввода полей объекта
    Animals(String type, String name,float runValue, float jumpValue, float swimValue){
        float random = getRandomNumber(); // Добавляем рандомное число к параметрам объекта  в линиях
        this.type = type;
        this.name = name;
        this.runValue = runValue + random;
        this.jumpValue = jumpValue + random;
        this.swimValue = swimValue + random;
    }

    // Метод которые возвращает поле тип объекта
    String getType(){
        return this.type;
    }
    // Метод которые возвращает поле имя объекта
    String getName(){
        return this.name;
    }
    // Метод которые возвращает поле с значением бега
    float getRunValue(){
        return this.runValue;
    }
    // Метод которые возвращает поле с значением прыжка
    float getJumpValue(){
        return this.jumpValue;
    }
    // Метод которые возвращает поле с значением плавания
    float getSwimValue(){
        return this.swimValue;
    }
    // Метод который проверяет может ли выполнить условие по бегу объект
    protected boolean run(float runLength){
        return (runLength <= runValue);
    }
    // Метод которые возвращает может ли выполнить условие по прижку объект
    protected boolean jump(float jumpLength){
        return (jumpLength <= jumpValue);
    }
    // Метод которые возвращает может ли выполнить условие по плаванию объект
    protected float swim(float swimLength){
        return (swimLength <= swimValue) ? swimDone : swimDont;
    }
    // Метод которые создает рандомное число
    float getRandomNumber(){
        return (float) (Math.random()*3);
    }

}
