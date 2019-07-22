package rajes.advjava.rmiserver.impl;
import java.util.*;

public class ArrayListSort {
/* rajes created on 7/21/2019 
inside the package - rajes.advjava.rmiserver.impl */
public static void main(String args[]){
    ArrayList<String> listofcountries = new ArrayList<String>();
    listofcountries.add("India");
    listofcountries.add("US");
    listofcountries.add("China");
    listofcountries.add("Denmark");

    /*Unsorted List*/
    System.out.println("Before Sorting:");
    for(String counter: listofcountries){
        System.out.println(counter);
    }

    /* Sort statement*/
    Collections.sort(listofcountries);

    /* Sorted List*/
    System.out.println("\n ");
    System.out.println("After Sorting:");
    for(String counter: listofcountries){
        System.out.println(counter);
    }
}
}
