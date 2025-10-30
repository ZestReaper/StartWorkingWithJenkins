public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Jenkins CI/CD!");
        System.out.println("Result: " + calculate(8, 3));
    }
    
    public static int calculate(int a, int b) {
        return a + b;
    }
}