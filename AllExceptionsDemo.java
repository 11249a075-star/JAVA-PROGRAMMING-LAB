public class AllExceptionsDemo {
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above");
        }
        System.out.println("Eligible to vote.");
    }
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        }
        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid array index.");
        }
        try {
            String name = getName();
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Object is null.");
        }
        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number format.");
        }
        try {
            String text = "Java";
            System.out.println(text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: Invalid string index.");
        }
        try {
            Object obj = Integer.valueOf(100);
            System.out.println((String) obj);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: Invalid type casting.");
        }
        try {
            System.out.println(new int[-5]);
        } catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException: Array size cannot be negative.");
        }
        try {
            Thread.sleep(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: Invalid argument.");
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: Thread was interrupted.");
            Thread.currentThread().interrupt();
        }
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
        try {
            System.out.println("Inside try block.");
        } catch (Exception e) {
            System.out.println("Exception occurred.");
        } finally {
            System.out.println("Finally block always executes.");
        }
        System.out.println("Program continues normally.");
    }
    static String getName() {
        return null;
    }
}