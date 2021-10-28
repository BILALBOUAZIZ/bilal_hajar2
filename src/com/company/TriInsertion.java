package com.company;

public class TriInsertion implements Strategy{
    @Override
    public void trier(int[] tab) {
        int taille = tab.length;

        for (int i = 1; i < taille; i++)
        {
            int index = tab[i];
            int j = i-1;

            while(j >= 0 && tab[j] > index)
            {
                tab[j+1] = tab[j];
                j--;
            }
            tab[j+1] = index;
        }
    }
}