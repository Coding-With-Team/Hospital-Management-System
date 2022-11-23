package HospitalManagement.Doctor;

import java.util.Scanner;

public class Doctor {
    int dslno,did,droomno;
    String dname,dspeal,dtime,dqualification;

    public void addDoctorData(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Serial Number:- ");
        dslno=sc.nextInt();
        System.out.print("Enter The Doctor id:- ");
        did=sc.nextInt();
        System.out.print("Enter The Doctor Name:- ");
        dname=sc.next();
        System.out.print("Enter The Doctor Specialist:- ");
        dspeal=sc.next();
        System.out.print("Enter The Doctor Qualification:- ");
        dqualification=sc.next();
        System.out.print("Enter The Doctor Visiting Time:- ");
        dtime=sc.next();
        System.out.print("Enter The Doctor Roomno:- ");
        droomno=sc.nextInt();
        System.out.println("Data added Sucessfully..........");
    }

    public void showDoctorData(){
        System.out.println(dslno+"    \t"+did+ "   \t"+dname+ "   \t"+dspeal+ "   \t"+dqualification+ "   \t"+dtime+ "   \t"+droomno);

    }

}

