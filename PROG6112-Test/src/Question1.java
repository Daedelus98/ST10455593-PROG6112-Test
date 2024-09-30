import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize arrays
        String[] cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};
        int[] carAccidents = new int[3];
        int[] bikeAccidents = new int[3];

        // Capture accident amounts in each city
        for (int i = 0; i < cities.length; i++) {
            System.out.println("Enter the number of car accidents for " + cities[i] + ":");
            carAccidents[i] = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter the number of bike accidents for " + cities[i] + ":");
            bikeAccidents[i] = Integer.parseInt(scanner.nextLine());
        }

        // Calculate totals
        int carAccidentsTotal = 0;
        int bikeAccidentsTotal = 0;
        int[] totalAccidents = new int[cities.length];

        for (int i = 0; i < cities.length; i++) {
            carAccidentsTotal += carAccidents[i];
            bikeAccidentsTotal += bikeAccidents[i];
            totalAccidents[i] = carAccidents[i] + bikeAccidents[i];
        }

        int accidentsTotal = carAccidentsTotal + bikeAccidentsTotal;

        // Display accident totals & results
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT REPORT");
        System.out.println("--------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.println("\nIn " + cities[i] + ":  \nCar Accidents: " + carAccidents[i] + "\nMotor Bike Accidents: " + bikeAccidents[i]);
        }
        System.out.println("Total Motor Car Accidents: " + carAccidentsTotal);
        System.out.println("Total Motor Bike Accidents: " + bikeAccidentsTotal);

        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < cities.length; i++) {
            System.out.println("Total Accidents in " + cities[i] + ": " + totalAccidents[i]);
        }
        System.out.println("Total Accidents: " + accidentsTotal);

        // Display the city with the most accidents
        displayCityWithMostAccidents(cities, totalAccidents);
    }

    // Method to display the city with the most accidents
    private static void displayCityWithMostAccidents(String[] cities, int[] totalAccidents) {
        int maxAccidents = totalAccidents[0];
        String cityWithMostAccidents = cities[0];

        for (int i = 1; i < cities.length; i++) {
            if (totalAccidents[i] > maxAccidents) {
                maxAccidents = totalAccidents[i];
                cityWithMostAccidents = cities[i];
            }
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("The city with the most accidents is " + cityWithMostAccidents + " with a total of " + maxAccidents + " accidents.");
    }
}
