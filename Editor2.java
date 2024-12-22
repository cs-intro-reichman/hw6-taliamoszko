import java.awt.Color;

/**
 * Demonstrates the scaling (resizing) operation featured by Runigram.java. 
 * The program recieves three command-line arguments: a string representing the name
 * of the PPM file of a source image, and two integers that specify the width and the
 * height of the scaled, output image. For example, to scale/resize ironman.ppm to a width
 * of 100 pixels and a height of 900 pixels, use: java Editor2 ironman.ppm 100 900
 */
public class Editor2 {

	public static void main (String[] args){
		//// Replace this comment with your code.
	String nameFile = args[0];
	int w = Integer.parseInt(args[1]);
	int h = Integer.parseInt(args[2]);
	Color [][] imageIn = Runigram.read(nameFile);
	Color [][] imageOut = Runigram.scaled(imageIn, w, h);
	Runigram.setCanvas(imageIn);
	Runigram.display(imageIn);
	StdDraw.pause(2000);
	Runigram.setCanvas(imageOut);
	Runigram.display(imageOut);
		//// This function is similar to the main function of Editor1.java			
	}
}
