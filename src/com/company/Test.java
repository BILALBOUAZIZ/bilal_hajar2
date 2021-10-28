package com.company;

public class Test {
    public static void main(String[] args) {
        // we can provide any strategy to do the sorting
        int[] array= {5,4,88,12,3,8,777,94};
        Context ctx = new Context(new TriFusion());
        ctx.arranger(array);

        // we can change the strategy without changing Context class
        ctx = new Context(new TriInsertion());
        ctx.arranger(array);
        ctx.afficherTab(array);
    }

}