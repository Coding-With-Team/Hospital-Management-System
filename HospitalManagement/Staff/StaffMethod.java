package HospitalManagement.Staff;

import java.util.Scanner;

public class StaffMethod {

    public void staffMethod() {
        Scanner sc = new Scanner(System.in);

        Staff s[] = new Staff[50];
        int i;
        for (i = 0; i < 50; i++) {
            s[i] = new Staff();
        }

        s[0].slno = 01;
        s[0].id = 23;
        s[0].name = "Ganesh mishra";
        s[0].desg = "House Keeping";
        s[0].gender = "male,";
        s[0].salery = 49999;

        s[1].slno = 02;
        s[1].id = 18;
        s[1].name = "Ramesh mishra";
        s[1].desg = "Security";
        s[1].gender = "male,";
        s[1].salery = 20000;

        s[2].slno = 03;
        s[2].id = 43;
        s[2].name = "Manashi Das";
        s[2].desg = "Nurse";
        s[2].gender = "female,";
        s[2].salery = 35000;

        s[3].slno = 04;
        s[3].id = 23;
        s[3].name = "Rasmita Sahoo";
        s[3].desg = "Patient care taker";
        s[3].gender = "female,";
        s[3].salery = 25000;


        int count = 4;

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("                       **STAFF SECTION**");
        System.out.println("--------------------------------------------------------------------------------");

        int j, c = 1, s1 = 1;

        while (s1 == 1) {
            System.out.println("1.Add New Entry\n2.Existing Staff List");
            c = sc.nextInt();
            switch (c) {
                case 1: {
                    s[count].addStaffData();
                    count++;
                    break;
                }
                case 2: {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Slno  \t  Staff Id  \t Staff Name  \t  Designation  \t  Gender  \t  Salary.");
                    System.out.println("--------------------------------------------------------------------------------");
                    for (j = 0; j < count; j++) {
                        s[j].showExistingStaffList();
                    }
                    break;
                }
            }
            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
            s1 = sc.nextInt();
        }
    }
}

