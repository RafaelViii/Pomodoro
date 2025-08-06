import java.util.Random;

public class App {

    public static void main(String[] args) {
        int intervalInSeconds = 2; // You can change this to any number of seconds
        Random random = new Random();

        while (true) {
            int number = random.nextInt(16); // Generates number from 0 to 15
            System.out.println("Decimal: " + number);

            // Wait for the interval
            try {
                Thread.sleep(intervalInSeconds * 1000);
            } catch (InterruptedException e) {
                System.out.println("Timer interrupted");
            }

            // Show binary
            String binary = Integer.toBinaryString(number);
            System.out.println("Binary: " + String.format("%4s", binary).replace(' ', '0'));
            System.out.println("-----");

            // Optional: Another pause before next number (can remove if you want instant loop)
            try {
                Thread.sleep(intervalInSeconds * 1000);
            } catch (InterruptedException e) {
                System.out.println("Timer interrupted");
            }
        }
    }
}
