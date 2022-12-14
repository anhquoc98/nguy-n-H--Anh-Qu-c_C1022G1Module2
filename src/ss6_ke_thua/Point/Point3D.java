package ss6_ke_thua.Point;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 00f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float arr[] = {super.getX(), super.getY(),this.z};
        return arr;

    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" + "x=" + getX() + "y=" + getY() +
                "z=" + z + ", x,y,z=" + Arrays.toString(getXYZ()) +
                '}';
    }
}