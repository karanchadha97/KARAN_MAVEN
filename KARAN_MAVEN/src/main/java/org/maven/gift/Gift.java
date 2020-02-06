package org.maven.gift;
import java.util.*;
import org.maven.Treats.*;
public class Gift{
    ArrayList<treat> gifts=new ArrayList<treat>();

    public Gift(){

    }

    public int getWeights(){
        sortGifts();
        int total=0;

        for(int i=0;i<gifts.size();i++)
            total+=gifts.get(i).getWeight();

        return total;
    }

    public void add(treat s){
        gifts.add(s);
    }

    public void sortGifts(){
        Collections.sort(gifts);
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();


        for(int i=0;i<gifts.size();i++) {
            sb.append(gifts.get(i).getName());
            sb.append(" ");
        }
        String retString=sb.toString();

        return retString;
    }

}