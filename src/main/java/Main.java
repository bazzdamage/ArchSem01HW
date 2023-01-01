import BaseElements.Angle3D;
import BaseElements.Point3D;
import ModelElements.Camera;

public class Main {
    public static void main(String[] args) {
        Point3D startPoint = new Point3D(0,0,0);
        Angle3D startAngle = new Angle3D(0, 0, 0);
        Point3D endPoint = new Point3D(1, 1, 1);
        Angle3D endAngle = new Angle3D(1, 1, 1);

        Camera camera = new Camera(startPoint, startAngle);

        camera.Move(endPoint);
        camera.Rotate(endAngle);

    }
}
