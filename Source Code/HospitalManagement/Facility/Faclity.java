package HospitalManagement.Facility;

import java.util.Scanner;

public class Faclity {
    String fac_name;

    public void addFacility(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Facility:- ");
        fac_name= sc.next();
        System.out.println("Data added Sucessfully..........");
    }

    public void showFaciity(){
        System.out.println(fac_name);
    }
}
