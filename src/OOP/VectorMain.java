package OOP;

public class VectorMain {
    public static void main(String[]  vec){

        Vector[] vectors = Vector.generate(2);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println("Вычисление длинны вектора 1: " + vectors[0].length());
        System.out.println("Вычисление длинны вектора 2: " + vectors[1].length());
        System.out.println("Нахождение скалярного произведения вектора " + vectors[0].scalar(vectors[1]));
        System.out.println("Вычисление длинны вектора " +vectors[0].scalar(vectors[1]));
        System.out.println("метод, вычисляющий векторное произведение с другим вектором " +vectors[0].anotherVector(vectors[1]));
        System.out.println("метод, вычисляющий угол между векторами " +vectors[0].corner(vectors[1]));
        System.out.println("методы для суммы " +vectors[0].pluss(vectors[1]));
        System.out.println("методы для разности " +vectors[0].minus(vectors[1]));
    }
}
