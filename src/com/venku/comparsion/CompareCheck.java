package com.venku.comparsion;

public class CompareCheck {



    public static void main(String[] args) {
       //stringCompare();
       //primitiveCompare();
       objectCompare();
    }

    private static void primitiveCompare() {
        int a = 20;
        int b = 40;

        if(a == b){
            System.out.println("equal");
        } else{
            System.out.println("not equal");
        }
    }

    private static void objectCompare() {

        Employee e1 = new Employee("sathish","Emp-01");
        Employee e2 = new Employee("sathish","Emp-01");

        if(e1.getName().equals(e2.getName())){
            System.out.println("equal");
        } else{
            System.out.println("not equal");
        }

        if(e1.equals(e2)){
            System.out.println("equal");
        } else{
            System.out.println("not equal");
        }

    }

    // == memory refernce
    // equals method will check value
    private static void stringCompare() {

        System.out.println("string check");

        String s1 = "sathish";

        String s2 = new String("sathish");

        if(s1 == s2){
            System.out.println("memory equal");
        } else{
            System.out.println("memory not equal");
        }

        if(s1.equals(s2)){
            System.out.println("value Equals");
        } else{
            System.out.println("Not equals");
        }
    }

}
