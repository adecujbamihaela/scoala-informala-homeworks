/**
 * This class is an {@link AbstractTile}. 
 * <p>
 * It contains the method that covers the cost in square meters for a given surface.
 * <p>
 * 	In this class the tile has a rectangle shape.
 * <p>
 * @author Adelina
 */

package jde.workspace;

public class STile extends AbstractTile {
	
	public STile(double length, double width, double price) {
		super (length, width, price);
	}

	public double calculatePrice(double totalSurface, double price){
		return totalSurface * price;
	}

}
