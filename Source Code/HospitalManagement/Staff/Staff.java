package HospitalManagement.Staff;

import java.util.Scanner;

public class Staff {

    String name,gender,desg;
    long salery;
        int id,slno;


    public void addStaffData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seriel no:- ");
        slno = sc.nextInt();
        System.out.println("Enter Id  no:- ");
        id = sc.nextInt();
        System.out.println("Enter Staff name:- ");
        name = sc.next();
        System.out.println("Enter Staff Designation:- ");
        desg = sc.next();
        System.out.println("Enter Staff gender:- ");
        gender = sc.next();
        System.out.println("Enter Staff Salery:- ");
        salery = sc.nextLong();
        System.out.println("Data added Sucessfully..........");
    }

    public void showExistingStaffList() {
        System.out.println(slno+"    \t"+id+ "   \t"+name+ "   \t"+desg+ "   \t"+gender+ "   \t"+salery);
    }
}
