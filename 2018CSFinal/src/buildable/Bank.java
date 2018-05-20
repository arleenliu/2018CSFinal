package buildable;
/**
 * 
 * @author jzhong672
 * @version 5/15/18
 */
public class Bank extends Building{

	public Bank(String buildingName, int xLoc, int yLoc) {
		super("bank.png", xLoc, yLoc);
		super.setSize(2);
		super.setRevenue(6);
		super.setHappiness(-2);

	}
}
