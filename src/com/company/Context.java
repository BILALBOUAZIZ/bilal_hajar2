package com.company;

public class Context {
    private final Strategy strategy;
    public Context(Strategy strategy){
        this.strategy=strategy;
    }
    public void arranger(int[] tab){
        strategy.trier(tab);
    }

    public void afficherTab(int[] tab){
        for(int i=0; i < tab.length; i++)
        {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
}
