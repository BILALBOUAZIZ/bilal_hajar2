package com.company;

public class TriFusion implements Strategy{
    @Override
    public void trier(int[] tab) {
        triFusion(tab);
    }
    public static void triFusion(int tableau[])
    {
        int longueur=tableau.length;
        if (longueur>0)
        {
            triFusion(tableau,0,longueur-1);
        }
    }

    private static void triFusion(int tableau[],int deb,int fin)
    {
        if (deb!=fin)
        {
            int milieu=(fin+deb)/2;
            triFusion(tableau,deb,milieu);
            triFusion(tableau,milieu+1,fin);
            fusion(tableau,deb,milieu,fin);
        }
    }

    private static void fusion(int tableau[],int deb1,int fin1,int fin2)
    {
        int deb2=fin1+1;


        int table1[]=new int[fin1-deb1+1];
        for(int i=deb1;i<=fin1;i++)
        {
            table1[i-deb1]=tableau[i];
        }

        int compt1=deb1;
        int compt2=deb2;

        for(int i=deb1;i<=fin2;i++)
        {
            if (compt1==deb2)
            {
                break;
            }
            else if (compt2==(fin2+1))
            {
                tableau[i]=table1[compt1-deb1];
                compt1++;
            }
            else if (table1[compt1-deb1]<tableau[compt2])
            {
                tableau[i]=table1[compt1-deb1];
                compt1++;
            }
            else
            {
                tableau[i]=tableau[compt2];
                compt2++;
            }
        }
    }

}