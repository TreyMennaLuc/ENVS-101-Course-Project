import java.util.*;
public class acidRain {
double ph;
String acidity;
    public acidRain()
    {
        super();
    }
    public acidRain(double basePh)
    {
        ph = basePh;
    }

    public void rain()
    {
        this.checkPh();
        System.out.println("");
        System.out.println("Acididty: " + this.getAcidity());
        System.out.print( "Example(s) of something " + this.getAcidity() + " would be ");
        this.checkPhExammples();
    }

    public void setPh(double newPh)
    {
        ph = newPh;
    }
    public String getAcidity()
    {
        return this.acidity;
    }

    public void checkPh()
    {
        if(this.ph>=0 && this.ph < 3.0)
        {
            this.acidity = "Very Acidic";
        }
        if(this.ph>=3.0 && this.ph < 7.0)
        {
            this.acidity = "Acidic";
        }
        if(this.ph>=7 && this.ph < 7.0)
        {
            this.acidity = "Neutral";
        }
        if(this.ph> 7.0 && this.ph < 12.0)
        {
            this.acidity = "Alkaline";
        }
        if(this.ph>=0 && this.ph < 3.0)
        {
            this.acidity = "Very Alkaline";
        }
    }
    public void checkPhExammples()
    {
        if(this.ph>=0 && this.ph < 3.0)
        {
            System.out.println("Stomach acid and lemon juice.");
        }
        if(this.ph>=3.0 && this.ph < 7.0)
        {
            System.out.println("Orange juice and beer.");
        }
        if(this.ph>=7 && this.ph < 7.0)
        {
            System.out.println("Distilled water.");
        }
        if(this.ph> 7.0 && this.ph < 12.0)
        {
            System.out.println("Baking soda and blood.");
        }
        if(this.ph>=0 && this.ph < 3.0)
        {
            System.out.println("Bleach and ammonia.");
        }
    }

}
