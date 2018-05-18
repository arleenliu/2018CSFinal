package buildable;
/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class School extends Building{

	public School(String buildingName, int xLoc, int yLoc) {
		super(buildingName, xLoc, yLoc);
		super.setSize(3);
		super.setRevenue(-2);
		super.setHappiness(7);

	}
}
