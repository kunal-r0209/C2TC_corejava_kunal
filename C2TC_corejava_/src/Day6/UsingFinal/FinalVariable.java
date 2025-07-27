package Day6.UsingFinal;

public class FinalVariable {
	final int x = 100;

    // Declare and initialize static final variable using static block or during declaration
    final static int Y; // Correct: Static blank final variable

    final static int Z = 10; // Correct: Initialized during declaration

    // Static block to initialize static final variable Y
    static {
        Y = 20; // Valid: final static variable can be assigned once in static block
        // Z = 100; // Invalid: Z is already initialized
        System.out.println("Value of Y: " + Y);
    }

    // Instance method
    void change() {
        // x = 30; // Invalid: final variables can't be reassigned
        // Y = 200; // Invalid: final static variables can't be reassigned
    }

    @Override
    public String toString() {
        return "FinalVariable [x=" + x + ", Y=" + Y + ", Z=" + Z + "]";
    }

    // main method to test the class
    public static void main(String[] args) {
        FinalVariable obj = new FinalVariable();
        System.out.println(obj);
    }

}
