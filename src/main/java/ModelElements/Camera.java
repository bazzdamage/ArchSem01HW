package ModelElements;

import BaseElements.Angle3D;
import BaseElements.Point3D;

/**
 * Simple Camera in 3D, contains information about position and angle in 3D(x,y,z).
 */
public class Camera {
    Point3D location;
    Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    /**
     * Rotate camera on specified angle in 3D
     *
     * @param angle angle in 3D (x, y, z)
     */
    public void Rotate(Angle3D angle) {
    }

    /**
     * Move camera in specified coordinates 3D
     *
     * @param point point in 3D coordinates (x, y, z)
     */
    public void Move(Point3D point) {
    }
}
