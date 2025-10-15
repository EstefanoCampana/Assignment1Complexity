package appDomain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import shapes.Cone;
import shapes.Cylinder;
import shapes.OctagonalPrism;
import shapes.PentagonalPrism;
import shapes.Pyramid;
import shapes.ShapeObject;
import shapes.SquarePrism;
import shapes.TriangularPrism;

/**
 * Class used to manage the creation of objects of class ShapeObject.
 */
public class ShapeObjectManager {
	/**
	 * Method to create an arrayList containing objects that extend class ShapeObject based on a file.
	 * @author Estefano Campana
	 * @version 13-10-2025
	 * @param filePath An String containing the relative path to a file in the system.
	 * @return shapeObjects ArrayList that held objects of type ShapeObject.
	 */
		public static ArrayList<ShapeObject> readFile(String filePath)
		{
			//Uses the path to find the file.
			File shapesData = new File(filePath);
			Scanner content = null;
			//Initializes arrayList.
			ArrayList<ShapeObject> shapeObjects = new ArrayList<ShapeObject>();

			try
			{
				content = new Scanner(shapesData);
				//Skips first value on the list.
				content.nextLine();
			}
			//If there is no file found.
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			
			//While there is content in the file.
			while (content.hasNextLine())
			{
				//Initializing variables
				String[] attributes;
				String shapeName;

				//Creates new null superclass object to use it as base constructor for each subclass.
				ShapeObject shape = null;
				
				String itemNumber = content.nextLine();
				
				//Trim the string first, then separate it by any amount of empty characters.
				attributes = itemNumber.trim().split("\\s+");
				
				//The first field is the name of a shape.
				shapeName = attributes[0];
				
				//Else if cases to create objects based off their names in a file.
				if(shapeName.equals("Cone"))
				{
					shape = new Cone(Double.parseDouble(attributes[1]), Double.parseDouble(attributes[2]));
				}
				else if(shapeName.equals("Cylinder"))
				{
					shape = new Cylinder(Double.parseDouble(attributes[1]), Double.parseDouble(attributes[2]));
				}
				else if(shapeName.equals("Pyramid"))
				{
					shape = new Pyramid(Double.parseDouble(attributes[1]), Double.parseDouble(attributes[2]));
				}
				else if(shapeName.equals("SquarePrism"))
				{
					shape = new SquarePrism(Double.parseDouble(attributes[1]), Double.parseDouble(attributes[2]));
				}
				else if(shapeName.equals("TriangularPrism"))
				{
					shape = new TriangularPrism(Double.parseDouble(attributes[1]), Double.parseDouble(attributes[2]));
				}
				else if(shapeName.equals("PentagonalPrism"))
				{
					shape = new PentagonalPrism(Double.parseDouble(attributes[1]), Double.parseDouble(attributes[2]));
				}
				else if(shapeName.equals("OctagonalPrism"))
				{
					shape = new OctagonalPrism(Double.parseDouble(attributes[1]), Double.parseDouble(attributes[2]));
				}
	            //Adds the shape to the list.
				shapeObjects.add(shape);

			}
			return shapeObjects;
		}
		/**
		 * Method used to display the first, last and every 1000th object inside an array.
		 * @author TerrellAW
		 * @version 13-10-2025
		 * @param shapes An array of the abstract class ShapeObject.
		 * @param config Object of class Config which contains all the argument information to sort the array.
		 */
			public static void displaySortedSample(ShapeObject[] shapes, Config config) {
			    System.out.println("First element is:   " + shapes[0]);

				for (int i = 1000; i < shapes.length; i += 1000) {
		            System.out.println(i + "-th element:    " + shapes[i]);
		        }

				System.out.println("Last element is:    " + shapes[shapes.length - 1]);
			}
		
}
