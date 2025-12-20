/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
import java.util.Scanner;
public class L5Q2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int min = arr[0];
        int max = arr[0];
        
        for(int i=1; i<n; i++)
        {
            if(arr[i]<min)
                min = arr[i];
            if(arr[i]>max)
                max = arr[i];
        }
        
        System.out.println("The Minimum element is:- "+min);
        System.out.println("The Maximum element is:- "+max);
    }
    
}
