public class Main {

    public static void main(String[] args) {
        // First way to implement the scenario
        int income = 120_000;
        boolean hasHighIncome;
        if (income > 100_000)
            hasHighIncome = true;
        else
            hasHighIncome = false;

        // Second Way
        int income = 120_000;
        boolean hasHighIncome = false;
        if (income > 100_000)
            hasHighIncome = true;

        // Simplest, elegant and most professional way
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);


    }

}
