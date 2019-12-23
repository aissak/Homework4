import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemDriver {

	public static <T extends Comparable<T>> void InsertionSort(T[] list) {
		boolean needNextPass = true;

		for (int k = 1; k < list.length && needNextPass; k++) {
			// Array may be sorted and next pass not needed
			needNextPass = false;
			for (int i = 0; i < list.length - k; i++) {
				if (list[i].compareTo(list[i + 1]) > 0) {
					// Swap list[i] with list[i + 1]
					T temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;

					needNextPass = true; // Next pass still needed
				}
			}
		}
	}

	// main methods
	public static void main(String[] args) {

		// arraylist for the item class
		ArrayList<Item> items = new ArrayList<Item>();

		File inFile = new File("items.txt");

		Scanner input = null;

		// looks in eclipse project directory for file - NOT src directory
		try {
			FileReader fr = new FileReader(inFile);
			input = new Scanner(fr);

			// while loop for the try and catch. Contains input files
			while (input.hasNextLine()) {
				String type = input.nextLine();
				String name = input.nextLine();
				int number = input.nextInt();
				double cost = input.nextDouble();

				input.nextLine();

				String mediaType = input.nextLine();
				String source = input.nextLine();

				Item i;

				// if statements for the classes
				if (type.equalsIgnoreCase("Book")) {

					i = new Book(name, number, type, cost, mediaType, source);
					items.add(i);
				} else if (type.equalsIgnoreCase("Music")) {
					i = new Music(name, number, type, cost, mediaType, source);
					items.add(i);
				} else if (type.equalsIgnoreCase("Video")) {
					i = new Video(name, number, type, cost, mediaType, source);
					items.add(i);
				}
			} // end while
		} // end try
			// catch for exception handling
		catch (FileNotFoundException ex) {
			System.out.println("Unable to open the named file");
		}
		// closes the try and catch
		finally {
			input.close();
		}
		// converts arrayList into array.
		// sorts the array
		Item[] listItem = items.toArray(new Item[items.size()]);
		InsertionSort(listItem);

		// prints out the sorted items from the array
		for (int i = 0; i < listItem.length; i++) {
			System.out.println(listItem[i]);
		}
	}
}
