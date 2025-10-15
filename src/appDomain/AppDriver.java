package appDomain;
import java.util.ArrayList;
import shapes.ShapeObject;
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

	/**
	 * Uses command line arguments to determine which functions should be called.
	 *
	 * @author TerrellAW
	 * @version 13-10-2025
	 * @param args Command line arguments taken from main.
	 * @param config Config class object that contains all arguments from user.
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

	public static void displaySortedSample(ShapeObject[] shapes, Config config) {
	    System.out.println("First element is:   " + shapes[0]);

		for (int i = 1000; i < shapes.length; i += 1000) {
            System.out.println(i + "-th element:    " + shapes[i]);
        }

		System.out.println("Last element is:    " + shapes[shapes.length - 1]);
	}

	/**
	 *  The main method is the entry point of the application.
	 *
	 *  @param args The input to control the execution of the application.
	 */
	public static void main( String[] args )
	{
		//Creates a new object containing the client's arguments of choice.
		Config config = new Config();
		
		//Switches the methods to sort depending on the input.
		argSwitch(args, config);

		// Get file path from config and read file
		ArrayList<ShapeObject> shapeObjects = ShapeObjectManager.readFile(config.getFilePath());

		// Convert ArrayList to array for sorting
		ShapeObject[] shapes = shapeObjects.toArray(new ShapeObject[0]);

		// Sort shapes based on config settings and benchmark time taken
		long startTime = System.currentTimeMillis();
		SortManager.sortShapes(shapes, config);
		long endTime = System.currentTimeMillis();

		// Display results
		ShapeObjectManager.displaySortedSample(shapes, config);
		String sortName = config.getSortType().getDisplayName();
		System.out.println(sortName + " run time was: " + (endTime - startTime) + " milliseconds");

	}


}
