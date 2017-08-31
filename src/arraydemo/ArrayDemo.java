/*
 */
package arraydemo;

public class ArrayDemo {

    public static void main(String[] args) {
        Prime objPrime = new Prime();
        Even objEven= new Even();
        DayMonth objDM= new DayMonth();
        objPrime.setPrime();
        System.out.println("");
        objPrime.getPrime();
        
        System.out.println("");
        objEven.setEven();
        objEven.getEven();

        System.out.println("");
        System.out.println("Here we check days in a month");
        objDM.getMonth("deceMbEr");
        
    }

}
