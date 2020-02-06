package org.maven;
import org.maven.Treats.*;

import org.maven.gift.*;



public class App{
    public static void main(String args[]){
        treat c1=new chocolate("C1",1000,50);
        treat c2=new chocolate("c2",20,35);
        treat g1=new Gum("g1",30,45);
        treat g2=new Gum("f2",19,91);

        Gift presents=new Gift();

        presents.add(c1);
        presents.add(c2);
        presents.add(g1);
        presents.add(g2);

        System.out.println(presents.getWeights());
        System.out.println(presents.toString());
    }
}