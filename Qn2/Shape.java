package Qn2;

abstract public class Shape {
    double dim1;
    double dim2;
    double PI;


    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.PI = Math.PI;
    }

    public abstract double area();

}
