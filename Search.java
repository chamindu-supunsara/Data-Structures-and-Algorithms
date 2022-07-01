/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AVIAN
 */
public class Search{
    
    public static void SelectionSort(int[]x){
        for(int i=0;i<x.length;i++){

            int min = i;
            for(int p=i+1;p<x.length;p++){

                if(x[min]>x[p]){
                    min=p;
                }
            }
            if(min !=i){

                int temp=x[i];
                x[i]=x[min];
                x[min]=temp;
            }
        }

    }
    
     public static void BinarySearch(int arr[],int first,int last,int key){
         
        int mid=(first+last)/2;

        while (first < last){

            if(arr[mid] <key){
                first=mid+1;
            }else if(arr[mid]==key){
                System.out.print("Found Key Value: "+mid);
                break;
            }else {
                last=mid-1;
            }
            mid=(first + last)/2;

        }
        if(first > last){
            System.out.println("ELEMENT NOT FOUND");
        }
    }

        public static void main(String[]args){
            
        int []x = {44,01,12,56,70,125,74,99,10,120};
        
        System.out.println("Before sorting");
        PrintArray(x);
        
        System.out.println("After sorting");
        SelectionSort(x);
        
        PrintArray(x);
        int key = 56;
        int mid;
       BinarySearch(x,0,9,56);
    }
        
    private static void PrintArray(int[] x) {

            for(int i:x){
                System.out.println(i+"");       
            }
            System.out.println();
        }  
}

