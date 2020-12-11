package arrays;

import java.util.Arrays;
import java.util.Scanner;

import com.app.cdac.Box;

public class TestBoxArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of boxes to make");
		Box[] boxes=new Box[sc.nextInt()];//10 : 1single array object will be created : inited with null refs.
	    System.out.println(Arrays.toString(boxes));
	    System.out.println("Name of the loaded class "+boxes);
		for(int i=0;i<boxes.length;i++)
		{
			System.out.println("Enter Box dims");
			boxes[i]=new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		}//how many objs : 1(array) + 10(box)
		//display details n volume
		for(Box b : boxes) { //b=boxes[0],b=boxes[1]......b=boxes[boxes.length-1]
			System.out.println(b.getBoxDetails());
			System.out.println("Volume "+b.computeVolume());
		}
		//Arrays.toString
		System.out.println(Arrays.toString(boxes));
		
		double[][] arr = new double[10][10];
		double fill = 100;
		for (int i = 0; i<arr.length;i++) {
			for(int j = 0; j< arr[i].length; j++) {
				arr[i][j] = fill++;
			}
		}
		for (int i = 0; i<arr.length;i++) {
			for(int j = 0; j< arr[i].length; j++) {
				System.out.print(arr[i][j]+", ");
			}
			System.out.println("\n");
		}
		
		for(double[] i : arr) {
			for(double j : i) {
				System.out.print(j+", ");
			}
			System.out.println("\n");
		}
		for(double[] i : arr) {
			Arrays.toString(i);
		}
		
		System.out.println(Arrays.deepToString(arr));
		
		sc.close();

	}

}
