/**
 *  This interface contains the methods used in the application.
 *  <p>
 * @author Adelina
 */

package jde.workspace;

public interface Tile {
	public double calculatePrice(double totalSurface,double price);
	public double calculateArea();
	public double calculatePTArea();
}
