/**
 * This class is an {@link AbstractTile}. 
 * <p>
 * It contains the method that covers the cost by piece for a given surface.
 * <p>
 * In this class the tile has a triangle shape.
 * <p>
 * @author Adelina
 */

package jde.workspace;

public class PTTile extends AbstractTile {
	public PTTile(double hypo, double price) {
		super(hypo, price);
	}

	public double calculatePrice(double totalSurface, double price) {
		return totalSurface * price;
	}

}
