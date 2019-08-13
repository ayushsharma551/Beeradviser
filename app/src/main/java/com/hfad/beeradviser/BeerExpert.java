package com.hfad.beeradviser;
import java.util.ArrayList;
import java.util.List;
public class BeerExpert {
    List<String> getBrands(String color)
    {
        List<String> brands= new ArrayList<>();
        if(color.equals("amber"))
        {
            brands.add("Jack Amber");
            brands.add("Red moose");
        }
        else
        {
            brands.add("hey pale ale");
            brands.add("gout hell scout");
        }
        return brands;
    }
}
