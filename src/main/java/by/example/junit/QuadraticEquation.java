package by.example.junit;

/**
 * Testing Quadratic Equation
 * Напишите и накройте тестами метод, решающий квадратное уравнение.
 * Спецификация метода.
 * Для заданного квадратного уравнения коэффициенты ( ax2 + bx + c = 0 ) возвращают массив с нулем,
 * одним или двумя действительными корнями уравнения. Корни в массиве могут быть в любом порядке.
 * Уточняйте поведение случая бесконечных корней самостоятельно.
 * Спецификация тестов.
 * Убедитесь, что метод работает нормально в общих случаях:
 * два существующих корня
 * один выходящий корень
 * без корней
 * Убедитесь, что метод работает правильно, если некоторые из коэффициентов равны нулю
 * Убедитесь, что метод работает правильно в особых случаях (например, когда все коэффициенты равны нулю)
 * Шаги:
 * Завершите метод
 * Завершите тесты (сначала тесты могут быть - TDD).
 */

public class QuadraticEquation {
    public static double[] quadraticEquation(double a, double b, double c) {
        if (a == 0) {
            return new double[]{0, 0};
        }

        double discriminant = Math.pow(b, 2) - (4 * a * c);

        if (discriminant > 0) {
            double firstRoot = (-b - Math.sqrt(discriminant)) / (2 * a);
            double secondRoot = (-b + Math.sqrt(discriminant)) / (2 * a);
            return new double[]{firstRoot, secondRoot};
        } else if (discriminant == 0) {
            double oneRoot = -b / 2;
            return new double[]{oneRoot};
        }
        throw new RuntimeException();
    }
}