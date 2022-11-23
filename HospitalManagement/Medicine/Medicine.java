package HospitalManagement.Medicine;

import java.util.Scanner;

public class Medicine {

    String companyName, exDate, medicineName;
    int mcost, mslno;

    public void addMedicineData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Seriel no:- ");
        mslno = sc.nextInt();
        System.out.println("Enter Medicine  Name:- ");
        medicineName = sc.next();
        System.out.println("Enter Company name:- ");
        companyName = sc.next();
        System.out.println("Enter Expiry date:- ");
        exDate = sc.next();
        System.out.println("Enter Medicine Cost:- ");
        mcost = sc.nextInt();
        System.out.println("Data added Sucessfully..........");
    }

    public void showMedicineData() {
        System.out.println(mslno + "    \t" + medicineName + "   \t" + companyName + "   \t" + exDate + "   \t" + mcost);
    }

}
