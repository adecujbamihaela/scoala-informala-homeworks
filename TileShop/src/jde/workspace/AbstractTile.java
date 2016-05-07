/**
 * This is an abstract class that implements the Tile interface.
 * <p>
 * It contains the area calculation methods for each type of tile.
 * <p>
 * @author Adelina
 */

package jde.workspace;

public abstract class AbstractTile implements Tile  {

	private double length;
	private double width;
	private double price;
	private double hypo;
	
/**	
 * Constructor that models a rectangular tile.
 * @param length
 * @param width
 * @param price
 */
	public AbstractTile(double length, double width, double price) {
		this.length = length;
		this.width = width;
		this.price = price;
	}
	/**	
	 * Constructor that models a triangular tile.
	 * @param price
	 * @param hypo
	 */
	public AbstractTile(double price, double hypo) {
		this.hypo = hypo;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getPrice() {
		return price;
	}

	public double getHypo() {
		return hypo;
	}
	public double calculateArea(){
		return this.getLength() * this.getWidth();
	}
	public double calculatePTArea(){
		return Math.pow(hypo, 2) / 2;
	}
	
	}
	

	
	
	
	

