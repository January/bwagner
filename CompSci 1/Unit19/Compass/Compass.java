package Unit19;

public class Compass 
{
    private int heading;

    /* This method updates heading by turning one degree to the right. 
 * After completing the turn, if heading is equal to 360 its value
 * is changed to 0.
 */
    public void turnRight()
    {
        if (heading >= 360) {
            heading = 0;
        }
        else {
            heading++;
        }
    }

/* This method updates heading by turning one degree to the left. 
 * After completing the turn, if heading is equal to -1 its value
 * is changed to 359.
 */
    public void turnLeft()
    {
        if (heading == -1) {
            heading = 359;
        }
        else {
            heading--;
        }
    }

/* This method updates heading by turning the number of degrees specified by 
 * the value of the parameter deg. If deg is greater than or equal to 0 the 
 * method turns to the right deg degrees, otherwise it turns to the left 
 * deg degrees.
 */
    public void turnDegrees(int deg)
    {
        for (int i = 0; i <= deg; i++) {
            if (deg >= 0) {
                turnRight();
            }
            else {
                turnLeft();
            }
        }
    }

/* This method returns the value of heading
 * @ return the current heading
 */
    public int getHeading()
    {
        return heading;
    }

/* This method translates heading into one of the eight directional values: 
 * North, NorthEast, East, SouthEast, South, SouthWest, West, and NorthWest.
 * @ return a string representing the compass's current direction
 */
    public String getDirection()
    {
        if (heading >= 337 && heading < 22)
            return "North";
        if (heading > 22 && heading < 67)
            return "Northeast";
        if (heading >= 67 && heading <= 112)
            return "East";
        if (heading > 112 && heading < 157)
            return "Southeast";
        if (heading >= 157 && heading <= 202)
            return "West";
        return "Northwest";
            
            
    }
}
