package HospitalManagement.Doctor;

import java.util.Scanner;

public class DoctorMethod {
    public  void doctorMethod() {
        Scanner sc = new Scanner(System.in);
        Doctor d[] = new Doctor[20];
        int i;
        for (i = 0; i < 20; i++) {
            d[i] = new Doctor();
        }
        d[0].dslno = 1;
        d[0].did = 100;
        d[0].dname = "Dr.Ramesh";
        d[0].dspeal = "caridology";
        d[0].dqualification = " MBBS degree";
        d[0].dtime = "9am-12am";
        d[0].droomno = 10;

        d[1].dslno = 2;
        d[1].did = 200;
        d[1].dname = "Dr.Vivekendra";
        d[1].dspeal = "Orthopedics";
        d[1].dqualification = "MBBS,MD";
        d[1].dtime = "5am-8am";
        d[1].droomno = 20;

        d[2].dslno = 3;
        d[2].did = 300;
        d[2].dname = "Dr.Rajendra";
        d[2].dspeal = "General Surgery";
        d[2].dqualification = "MBBS,MS";
        d[2].dtime = "12pm-3pm";
        d[2].droomno = 30;

        int count = 3;
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("                      **DOCTOR SECTION**");
        System.out.println("--------------------------------------------------------------------------------");

        int j,c1, s1 = 1;

        while (s1 == 1) {
            System.out.println("1.Add New Entry\n2.Existing Doctors List");
            c1 = sc.nextInt();
            switch (c1) {
                case 1: {
                    d[count].addDoctorData();
                    count++;
                    break;
                }
                case 2: {
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println("Slno  \t  Id  \t  Name  \t  Spealist  \t  Qualification  \t  Timing  \t  Room no. ");
                    System.out.println("------------------------------------------------------------------------------------");
                    for (j = 0; j < count; j++) {
                        d[j].showDoctorData();
                    }
                    break;
                }
            }
            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
            s1 = sc.nextInt();
        }
    }
}

