package HospitalManagement.Facility;

import java.util.Scanner;

public class FacilityMethod {

    public void faciltyMethod() {
        Scanner sc = new Scanner(System.in);
        Faclity f[] = new Faclity[20];
        int i;
        for (i = 0; i < 20; i++) {
            f[i] = new Faclity();
        }

        f[0].fac_name = "Ambulance";
        f[1].fac_name = "Canteen";
        f[2].fac_name = "Free Wifi";
        f[3].fac_name = "ICU";

        int count = 4;

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("          **HOSPITAL FACILITY SECTION**");
        System.out.println("--------------------------------------------------------------------------------");
        int j, c1, s5 = 1;
        while (s5 == 1) {
            System.out.println("1.Add New Facility\n2.Existing Fecilities List");
            c1 = sc.nextInt();

            switch (c1) {
                case 1: {
                    f[count].addFacility();
                    count++;
                    break;
                }
                case 2: {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Hospital  Facility are:");
                    System.out.println("--------------------------------------------------------------------------------");

                    for (j = 0; j < count; j++) {
                        f[j].showFaciity();
                    }
                    break;
                }
            }
            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
            s5 = sc.nextInt();
        }
    }
}
