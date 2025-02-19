package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	
		StdDraw.setPenColor(23, 50, 200);
		StdDraw.setPenRadius(.1);
		StdDraw.filledRectangle(.5, .5, .5, .3);
		StdDraw.setPenColor(255, 230, 40);
		StdDraw.setPenRadius(.03);
		StdDraw.rectangle(.5, .5, .5, .3);
		
		StdDraw.setPenRadius(.2);
		StdDraw.setPenColor(168, 75, 250);
		StdDraw.point(.15, .35);
		StdDraw.setPenColor(155, 20, 220);
		StdDraw.setPenRadius(.1);
		StdDraw.point(.15, .35);
		StdDraw.setPenRadius(.04);
		StdDraw.setPenColor(168, 175, 250);
		StdDraw.point(.15, .35);
		StdDraw.setPenRadius(.2);
		StdDraw.setPenColor(75, 148, 250);
		StdDraw.point(.15, .5);
		StdDraw.setPenColor(126, 242, 157);
		StdDraw.point(.15, .65);
		StdDraw.setPenColor(255, 20, 20);
		StdDraw.setPenRadius(.1);
		StdDraw.point(.15, .65);
		StdDraw.setPenColor(40, 20, 255);
		StdDraw.setPenRadius(.04);
		StdDraw.point(.15, .65);


		
		StdDraw.setPenColor(224, 162, 206);
		StdDraw.filledRectangle(.5, .6, .075, .15);
		StdDraw.setPenColor(175, 202, 78);
		StdDraw.filledRectangle(.42, .52, .075, .15);
		StdDraw.setPenColor(119, 172, 255);
		StdDraw.filledRectangle(.46, .4, .075, .15);
		StdDraw.setPenColor(255, 20, 20);
		StdDraw.filledRectangle(.53, .47, .075, .15);
		
		StdDraw.setPenColor(222, 111, 155);
		StdDraw.filledSquare(.84, .37, .12);
		
		StdDraw.setPenRadius(.2);
		StdDraw.setPenColor(20, 255, 175);
		StdDraw.filledCircle(.84, .37, .14);
		
		StdDraw.setPenRadius(.1);

		StdDraw.setPenColor(25, 131, 175);
		double[] x = {.84, .9, .84, .78};
		double[] y = {.45, .37, .75, .37};
		StdDraw.filledPolygon(x, y);
		StdDraw.setPenColor(255, 20, 20);
		StdDraw.setPenRadius(.03);
		StdDraw.point(.84, .75);


	}
}