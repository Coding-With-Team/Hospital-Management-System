package HospitalManagement.Labroatories;

import java.util.Scanner;

public class LabrotryMethod {

    public void labrotryMethod() {
        Scanner sc = new Scanner(System.in);
        Labroatories l[] = new Labroatories[10];
        int i;
        for (i = 0; i < 10; i++) {
            l[i] = new Labroatories();
        }

        l[0].lslno = 1;
        l[0].lfacility = "Mri Scan";
        l[0].labCost = 10000;

        l[1].lslno = 2;
        l[1].lfacility = "City SCan";
        l[1].labCost = 1000;

        l[2].lslno = 3;
        l[2].lfacility = "Xray";
        l[2].labCost = 700;
        int count = 3;

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("                    **LABORATORY SECTION**");
        System.out.println("--------------------------------------------------------------------------------");
        int j, c = 1, s = 1;

        while (s == 1) {
            System.out.println("1.Add new entry\n 2.Existing Laboratory List");
            c = sc.nextInt();
            switch (c) {
                case 1: {
                    l[count].addFacility();
                    count++;
                    break;
                }
                case 2: {
                    System.out.println("----------------------------------------------");
                    System.out.println("Slno  \t  labrotoryFacility  \t  Lab Cost.");
                    System.out.println("-----------------------------------------------");
                    for (j = 0; j < count; j++) {
                        l[j].showFacilty();
                    }
                    break;
                }
            }
            System.out.println("\n Return to back press 1 and for main menu press 0");
            s = sc.nextInt();
        }
    }
}


