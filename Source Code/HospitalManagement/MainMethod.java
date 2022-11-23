package HospitalManagement;

import HospitalManagement.Doctor.DoctorMethod;
import HospitalManagement.Facility.FacilityMethod;
import HospitalManagement.Labroatories.LabrotryMethod;
import HospitalManagement.Medicine.MedicineMethod;
import HospitalManagement.Patient.Patient;
import HospitalManagement.Patient.PatientMethod;
import HospitalManagement.Staff.StaffMethod;

import java.util.Calendar;
import java.util.Scanner;

public class MainMethod {
    public void mainMethod() {
        try {
            String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

            Calendar calendar = Calendar.getInstance();
            System.out.println("\n--------------------------------------------------------------------------------");
            System.out.println("            *** Welcome to Hospital Management System  ***");
            System.out.println("--------------------------------------------------------------------------------");

            System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

            System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));


            Scanner input = new Scanner(System.in);
            int choice, status = 1;
            while (status == 1) {
                System.out.println("\n                                    MAIN MENU");
                System.out.println("-----------------------------------------------------------------------------------");
                System.out.println("1.Doctors  2.Patients  3.Medicines  4.Laboratories  5.Facilities  6.Staff 7.Exit");
                System.out.println("-----------------------------------------------------------------------------------");

                choice = input.nextInt();
                switch (choice) {

                    case 1: {
                        DoctorMethod d = new DoctorMethod();
                        d.doctorMethod();
                        break;
                    }
                    case 2:{
                        PatientMethod p=new PatientMethod();
                        p.patientMethod();
                        break;
                    }
                    case 3:{
                        MedicineMethod m=new MedicineMethod();
                        m.medicineMethod();
                        break;
                    }
                    case 4:{
                        LabrotryMethod l=new LabrotryMethod();
                        l.labrotryMethod();
                        break;
                    }
                    case 5:{
                        FacilityMethod f=new FacilityMethod();
                        f.faciltyMethod();
                        break;
                    }
                    case 6:{
                        StaffMethod s=new StaffMethod();
                        s.staffMethod();
                        break;
                    }
                    case 7:{
                        System.out.println("Thank You Visit Again.......");
                        return;
                    }
                    default: {
                        System.out.println(" You Have Enter Wrong Choice!!!");
                    }
                }
                System.out.println("\nReturn to MAIN MENU Press 1");
                status = input.nextInt();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
