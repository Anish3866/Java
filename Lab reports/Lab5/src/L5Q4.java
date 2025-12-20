/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
import java.util.Scanner;
public class L5Q4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        
        System.out.println("Enter the elements of the first 3x3 matrix");
        for(int i=0; i<3; i++)
            for(int j=0; j<3; j++)
                a[i][j] = sc.nextInt();
        System.out.println("Enter the elements of the second 3x3 matrix");
        for(int i=0; i<3; i++)
            for(int j=0; j<3; j++)
                b[i][j] = sc.nextInt();
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                c[i][j] = 0;
                for(int k=0; k<3; k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("The result of the 2 Matrix are:");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.println(c[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
