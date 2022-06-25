package functions.Arrays;

import java.util.Scanner;

public class maxandmin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        int max=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(max<numbers[i]){
                max=numbers[i];
            }
        }
        int min=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(min>numbers[i]){
                min=numbers[i];
            }
        }
        System.out.println("max no is" + max);
        System.out.println("min no is" + min);

        
    }
}