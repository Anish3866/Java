/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class L5Q5 {
    public static void main(String[] args)
    {
        int[][] arr={{1,2,3},{4,5},{6,7,8,9}};
        for(int i=0; i<arr.length; i++)
        {
            int sum=0;
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.println(arr[i][j]+"");
                sum += arr[i][j];
            }
            System.out.println("Sum of row" +(i+1+"="+sum));
        }
    }
    
}
