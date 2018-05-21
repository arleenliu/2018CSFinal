package buildable;

import java.util.ArrayList;

/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class GasStation extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;

	public GasStation(String buildingName, int xLoc, int yLoc) {
		super(buildingName, xLoc, yLoc);
		super.setSize(1);
		super.setRevenue(1);
		super.setHappiness(4);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();

	}
}
