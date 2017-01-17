

/**
 * Created by Brian on 1/17/17.
 */
public class Circle {
    //variables
    public double radius;
    public static int count = 0;

    //constructor
    public Circle(double radius) {
        this.radius = radius;

        //adds 1 to the count variable every time a circle is created
        count++;
    }

    //calculates the circumference of the circle
    public double getCircumference(double radius) {
        return radius * Math.PI * 2;
    }

    //uses formatNumber() to format the answer
    public String getFormattedCircumference() {
        return formatNumber(getCircumference(radius));
    }

    //calculates the area of the circle
    public double getArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    //uses formatNumber() to format the answer
    public String getFormattedArea() {
        return formatNumber(getArea(radius));
    }

    //template to format the answers
    public String formatNumber(double x) {
        return String.format("%.2f", x);
    }

}
