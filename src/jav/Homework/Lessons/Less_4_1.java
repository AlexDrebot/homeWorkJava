package jav.Homework.Lessons;

import java.util.Set;

public class Less_4_1 {

        private String fullname;
        private String position;
        private int phonenumber;
        private int wage;
        private int age;

        Less_4_1(String fullname, String position, int phonenumber,
                 int wage, int age){
                this.fullname = fullname;
                this.position = position;
                this.phonenumber = phonenumber;
                this.wage = wage;
                this.age = age;
        }



        private void speak() {
                System.out.println(fullname + " go go go ");
        }

        private void number(){
                System.out.println("Номер телефона сотрудника " + fullname + " " + phonenumber);
        }

        void stand(){
                System.out.println("GOGOGOGOGOGO ");
        }

        public int getPhonenumber(){
                return phonenumber;
        }
        public int getWage(){
                return wage;
        }
        public int getAge(){
                return age;
        }

        public String getFullname(){
                return fullname;
        }

        public String getPosition(){
                return position;
        }
        public void setWage(int wage){
                this.wage = wage - 20000;
        }



} // Close the class Less
