/**
 * Class: Items Class
 * 
 * 
 * @version 1.0 Course: ITECH 2150 Fall 2019 
 * Written: November 7, 2019
 * Purpose: An Item class that sorts out the item names in alphabetical order.
 *         
 *
 */
public abstract class Item implements Comparable<Item> {

	/**
	 * instances
	 */
	private String name;
	private int number;
	private String type;
	private double cost;

	/**
	 * Method: Item empty constructor
	 */

	public Item() {

	}

	/**
	 * * @return name, number, type, cost
	 */
	public Item(String name, int number, String type, double cost) {
		this.name = name;
		this.number = number;
		this.type = type;
		this.cost = cost;
	}

	/**
	 * getter: gets/ returns the name of the item
	 */
	public String getName() {
		return name;
	}

	/**
	 * setter: sets the name of the item
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * getter: gets/return the number of items
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * setter: sets the number of items
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * getter: gets/returns the type of the item
	 */
	public String getType() {
		return type;
	}

	/**
	 * setter: sets the type of the item
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * getter: gets/return the cost of the item
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * setter: sets the cost if the item
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

	/**
	 * all the abstract classes
	 */
	public abstract String getMediaType();

	public abstract void setMediaType(String mediaType);

	public abstract String getSource();

	public abstract void setSource(String source);

	/**
	 * toString that prints out the name, number, type, cost
	 */
	@Override
	public String toString() {
		return "Item [name=" + name + ", number=" + number + ", type=" + type + ", cost=" + cost + "]";
	}

	/**
	 * Compare to for item. Gets name and type of item.
	 */
	public int compareTo(Item a) {

		if ((getName() == a.getName()) && (getType() == a.getType())) {

			return 0;
		} else if (getName() != a.getName()) {
			return getName().compareTo(a.getName());
		} else {

			return getType().compareTo(a.getType());
		}
	}

}
