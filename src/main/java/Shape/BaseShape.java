package Shape;

import Point.Point2d;

import java.util.*;
import java.util.stream.Collectors;

public class BaseShape implements Cloneable {
    private final Collection<Point2d> coords;

    /** TODO
     * Create a BaseShape with empty coordinades
     */
    public BaseShape() {
        this.coords = new ArrayList<Point2d>();
    }

    /** TODO
     * Create a BaseShape from a collection of 2D points
     * @param coords The collection of 2D points
     */
    public BaseShape(Collection<Point2d> coords) {
        this(); // This call the default constructor
        coords.forEach(point2d -> {
            this.add(point2d);
        });
    }

    /** TODO
     * Add a deep copy of the 2D point to the Shape
     * @param coord 2D point to add
     * @return Updated BaseShape
     */
    public BaseShape add(Point2d coord) {
        this.coords.add(coord.clone());
        return this;
    }

    /** TODO
     * Add a deep copy of the 2D points of the shape to the current shape
     * @param shape Shape to add to the current shape
     * @return Updated BaseShape
     */
    public BaseShape add(BaseShape shape) {
        this.addAll(shape.coords);
        return this;
    }

    /** TODO
     * Add a deep copy of the points in the collection to the shape
     * @param coords Collections of point to add
     * @return Updated BaseShape
     */
    public BaseShape addAll(Collection<Point2d> coords) {
        coords.forEach(point2d -> {
            this.add(point2d);
        });
        return this;
    }

    /** TODO
     * Remove the 2D point from the shape
     * @param coord Point to remove
     * @return Updated BaseShape
     */
    public BaseShape remove(Point2d coord) {
        this.coords.remove(coord);
        return this;
    }

    /** TODO
     * Remove the 2D points in the shape from the current shape
     * @param shape Shape containing the points to remove
     * @return Updated BaseShape
     */
    public BaseShape remove(BaseShape shape) {
        this.removeAll(shape.coords);
        return this;
    }

    /** TODO
     * Remove the 2D points in the collection from the current shape
     * @param coords Collection of 2D points to remove
     * @return Updated BaseShape
     */
    public BaseShape removeAll(Collection<Point2d> coords) {
        this.coords.removeAll(coords);
        return this;
    }

    /** TODO
     * Return a shallow copy of the coordinates of the shape
     * @return Shallow copy of all coordinates contained by this BaseShape
     */
    public Collection<Point2d> getCoords() {
        return new ArrayList<Point2d>(coords);
    }

    /** TODO
     * Create and return a deep copy of the coordinates of the shape
     * @return Deep copy of all coordinates contained by this BaseShape
     */
    public Collection<Point2d> cloneCoords() {
        return coords.stream()
                .map(point2d -> point2d.clone())
                .collect(Collectors.toList());
        // Collect: This is the way to get out of the streams world and obtain a concrete collection of values.
        // is like a reduce function applied on the collection, but in this case we only apply a "toList" conversion
    }

    /** TODO
     * Translate all points in a shape by a given vector
     * @param translateVector Vector by which to translate
     * @return Translated shape
     */
    public BaseShape translate(Point2d translateVector) {
        coords.stream()
                .map(point2d -> point2d.translate(translateVector))
                .collect(Collectors.toList());
        return this;
    }

    /** TODO
     * Rotate all points in a shape by a given angle
     * @param angle Angle by which to rotate
     * @return Rotated shape
     */
    public BaseShape rotate(Double angle) {
        coords.stream()
                .map(point2d -> point2d.rotate(angle))
                .collect(Collectors.toList());
        return this;
    }

    /** TODO
     * @return Maximum X coordinate of the shape
     */
    public Double getMaxX() {
        return null;
    }

    /** TODO
     * @return Maximum Y coordinate of the shape
     */
    public Double getMaxY() {
        return null;
    }

    /** TODO
     * @return 2D Point containing the maximum X and Y coordinates of the shape
     */
    public Point2d getMaxCoord() {
        return null;
    }

    /** TODO
     * @return Minimum X coordinate of the shape
     */
    public Double getMinX() {
        return null;
    }

    /** TODO
     * @return Minimum Y coordinate of the shape
     */
    public Double getMinY() {
        return null;
    }

    /** TODO
     * @return 2D point containing the minimum X and Y coordinate of the shape
     */
    public Point2d getMinCoord() {
        return null;
    }

    /** TODO
     * @return Deep copy of the current shape
     */
    public BaseShape clone() {
        return null;
    }
}