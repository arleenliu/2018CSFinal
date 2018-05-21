package buildable;

import java.util.ArrayList;

/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class Hospital extends Building{
	
	private ArrayList<Building> posBuildings;
	private ArrayList<Building> negBuildings;
	
	public Hospital(String buildingName, int xLoc, int yLoc) {
		super(buildingName, xLoc, yLoc);
		super.setSize(3);
		super.setRevenue(1);
		super.setHappiness(6);
		
		posBuildings = new ArrayList<>();
		negBuildings = new ArrayList<>();

	}
	
}
