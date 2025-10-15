package appDomain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import utilities.HeapSort;
import shapes.Cone;
import shapes.Cylinder;
import shapes.OctagonalPrism;
import shapes.PentagonalPrism;
import shapes.Pyramid;
import shapes.ShapeObject;
import shapes.SquarePrism;
import shapes.TriangularPrism;
import utilities.HeapSort;
import utilities.MergeSort;
import utilities.SelectionSort;
import utilities.QuickSort;
import utilities.SortManager;

/**
 * <p>
 * This application driver code is designed to be used as a basis for the
 * Complexity and Sorting assignment that will be developed in the CPRG304
 * F2025 class at SAIT. The implementors of this applications will be required
 * to add all the correct functionality.
 * </p>
 */
public class AppDriver
{


	public static ArrayList<ShapeObject> readFile()
	{
		File shapesData = new File("res/shapes1.txt");
		Scanner content = null;
		ArrayList<ShapeObject> shapeObjects = new ArrayList<ShapeObject>();

		try
		{
			content = new Scanner(shapesData);
			//Skips first value on the list.
			content.nextLine();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}

		while (content.hasNextLine())
		{
			String[] attributes;
			String shapeName;

			//Creates new null superclass object to use it as base constructor for each subclass.
			ShapeObject shape = null;

			String itemNumber = content.nextLine();

			attributes = itemNumber.trim().split("\\s+");

			shapeName = attributes[0];

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
            //Adds the appliance to the list.
			shapeObjects.add(shape);

		}
		return shapeObjects;
	}

	/**
	 * Uses command line arguments to determine which functions should be called.
	 *
	 * @author TerrellAW
	 * @version 13-10-2025
	 * @param args Command line arguments taken from main.
	 */
	public static void argSwitch(String[] args, Config config) {
		for (String arg : args) {
    	 	if (arg.length() < 2) {
    			continue;
    		}

			String flag = arg.substring(0, 2);
			char value = arg.charAt(2);

			switch (flag.toLowerCase()) {
			case "-f":
				config.setFilePath(arg.substring(2));
				break;
			case "-t":
				config.setCompareType(value);
				break;
			case "-s":
				config.setSortType(value);
				break;
			default:
				break;
			}
		}
	}

	/**
	 *  The main method is the entry point of the application.
	 *
	 *  @param args The input to control the execution of the application.
	 */
	public static void main( String[] args )
	{
		// TODO Auto-generated method stub

		// refer to demo00 BasicFileIO.java for a simple example on how to
		// read data from a text file

		// refer to demo01 Test.java for an example on how to parse command
		// line arguments and benchmarking tests

		// refer to demo02 Student.java for comparable implementation, and
		// NameCompare.java or GradeCompare for comparator implementations

		// refer to demo02 KittySort.java on how to use a custom sorting
		// algorithm on a list of comparables to sort using either the
		// natural order (comparable) or other orders (comparators)

		Config config = new Config();

		argSwitch(args, config);

		// TODO: Read the file specified in the command line argument
		// TODO: Parse from ArrayList to array
		ShapeObject[] shapes = readFile().toArray(new ShapeObject[0]); // Placeholder

		SortManager.sortShapes(shapes, config);

		// All below is placeholder too I think
		Object[] arrayObj = readFile().toArray();
		ShapeObject[] arrayObj2 = Arrays.copyOf(arrayObj, arrayObj.length, ShapeObject[].class);
		MergeSort.mergeSort(arrayObj2, 0, arrayObj2.length - 1);
		for(int x = 0; x < arrayObj2.length ; x++)
		{
			System.out.println(arrayObj2[x]);
		}
		System.out.println("");

		VolumeCompare volComp = new VolumeCompare();
		AreaCompare areaComp = new AreaCompare();
		MergeSort.mergeSort(arrayObj2, 0, arrayObj2.length - 1, volComp);
		for(int x = 0; x < arrayObj2.length ; x++)
		{
			System.out.println(arrayObj2[x]);
		}
		System.out.println("");
		VolumeCompare.isUsed = false;

		SelectionSort.selectionSort(arrayObj2);
		for(int x = 0; x < arrayObj2.length ; x++)
		{
			System.out.println(arrayObj2[x]);
		}
		System.out.println("");
		AreaCompare.isUsed = false;

		SelectionSort.selectionSort(arrayObj2, areaComp);
		for(int x = 0; x < arrayObj2.length ; x++)
		{
			System.out.println(arrayObj2[x]);
		}
		System.out.println("");

		QuickSort.quickSort(arrayObj2, 0, arrayObj2.length - 1);
		for(int x = 0; x < arrayObj2.length ; x++)
		{
			System.out.println(arrayObj2[x]);
		}

        //Heap sort (Research algorithm)
        System.out.println("Heap Sort (natural order) \n");
        HeapSort.heapSort(arrayObj2);
        for (ShapeObject shapeObject : arrayObj2) {
            System.out.println(shapeObject);
        }
        System.out.println();
        System.out.println("Heap Sort (Area comparator) \n");
        HeapSort.heapSort(arrayObj2, areaComp);
//        HeapSort.reverseArray(arrayObj2);
        for (ShapeObject shapeObject : arrayObj2) {
            System.out.println(shapeObject);
        }
        System.out.println();
	}


}
