import java.util.Scanner;

public class MovieTicketReservation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Declare movie data
        String[] movieNames = {"Avengers: Endgame", "Inception", "Interstellar", "The Dark Knight"};
        String[] movieTimes = {"10:00 AM", "1:00 PM", "4:00 PM", "7:00 PM"};
        double[] moviePrices = {250.0, 220.0, 230.0, 240.0};

        // Step 2: Display movies
        System.out.println("Welcome to Movie Ticket Reservation System");
        System.out.println("\nAvailable Movies:");
        for (int i = 0; i < movieNames.length; i++) {
            System.out.println((i + 1) + ". " + movieNames[i] + " (" + movieTimes[i] + ") - Rs. " + moviePrices[i]);
        }

        // Step 3: Get user input
        System.out.print("\nEnter movie number to book tickets: ");
        int choice = sc.nextInt();

        // Validate choice
        if (choice < 1 || choice > movieNames.length) {
            System.out.println("Invalid selection. Please restart the program.");
            System.exit(0);
        }

        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();

        if (tickets <= 0) {
            System.out.println("Invalid number of tickets. Please restart the program.");
            System.exit(0);
        }

        // Step 4: Calculate total
        double total = tickets * moviePrices[choice - 1];

        // Step 5: Show booking summary
        System.out.println("\nBooking Summary");
        System.out.println("Movie: " + movieNames[choice - 1]);
        System.out.println("Show Time: " + movieTimes[choice - 1]);
        System.out.println("Tickets: " + tickets);
        System.out.println("Price per Ticket: Rs. " + moviePrices[choice - 1]);
        System.out.println("Total Amount: Rs. " + total);

        // Step 6: Confirmation
        System.out.print("\nConfirm booking? (yes/no): ");
        String confirm = sc.next();

        if (confirm.equalsIgnoreCase("yes")) {
            System.out.println("\nBooking Confirmed!");
            System.out.println("Enjoy your movie!");
        } else {
            System.out.println("\nBooking Cancelled.");
        }

        sc.close();
    }
}
