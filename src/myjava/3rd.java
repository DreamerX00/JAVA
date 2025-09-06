package myjava;

import java.util.Scanner;
class ArrayExperiment{
    public static void main(String[] args){
        Array ar = new Array();
        ar.getdata();
        ar.create();
        ar.show();
    }
}
class Array{
   private final Scanner sc = new Scanner(System.in);
   private int rows;
   private int column;
    private int[][] array;
    void getdata(){
        System.out.println("=== === === Welcome To The Array Creation Company === === === ");
        System.out.print("Enter The Number of Rows of The Array = ");
        rows = sc.nextInt();
        System.out.print("Enter The Number of Column of The Array = ");
        column = sc.nextInt();
        array = new int[rows][column];
    }

    void create(){

        for(int i = 0; i < rows ;i++){
            for(int j = 0;j < column;j++){

                array[i][j] = (int)(Math.random()*100);
            }
        }
    }
    void  show(){
        for(int i = 0;  i < rows; i++){
            System.out.println();
            for(int j = 0; j < column;j++){
                System.out.print(" " + array[i][j]);
            }
        }

        sc.close();
    }

}
