package Day_3;

public class Day_3 {

    double real;
    double imaginary;

    public Day_3(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Day_3 add(Day_3 other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Day_3(newReal, newImaginary);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }

    public static void main(String[] args) {
        Day_3 c1 = new Day_3(3.0, 2.0);
        Day_3 c2 = new Day_3(1.0, 7.0);

        Day_3 sum = c1.add(c2);

        System.out.println("First complex number: " + c1);
        System.out.println("Second complex number: " + c2);
        System.out.println("Sum of the two numbers: " + sum);
    }
}