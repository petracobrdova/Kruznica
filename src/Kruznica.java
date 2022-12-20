import java.util.Scanner;
public class Kruznica
{
    private double polomer;

    public Kruznica(double pPolomer)
    {
        this.polomer = pPolomer;
    }

    public double getObvod()
    {
        return 2*Math.PI*polomer;
    }

    public double getobsah()
    {
        return Math.PI*polomer*polomer;
    }
    public Kruznica()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("zadaj polomer kruznice");
        polomer = sc.nextDouble();
    }

    public void vypisKruznicu()
    {
        System.out.println("kruznica ma polomer"+polomer);
    }

    public double getPolomer()
    {
        return polomer;
    }

    public void setPolomer(double pPolomer)
    {
        this.polomer = pPolomer;
    }

    plus

    minus

    public boolean jeVacsia(Kruznica other)
    {
        return polomer>other.polomer;
    }

    //prva + druha, ak je - az 0 vratit 1

    @Override
    public String toString()
    {
        return "kruznica ma polomer"+polomer;
    }
}
