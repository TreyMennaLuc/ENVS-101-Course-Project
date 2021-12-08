import java.util.Scanner;

public class FuelEfficiency {
    public FuelEfficiency()
    {
        super();
    }

    public void car()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the MPG for a gas car:");
        double gas = scan.nextDouble();
        System.out.println("Enter the MPG for a hybrid car:");
        double hybrid = scan.nextDouble();
        double gasMPG = 100000/ gas;
        double hybridMPG = 100000/ hybrid;
        System.out.println("The gas car uses " + gasMPG +" gallons per 100000 miles.");
        System.out.println("The hybrid car uses " + hybridMPG + " gallons per 100000 miles.");
    }
    public void car(double gpm)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the MPG for a gas car:");
        double gas = scan.nextDouble();
        System.out.println("Enter the MPG for a hybrid car:");
        double hybrid = scan.nextDouble();
        double gasMPG = gpm/ gas;
        double hybridMPG = gpm/ hybrid;
        System.out.println("The gas car uses " + gasMPG +" gallons per "+ gpm +" miles.");
        System.out.println("The hybrid car uses " + hybridMPG + " gallons per "+ gpm +" miles.");
    }
}
