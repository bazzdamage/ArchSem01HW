package ModelElements;

import BaseElements.Angle3D;
import BaseElements.Color;
import BaseElements.Point3D;

/**
 * Directional Flashlight in 3D Scene (sun, flashlight, etc.)
 */
public class Flash {

    Point3D location;
    Angle3D angle;
    Color color;
    float power;

    /**
     * Rotate flashlight on specified angle in 3D
     *
     * @param angle angle in 3D (x, y, z)
     */
    public void Rotate(Angle3D angle) {
    }

    /**
     * Move flashlight in specified coordinates 3D
     *
     * @param point point in 3D coordinates (x, y, z)
     */
    public void Move(Point3D point) {
    }
}
