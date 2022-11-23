package HospitalManagement.Medicine;

import java.util.Scanner;

public class MedicineMethod {

    public void medicineMethod() throws Exception {
        Scanner sc = new Scanner(System.in);

        Medicine m[] = new Medicine[100];
        int i;
        int count1 = 4;
        for (i = 0; i < 100; i++) {
            m[i] = new Medicine();
        }

        m[0].mslno = 01;
        m[0].medicineName = "Azythromycin 500,";
        m[0].companyName = "intas,";
        m[0].exDate = "Sept25,";
        m[0].mcost = 499;


        m[1].mslno = 02;
        m[1].medicineName = "dolo 650,";
        m[1].companyName = "mankind,";
        m[1].exDate = "sept24,";
        m[1].mcost = 185;


        m[2].mslno = 03;
        m[2].medicineName = "nurolip od forte,";
        m[2].companyName = "lupin,";
        m[2].exDate = "March23,";
        m[2].mcost = 400;

        int count = 3;
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("                     **MEDICINE SECTION**");
        System.out.println("--------------------------------------------------------------------------------");

        int j, c = 1, s1 = 1;
        while (s1 == 1) {
            System.out.println("1.Add New Entry\n2.Existing Medicine List");
            c = sc.nextInt();
            switch (c) {
                case 1: {
                    m[count].addMedicineData();
                    count1++;
                    break;
                }
                case 2: {
                    System.out.println("------------------------------------------------------------------------------------------");
                    System.out.println(" Slno  \t  Medicine Name  \t  Medicine Comany  \t  Medicine ExpDate  \t  medicine cost.");
                    System.out.println("--------------------------------------------------------------------------------------------");
                    for (j = 0; j < count1; j++) {
                        m[j].showMedicineData();
                    }
                    break;
                }
            }
            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
            s1 = sc.nextInt();
        }
    }
}
