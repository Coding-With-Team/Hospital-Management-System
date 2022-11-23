package HospitalManagement.Patient;

import java.util.Scanner;

public class Patient {
    int pid, pslno, page;
    String pname, pdisease, pgender, padmitstatus;
    public void addPatientData() {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Serial No:- ");
        pslno = Sc.nextInt();
        System.out.println("Enter Patient id:- ");
        pid = Sc.nextInt();
        System.out.println("Enter Patient name:- ");
        pname = Sc.next();
        System.out.println("Enter Patient Disease:- ");
        pdisease = Sc.next();
        System.out.println("Enter Patient gender:- ");
        pgender = Sc.next();
        System.out.println("Enter Patient Admitstatus:- ");
        padmitstatus = Sc.next();
        System.out.println("Enter Patient age:- ");
        page = Sc.nextInt();
        System.out.println("Data added Sucessfully..........");
    }
    public void showPatientData() {
        System.out.println(pslno + "    \t" + pid + "   \t" + pname + "   \t" + pdisease + "   \t" + pgender + "   \t" + padmitstatus + "   \t" + page);
    }
}
