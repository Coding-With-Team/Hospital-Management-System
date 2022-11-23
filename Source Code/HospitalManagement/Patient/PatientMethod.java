package HospitalManagement.Patient;

import java.util.Scanner;

public class PatientMethod {
    public void patientMethod() {
        Scanner Sc = new Scanner(System.in);

        Patient p[] = new Patient[100];
        int i;
        for (i = 0; i < 100; i++) {
            p[i] = new Patient();
        }

        p[0].pslno = 1;
        p[0].pid = 10;
        p[0].pname = "Soumya";
        p[0].pdisease = "Fever";
        p[0].pgender = "Male";
        p[0].padmitstatus = "Normal bed";
        p[0].page = 21;

        p[1].pslno = 2;
        p[1].pid = 20;
        p[1].pname = "Manas";
        p[1].pdisease = "Maleria";
        p[1].pgender = "Male";
        p[1].padmitstatus = "Normal bed";
        p[1].page = 20;

        p[2].pslno = 3;
        p[2].pid = 30;
        p[2].pname = "Somnath";
        p[2].pdisease = "Typhoid";
        p[2].pgender = "Male";
        p[2].padmitstatus = "Normal bed";
        p[2].page = 23;

        p[3].pslno = 4;
        p[3].pid = 40;
        p[3].pname = "Chintu";
        p[3].pdisease = "Cancer";
        p[3].pgender = "Male";
        p[3].padmitstatus = "Ventilator";
        p[3].page = 20;

        int count = 4;
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("                     **PATIENT SECTION**");
        System.out.println("--------------------------------------------------------------------------------");

        int j, c = 1, s = 1;
        while (s == 1) {
            System.out.println("1.Add new entry\n 2.Existing Patients List");
            c = Sc.nextInt();
            switch (c) {
                case 1: {
                    p[count].addPatientData();
                    count++;
                    break;
                }
                case 2: {
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Slno  \t  Id  \t  Name  \t  Disease  \t  Gender  \t  Admitstatus  \t  Age.");
                    System.out.println("-----------------------------------------------------------------------------");
                    for (j = 0; j < count; j++) {
                        p[j].showPatientData();
                    }
                    break;
                }
            }
            System.out.println("\n Return to back press 1 and for main menu press 0");
            s = Sc.nextInt();
        }
    }
}
