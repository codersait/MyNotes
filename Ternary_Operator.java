public class Main {

    public static void main(String[] args) {
        // First implementation
        int income = 120_000;
        String className;
        if (income > 100_000)
            className = "First";
        else
            className = "Economy";
        // Second implementation
        int income = 120_000;
        String className = "Economy";
        if (income > 100_000)
            className = "First";
        // Ternary Operator
        int income = 120_000;
        String className = income> 100_000 ? "First": "Economy";















    }
}
