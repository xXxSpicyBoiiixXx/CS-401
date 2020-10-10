/*
 * File: ImageGen01.java
 * Author: xXxSpicyBoiiixXx
 * Description: Image generation in java
 * Date: 10/10/2020
 */

import java.awt.image.*;
import java.awt.Color;
import java.io.*;
import javax.imageio.*;

public class ImageGen02
{
	public static void main (String[] args) throws IOException 
	{
		// Destination file 
		String fileOut = args[0];

		// Creating Image of hardcoded size and type
		final int SIDE = 1024;
		final int TYPE = BufferedImage.TYPE_INT_RGB;
		BufferedImage image = new BufferedImage(SIDE, SIDE, TYPE);
		
		// Limit of RGB values 
		final int LIMIT = 255; 
		
		// Specific values of R G and B
		int c;

		Color color;

	for(int i = 0; i < SIDE; i++)
		for(int j = 0; j < SIDE; j++)
		{
			c = (i * j) % LIMIT;

			// creates Gray values
			color = new Color(c, c, c);

			// Saving pixles
			image.setRGB(i, j, color.getRGB()); 

		}
	
	File outputfile = new File(fileOut);
	ImageIO.write(image, "jpg", outputfile);
	}
}

