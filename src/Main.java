public class Main {
    public static void main(String[] args)
    {
        Kruznica Prva = new Kruznica();
        Kruznica Druha = new Kruznica();
        //Prva.vypisKruznicu();
        //Druha.vypisKruznicu();
        System.out.println(Prva);
        System.out.println(Druha);
        System.out.println("obvod kruznice s polomerom "+Prva.getPolomer()+" ma obsah "+Prva.getobsah()+" a obvod "+Prva.getObvod());
        System.out.println("obvod kruznice s polomerom "+Druha.getPolomer()+" ma obsah "+Druha.getobsah()+" a obvod "+Druha.getObvod());
        System.out.printf("Kruznica r = %f na obvod O = %.2f obsah s = %.2f",Prva.getPolomer(),Prva.getObvod(),Prva.getobsah());
        System.out.println(Prva.jeVacsia(Druha));
        Prva.plus(Druha);
    }
}