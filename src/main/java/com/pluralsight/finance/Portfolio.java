package com.pluralsight.finance;

import com.pluralsight.Interfaces.Valuable;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        assets = new ArrayList<>();
        this.name = name;
        this.owner = owner;
    }

    public void addValuable(Valuable valuable){
        assets.add(valuable);
        System.out.println("Successfully added");
    }

    public double getValue(){
        double total = 0;
        for(Valuable valuable : assets){
            total += valuable.getValue();
        }
        return total;
    }

    public Valuable getMostValuable(){
        if(assets.isEmpty()) return null;
        Valuable mostValuable = assets.get(0);
        double highest = mostValuable.getValue();

        for(Valuable valuable : assets){
            double assetValue = valuable.getValue();
            if(assetValue > highest){
                highest = assetValue;
                mostValuable = valuable;
            }
        }
        return mostValuable;
    }

    public Valuable getLeastValuable(){
        if(assets.isEmpty()) return null;
        Valuable leastValuable = assets.get(0);
        double lowest = leastValuable.getValue();

        for(Valuable valuable : assets){
            double temp = valuable.getValue();
            if(temp < lowest){
                lowest = temp;
                leastValuable = valuable;
            }
        }
        return leastValuable;
    }
}
