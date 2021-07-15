package com.initialization.block;

public class Students {
    private String[] names;


    // initialization block
    {
        int count = 10;
        names = new String[count];
        for (int i = 0; i < count; i++){
            names[i] = String.format("Student %d ",i+1);
        }
    }


    public void showName(){
        for (String n : names){
            System.out.println(n);
        }
    }
}
