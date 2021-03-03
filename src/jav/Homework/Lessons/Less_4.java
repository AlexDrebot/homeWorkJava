package jav.Homework.Lessons;

public class Less_4 {

    public static void main(String[] args){

        Less_4_1 colleaqueFirst = new Less_4_1("Jack", "QA стажер",
                1824 ,20000,22 );
        Less_4_1 colleaqueSecond = new Less_4_1("Dani","QA engineer",
                1826,30000,24 );
        Less_4_1 colleaqueThird = new Less_4_1("James","QA Engineer",
                1830,30000,25);
        Less_4_1 colleaqueFour = new Less_4_1("Largo","QA Manual Engineer",
                1831,50000,30);
        Less_4_1 colleaqueFive = new Less_4_1("Kirk","QA Lead Engineer",
                1825,55000,35);


         colleaqueFirst.setWage(10000);
        System.out.println(colleaqueFirst.getWage() + "--");
        System.out.println(colleaqueSecond.getWage() + "--");
        System.out.println(colleaqueThird.getWage() + "--");
        System.out.println(colleaqueFour.getWage() + "--");
        System.out.println(colleaqueFive.getWage() + "--");
        colleaqueFirst.stand();

    } // Close the main


} // Close the class Less
