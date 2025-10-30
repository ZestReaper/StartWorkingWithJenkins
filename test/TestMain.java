public class TestMain {
    public static void main(String[] args) {
        testCalculate();
        System.out.println("All tests passed! ✅");
    }
    
    public static void testCalculate() {
        int result = Main.calculate(2, 3);
        if (result != 5) {
            throw new AssertionError("Test failed: 2 + 3 should be 5");
        }
        System.out.println("Calculate test passed ✅");
    }
}