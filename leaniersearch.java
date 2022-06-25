package functions.Arrays;

import java.util.Scanner;

public class leaniersearch {
    public static void main(String[]args) {
        System.out.println("enter the size of array");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int marks[]=new int[size];
        //taking input
        System.out.println("iput values of array");
        for(int i=0;i<size;i++){
             marks[i]=sc.nextInt();
        }
        //comparision
        System.out.println("enter no for search");
            int x=sc.nextInt();

        //output
        for(int i=0;i<marks.length;i++){
            if(marks[i]==x){
                System.out.println("x found at index " + i);

            }
        }
    } 
}
