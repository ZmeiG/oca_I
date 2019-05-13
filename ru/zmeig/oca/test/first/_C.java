package ru.zmeig.oca.test.first;


public class _C{
    private static int $;
    public static void main(String[] args){
        String a_b = null; // in test snippet a_b not initializeds
        System.out.print($);
        System.out.print(a_b); // Compile error if a_b not initialized
    }
}
