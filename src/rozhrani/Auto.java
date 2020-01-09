package rozhrani;

public class Auto implements Move, Revers {

    public void dopredu(){
        System.out.println("Jedu dopredu " + RYCHLOSTNILIMIT);

    }
    public void couvani(){
        System.out.println("Jedu taky dozadu  ");
    }
}
