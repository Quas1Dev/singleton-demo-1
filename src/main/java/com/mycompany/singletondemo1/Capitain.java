package com.mycompany.singletondemo1;

public final class Capitain {

    private static Capitain capitain;

    private Capitain() {
    }

    public static synchronized Capitain getCapitain() {
        if (capitain == null) {
            System.out.println("\tA new capitain is elected for your team!");
            capitain = new Capitain();
        } else {
            System.out.println("\tYou already have a captain for your team.");
            System.out.println("\tSend him for the toss.");
        }
        
        return capitain;
    }
}
