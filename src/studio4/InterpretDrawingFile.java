package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeName = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean fill = in.nextBoolean();
		StdDraw.setPenColor(red, green, blue);
		System.out.println(shapeName + red + green + blue + fill);
		
			if (shapeName.equals("ellipse")) {
				double x = in.nextDouble();
				double y = in.nextDouble();
				double semiMajorAxis = in.nextDouble();
				double semiMinorAxis = in.nextDouble();
				System.out.print(x + y + semiMajorAxis + semiMinorAxis);
				if (fill == true) {
					StdDraw.setPenRadius(.1);
				StdDraw.filledEllipse(x, y, semiMajorAxis, semiMinorAxis);
				}
				else {
					StdDraw.setPenRadius(.1);
					StdDraw.ellipse(x, y, semiMajorAxis, semiMinorAxis);
				}
			}
			else if (shapeName == "rectangle") {
				
			}
			else {
		}
		
	}
}
