package com.company;
import java.util.*;


public class CashierAlg {
    private int x;
    private int[] arr= new int[ ]{5, 10,1, 25};
  LinkedList<Float> newarr = new LinkedList<>();

    public void arraysort() {

        Arrays.sort(arr);



    }

    public void setX(double dollar){
        dollar= dollar *100;
            int s = (int) dollar;
        this.x= s;
        //System.out.println(x);
    }

    public int getX(){
        return x;

    }

    public void Cashier(){

        while(x>0){
            for( int i=arr.length-1; i>=0;i-- ){

             if(arr[i]<=x){
                x= x - arr[i];
                int value = arr[i];
                float output = ((float) value)/100;
                newarr.add(output);
                 //System.out.print(" "+arr[i]);
                break;

            }
              else if(arr[i]>=x && i ==0){
                    System.out.println("No such value");
                }

            }
        }
        Collections.sort(newarr);

        System.out.println(newarr);

    }



}
