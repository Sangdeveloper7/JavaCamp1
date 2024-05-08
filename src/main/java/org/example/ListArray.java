package org.example;
import java.util.*;

public class ListArray {
    //리스트 => ArrayList
    //배열로 만들어보기!?
        /*
        Class명은 ListArray
        add
        get
        remove
        removeAll
        * */

    private Object[] array = new Object[0];


    public ListArray() {
        array = new Object[0];
    }
     void add(Object element){
        Object[] new_array = new Object[array.length+1];
        for(int i=0; i < array.length; i++){
            new_array[i] = array[i];
        }
        new_array[array.length] = element;
        array = new_array;

     }

     boolean isAcess(int k){
        if(k >=0 && k < array.length){
            return true;
        }
        return false;
     }

     void get(int index){
        if(index > array.length){
            System.out.println("유효하지 않은 인덱스 입니다1.");
        }else {
            System.out.println(array[index]);
        }
     }
     void remove(int index){
         if(isAcess(index) == false){
             System.out.println("유효하지 않은 인덱스 입니다22.");
         }else{
             Object[] new_array = new Object[array.length-1];

             for(int i=0; i<index; i++){
                 new_array[i] = array[i];
             }
             for(int i=index+1; i< array.length; i++){
                 new_array[i-1] = array[i];
             }
             array = new_array;

         }
     }

     void remove1(int index){
        remove(index-1);
     }

     void printAll(){
         for(int i =0; i<array.length; i++){
             System.out.println(array[i]);
         }
     }



}


