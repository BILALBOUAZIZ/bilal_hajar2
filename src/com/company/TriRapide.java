package com.company;
public class TriRapide implements Strategy{
    @Override
    public void trier(int[] tab) {
        int longueur=tab.length;
        triRapide(tab,0,longueur-1);
    }
    public static int partition (int [] t, int début, int fin) {
        int valeurPivot = t[début];
        int d = début+1;
        int f = fin;
        while (d < f) {
            while(d < f && t[f] >= valeurPivot) f--;
            while(d < f && t[d] <= valeurPivot) d++;
            int temp = t[d];
            t[d]= t[f];
            t[f] = temp;
        }
        if (t[d] > valeurPivot) d--;
        t[début] = t[d];
        t[d] = valeurPivot;
        return d;
    }

    private static void triRapide(int tableau[],int deb,int fin)
    {
        if(deb<fin)
        {
            int positionPivot=partition(tableau,deb,fin);
            triRapide(tableau,deb,positionPivot-1);
            triRapide(tableau,positionPivot+1,fin);
        }
    }
}
