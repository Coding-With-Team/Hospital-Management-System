package HospitalManagement.Labroatories;

import java.util.Scanner;

public class Labroatories {

    int lslno,labCost;
    String lfacility;

    public void addFacility(){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter sl no:- ");
         lslno = sc.nextInt();
        System.out.print("Enter Facility:- ");
         lfacility = sc.next();
        System.out.print("Enter Lab Cost:- ");
         labCost = sc.nextInt();
        System.out.println("Data added Sucessfully..........");
    }
    public void showFacilty(){
        System.out.println(lslno+"    \t"+lfacility+ "   \t"+labCost);
    }

}
