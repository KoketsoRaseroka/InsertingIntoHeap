/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q2.pkg2insertingheap;

import java.util.*;

/**
 *
 * @author Koki
 */
public class Q22InsertingHeap {
    //method to insert elements into the heap
     void  insert(ArrayList<Integer> arrList, int newValue){
         //getting the amount of elements that is in the arraylist when the program is executed
      int numOfElements = arrList.size();
      
      int arrListEmpty = 0;
      //adding new elements as first elemnts if there is no elements in array
      if(numOfElements == arrListEmpty){
          arrList.add(newValue);
      }else{
          //adding a new element after the number of elements in arraylist , after the last arraylist value
          arrList.add(newValue);
          //swapping in heapify
          for(int n=newValue/2-1;n>0;n--)
          {
              heapify(arrList,n);
          }
      }
    }
     
     void heapify(ArrayList<Integer> arrList, int newValue){
         
         
         
     }
    public static void main(String[] args) {
      
    }
    
}
