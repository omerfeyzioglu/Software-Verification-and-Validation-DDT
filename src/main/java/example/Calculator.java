package example;

public class Calculator {

    public static float divide(float a, float b) {
        if (b == 0) {
            throw new IllegalArgumentException("Illegal Argument Exception.");
        }
        if (Float.isInfinite(a) || Float.isInfinite(b)) {
            throw new ArithmeticException("Value outside the boundaries of float.");
        }
        float result = a / b;
        return result;
    }
}
