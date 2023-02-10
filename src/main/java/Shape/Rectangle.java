package Shape;

import Point.Point2d;

import java.util.ArrayList;
import java.util.Collection;

public class Rectangle extends BaseShape {
    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        super();
        for (double i = -(width / 2); i <= (width / 2); i+=0.5) {
            for (double j = -(height / 2); j <= (height / 2); j+=0.5) {
                this.add(new Point2d(i, j));
            }
        }
    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        super();
        this.addAll(coords);
    }

    /** TODO
     * Translate the rectangle by a given 2D point
     * @param point Point by which to translate
     * @return Translated rectangle
     */
    @Override
    public Rectangle translate(Point2d point) {
        super.translate(point);
        return this;
    }

    /** TODO
     * Rotate the rectangle by a given angle
     * @param angle The angle by which to rotate
     * @return Rotated rectangle
     */
    @Override
    public Rectangle rotate(Double angle) {
        super.rotate(angle);
        return this;
    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return new Rectangle(this.getCoords());
    }
}
