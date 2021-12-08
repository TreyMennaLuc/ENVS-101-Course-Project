import javax.imageio.ImageTranscoder;

public class main {
    public static void main(String[] args)
    {


        //Acid Rain
        acidRain ac = new acidRain(3.3);
        ac.rain();
        ac.setPh(1);
        ac.rain();
        double randomPH = (Math.random()*12) + 1;
        ac.setPh(randomPH);
        ac.rain();


        //Fuel Efficiency
        //Ford Mustang gas 22mpg(city)
        //Ford Escape Hybrid 37mpg(highway)
        FuelEfficiency Ford = new FuelEfficiency();
        Ford.car();
        Ford.car(300);


        //Population Growth
        populationGrowth grow = new populationGrowth();
        grow.pG();



    }
}
