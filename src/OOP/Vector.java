package OOP;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //Вычисление длинны вектора
    protected double length(){
        return Math.sqrt(x*x+y*y+z*z);
    }
    //Нахождение скалярного произведения вектора
    protected double scalar(Vector vector){
        return x * vector.x + y * vector.y + z * vector.z;
    }
    //метод, вычисляющий векторное произведение с другим вектором
    public Vector anotherVector (Vector vector){
        return new Vector (y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }
    //метод, вычисляющий угол между векторами (или косинус угла): косинус угла между векторами
    // равен скалярному произведению векторов, деленному на произведение модулей (длин) векторов:
    public double corner(Vector vector){
        return scalar(vector)/(length() * vector.length());
    }
    //////////////////////методы для суммы и разности:///////////////////////
    public Vector pluss(Vector vector){
        return new Vector(
                x + vector.x,
                y+ vector.y,
                z + vector.z
        );
    }
    public Vector minus (Vector vector){
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z
        );
    }
    //////////////////////методы для суммы и разности///////////////////////

    //статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
    public static Vector[] generate(int n){
        Vector[] vectors = new Vector[n];
        for(int i =0; i < n; i++){
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Вектор {" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

}
