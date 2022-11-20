package org.example.lesson3;

import java.util.Arrays;

public class LessonThree {
    public static void main(String[] args) {
        arrayFull();
        arrayHundred();
        arrayExThree();
        arrayExFour();
        arrayExFive(2,4);
    }
    public static void arrayFull() {
        int[] arr = {1,1,0,0,1,0,1,1,0,0};
        for (int i=0; i < arr.length; i++) {
           int x = arr[i];
           if(x==0) {
               x =x+1;
           }
           else if (x==1){
               x=x-1;
           }
            arr[i]=x;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void arrayHundred () {
        int arr[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
            int x = i + 1;
            arr[i]=x;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void arrayExThree(){
        int arr []={ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i=0; i< arr.length; i++) {
            int x = arr[i];
            if (x<6){
                x=x*2;
            }
            arr[i]=x;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void arrayExFour(){
        int table [] []=new int [5] [5];
        for (int i= 0; i<5; i++) {
            table [i] [i] = 1;
            table [i] [4-i] = 1;
            System.out.println(Arrays.toString(table[i]));
        }
    }
    public static int[] arrayExFive(int len, int initialValue){
        int arr []=new int [len];
        for (int i=0; i< arr.length; i++) {
            arr [i]=initialValue;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}

