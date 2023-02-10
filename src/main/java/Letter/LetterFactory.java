package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter T graphically
     * @return BaseShape containing the letter T
     */
    public static BaseShape create_T() {
        BaseShape lettreT = new BaseShape();
        lettreT.add(new Rectangle(halfStripeThickness, maxHeight));
        lettreT.add(new Rectangle(maxWidth, halfStripeThickness)
                .translate(new Point2d(0.0, -maxWidth - halfStripeThickness - 1)));
        return lettreT;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape lettreE = new BaseShape();
        lettreE.add(new Rectangle(halfStripeThickness, maxHeight));
        lettreE.add(new Rectangle(maxWidth, halfStripeThickness)
                .translate(new Point2d(maxWidth - stripeThickness - 15, -maxWidth - halfStripeThickness - 1)));
        lettreE.add(new Rectangle(maxWidth, halfStripeThickness)
                .translate(new Point2d(maxWidth - stripeThickness - 15, maxWidth + halfStripeThickness + 1)));
        lettreE.add(new Rectangle(maxWidth, halfStripeThickness)
                .translate(new Point2d(maxWidth - stripeThickness - 15, 0.0)));
        return lettreE;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        BaseShape lettreO = new BaseShape();
        lettreO.add(new Ellipse(maxWidth, maxHeight));
        return lettreO;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape lettreC = new BaseShape();
        lettreC.add(new Ellipse(maxWidth, maxHeight));
        return lettreC;
    }

    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A() {
        BaseShape lettreA = new BaseShape();
        lettreA.add((new Rectangle(halfStripeThickness, maxHeight)
                .rotate(0.20)));
        lettreA.add((new Rectangle(halfStripeThickness, maxHeight)
                .rotate(-0.20))
                .translate(new Point2d(halfMaxWidth, 0.0)));
        lettreA.add(new Rectangle(halfMaxWidth, halfStripeThickness)
                .translate(new Point2d(halfStripeThickness + 3, 0.0)));
        return lettreA;
    }

    /** TODO
     * Create the letter V graphically
     * @return BaseShape containing the letter V
     */
    public static BaseShape create_V() {
        BaseShape lettreV = new BaseShape();
        lettreV.add((new Rectangle(halfStripeThickness, maxHeight)
                .rotate(-0.20)));
        lettreV.add((new Rectangle(halfStripeThickness, maxHeight)
                .rotate(0.20))
                .translate(new Point2d(halfMaxWidth, 0.0)));
        return lettreV;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape lettreN = new BaseShape();
        lettreN.add(new Rectangle(halfStripeThickness, maxHeight));
        lettreN.add(new Rectangle(halfStripeThickness, maxHeight)
                .translate(new Point2d(maxWidth + 1.5, 0.0)));
        lettreN.add((new Rectangle(halfStripeThickness, maxHeight + 3)
                .translate(new Point2d(halfMaxWidth - 2, 10.0)))
                .rotate(-0.40));
        return lettreN;
    }

    /** TODO
     * Create the letter M graphically
     * @return BaseShape containing the letter M
     */
    public static BaseShape create_M() {
        BaseShape lettreM = new BaseShape();
        lettreM.add(new Rectangle(halfStripeThickness, maxHeight));
        lettreM.add(new Rectangle(halfStripeThickness, maxHeight)
                .translate(new Point2d(maxWidth, 0.0)));
        lettreM.add((new Rectangle(halfStripeThickness, halfMaxHeight)
                .translate(new Point2d(halfMaxWidth, -halfMaxWidth)))
                .rotate(-0.35));
        lettreM.add((new Rectangle(halfStripeThickness, halfMaxHeight)
                .translate(new Point2d(halfMaxWidth - 3, -halfMaxWidth - 21)))
                .rotate(0.35));
        return lettreM;
    }

}
