package com.mycompany.singletondemo1;

public class SingletonDemo1 {
    public static void main(String[] args) {
        System.out.println("*** A Singleton demo 1 ***");
        // Capitain capitain = new Capitain();  // Error

        Capitain capitain = Capitain.getCapitain();
        
        System.out.println("Trying to elect a new capitain for your team!");
        
        Capitain capitain2 = Capitain.getCapitain();
        
        if (capitain2.equals(capitain)) {
            System.out.println("Both capitain and capitain2 are the same!");
        }
    }
}
