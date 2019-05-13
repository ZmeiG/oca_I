package ru.zmeig.oca.test.second;

public class Second{

    public static void main(String[] args){
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();

        sb1.append("Ja").append("va");
        System.out.print(s1 == s2); //true
        System.out.print(s1.equals(s2)); //true
        System.out.print(sb1.toString() == s1); //false
        System.out.print(sb1.toString().equals(s1)); //true
    }

}
