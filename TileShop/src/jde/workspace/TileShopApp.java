/**
 * This class contains the main method with the requested outputs.
 * <p>
 * @author Adelina
 */

package jde.workspace;

public class TileShopApp{
	public static void main (String[] args){
		double totalSurface = 50;
		
		double priceS = 20;
		double lengthS = 15;
		double widthS = 8;
		
		
		double priceP = 100;
		double lengthP = 80;
		double widthP = 3;
		
		double pricePT = 25;
		double hypo = 12;
		
		double STileCost = calculateSTileCost(totalSurface, priceS, lengthS, widthS);
		System.out.println("1. cost for covering the surface with S type tiles: " + STileCost);
		
		double PTileCost = calculatePTileCost(totalSurface, priceP, lengthP, widthP);
		System.out.println("2. cost for covering the surface with P type tiles: " + PTileCost);
		
		double halfCost = calculateHalfCost(STileCost, PTileCost);
		System.out.println("3. cost for covering the surface with combination of S type tiles and P type tiles: " + halfCost);
		
		double PTTileCost = calculatePTTileCost(totalSurface, pricePT, hypo);
		System.out.println("4. cost for covering the surface with PT type tiles: " + PTTileCost);
	
	
	}
	private static double calculateHalfCost(double STileCost, double PTileCost) {
		double halfCost = (STileCost + PTileCost) / 2;
		return halfCost;
	}
	private static double calculateSTileCost(double totalSurface, double priceS, double lengthS, double widthS){
		Tile rec = new STile(priceS, lengthS, widthS);
		return rec.calculatePrice(totalSurface, priceS);
	}
	
	private static double calculatePTileCost(double totalSurface, double priceP, double lengthP, double widthP){
		Tile rec2 = new PTile(priceP, lengthP, widthP);
		return rec2.calculatePrice(totalSurface, priceP);
	}
	
	private static double calculatePTTileCost(double totalSurface, double pricePT, double hypo){
		Tile tri = new PTTile(pricePT, hypo);
		return tri.calculatePrice(totalSurface, pricePT);
	}
}
