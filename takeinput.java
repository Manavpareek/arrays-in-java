package functions.Arrays;

import java.util.Scanner;

public class takeinput {
    public static void main(String[] args) {
    
        System.out.println("size of array you want?");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int marks[]=new int[size];
        System.out.println("enter the values4");
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(marks[i]);

        }
        
    }
    
}
