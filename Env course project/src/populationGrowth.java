import java.util.*;
public class populationGrowth {
    double birthRate, deathRate;
    double populationSize;
    int timeSpan;

    public populationGrowth()
    {
        super();
    }

    public void pG()
    {
        int year = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Population Size: ");
        this.populationSize = scan.nextInt();
        System.out.print("Enter Time Span(years): ");
        this.timeSpan = scan.nextInt();
        System.out.print("Enter birth rate: ");
        this.birthRate = scan.nextDouble();
        System.out.print("Enter death rate: ");
        this.deathRate = scan.nextDouble();
        double r = this.birthRate - this.deathRate;
        for(int x = 0; x < timeSpan; x++)
        {
            if(this.populationSize != 0.00 && this.populationSize > 0.00)
            {
            System.out.println("Year: " + year + " Population: " + populationSize);
            populationSize = (populationSize) + (r * populationSize);
            year++;
            }
            else {
                System.out.println("");
                System.out.print("Population has gone extinct");
                }
        }
    }


}
