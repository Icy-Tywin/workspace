package com.app.testP2D;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class Testpoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean menuBool= true;
		int p1 = 0 ,p2 = 0;
		while(menuBool) {
			System.out.println("Choose from the following options: "
					
					+" 1. Create n new points (beta stage,will overwrite prev data)"+
					 " 2. Display all points "+
					 " 3. Calculate the distance betwoon two points"+
					 " 0. exit");
			Point2D[] points = null;
			int casen = sc.nextInt();
			int count =0;
			switch(casen){
				case 1 : 
					System.out.println("How many points do you want to plot? ");
					int numberOfpoints = sc.nextInt();
					points = new Point2D[numberOfpoints];
					
					count = 1;
					while(numberOfpoints != 0) {
						System.out.println("Enter "+count+(count==1?"st":count==2?"nd":count==3?"rd":"th")
								+" point: x, y ");
						points[count++-1] = new Point2D(sc.nextInt(),sc.nextInt());
						numberOfpoints--;
						System.out.println(numberOfpoints+(numberOfpoints==1?"points remaining":" points remaining"));
					}
					break;
				case 3:
				case 2:
					System.out.println("here are the points that you have entered:");
					count = 0;
					try {
					for(Point2D p : points) {
						System.out.println("Point "+count+" : "+p.getPoint());
					}}catch (Exception e) {
						System.out.println("An exception occured, here are the details : "+e);
					}finally {
						System.out.println("Exiting the system.");
						System.exit(-1);
					}
					if (casen == 2) break;
					
					try{System.out.println("Enter the two point numbers between which you would like to measure the distance: Point# Point#");
					p1 = sc.nextInt(); 
					p2 = sc.nextInt();
					if(p1>points.length-1 || p1 < 0 ||p2>points.length-1 || p2 < 0 ) {
						System.out.println("invalid point!! no point plotted here");
						break;
					}
					System.out.println(points[p1].calcDistance(points[p2])+" units is the distance between the two points.");
					}catch (Exception e) {
						System.out.println("An exception occured, here are the details : "+e);
					}finally {
						System.out.println("Exiting the system.");
						System.exit(-1);
					}
					break;
					
				case 0:
					menuBool = false;
					
			}
		}
	
		sc.close();
	}

}
