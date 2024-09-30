import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the accident vehicle type: ");
        String vehicleType = scanner.nextLine();

        System.out.print("Enter the city for the vehicle accidents: ");
        String city = scanner.nextLine();

        System.out.print("Enter the total " + vehicleType + " accidents for " + city + ": ");
        int accidentTotal = scanner.nextInt();

        RoadAccidentReport report = new RoadAccidentReport(vehicleType, city, accidentTotal);
        report.printAccidentReport();
    }
}


abstract class RoadAccidents implements IRoadAccidents {
    private String vehicleType;
    private String city;
    private int accidentTotal;

    public RoadAccidents(String vehicleType, String city, int accidentTotal) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.accidentTotal = accidentTotal;
    }

    public String getAccidentVehicleType() {
        return vehicleType;
    }

    public String getCity() {
        return city;
    }

    public int getAccidentTotal() {
        return accidentTotal;
    }
}

class RoadAccidentReport extends RoadAccidents {
    public RoadAccidentReport(String vehicleType, String city, int accidentTotal) {
        super(vehicleType, city, accidentTotal);
    }

    public void printAccidentReport() {
        System.out.println("\nVEHICLE ACCIDENT REPORT");
        System.out.println("********************************************");
        System.out.println("VEHICLE TYPE: " + getAccidentVehicleType());
        System.out.println("CITY: " + getCity());
        System.out.println("ACCIDENT TOTAL: " + getAccidentTotal());
        System.out.println("********************************************");
    }
}

