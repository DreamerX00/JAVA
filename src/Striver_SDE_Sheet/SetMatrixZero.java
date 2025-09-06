package Striver_SDE_Sheet;

import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZero {
	
	Scanner scanner = new Scanner(System.in);
	
	private int row;
	private int col;
	private int[][] arr;
	
	
	
	void createArray() {
		System.out.println("Enter The No. Of Rows And Columns");
		row = scanner.nextInt();
		col = scanner.nextInt();
		
		arr = new int[row][col];
		
		for(int i = 0; i< row;i++) {
			for(int j = 0;j<col;j++) {
				arr[i][j]= scanner.nextInt(); 
			}
		}
	}
	
	void printArray() {
		String array = Arrays.deepToString(arr);
		System.out.println(array);
	}
	
	void setZeros() {
		int rowSize = arr.length;
		int colSize = arr[0].length;
		
		
		boolean[] rowArray = new boolean[rowSize];
		boolean[] colArray = new boolean[colSize];
		
		for(int i = 0;i<rowSize;i++) {
			for(int j = 0;j<colSize;j++) {
				if(arr[i][j] == 0) {
					rowArray[i] = true;
					colArray[j] = true;
				}
			}
		}
		
		for(int i = 0; i<rowSize;i++) {
			if(rowArray[i]) {
				for(int j = 0;j<colSize;j++) {
					arr[i][j] = 0;
				}
			}
		}
		
		for(int i = 0; i<colSize;i++ ) {
			if(colArray[i]) {
				for(int j = 0;j<rowSize;j++) {
					arr[j][i] = 0;
				}
			}
		}
		
		printArray();
		
		
	}
	
	public static void main(String[] args) {
		SetMatrixZero smz = new SetMatrixZero();
		smz.createArray();
		smz.printArray();
		smz.setZeros();
	}
}
