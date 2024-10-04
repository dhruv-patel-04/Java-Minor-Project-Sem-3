import java.util.Scanner;

public class Ui {
    private Scanner scanner = new Scanner(System.in);
    private PatientList  patientList = new  PatientList ();
    private Admin admin=new Admin("charusat","ceit");


    public void startUi()
    {
        while(true) {
            System.out.println("1.Admin login .");
            System.out.println("2.Patient list . ");
            System.out.println("3.search Patient .");
            System.out.println("4.Exit");
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    adminLogin();
                    break;
                case 2:
                    patientList.listPatients();
                    break;
                case 3:
                    searchPatient();
                    break;
                case 4:
                    return;

                default:
                    System.out.println("Enter valid choice : ");
            }
        }
    }
    private void searchPatient()
    {
        System.out.println("Enter Patient ID :");
        int ID = scanner.nextInt();
        Patient patient1=patientList.searchPatient(ID);
        if (patient1!=null)
        {
            System.out.println(patient1);
        }else
            System.out.println("Patient not found...");
    }
    private void editPatient()
    {
        System.out.println("Enter Patient ID :");
        int ID = scanner.nextInt();
        Patient patient=patientList.searchPatient(ID);
        if (patient!=null)
        {
            System.out.println("Enter new Details ");
            System.out.println("Enter patient name: ");
            String nname = scanner.nextLine();
            System.out.println("Enter age: ");
            int nage = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Enter patient Address: ");
            String naddress = scanner.nextLine();
            System.out.println("Enter diagnosis: ");
            String ndiagnosis = scanner.nextLine();

            admin.editPatient(ID,patientList,new Patient(ID,nname,nage,naddress,ndiagnosis));
        }
        else
            System.out.println("patient not found..");
    }
    private void deletePatient()
    {
        System.out.println("Enter Patient ID :");
        int ID = scanner.nextInt();
        admin.deletePatient(patientList,ID);
    }

    private void adminLogin()
    {
        System.out.println("Enter username : ");
        String username = scanner.next();
        System.out.println("Enter password : ");
        String password = scanner.next();
        if (admin.login(username,password))
        {
            System.out.println("Login Successful...");
            while (true)
            {
                System.out.println();
                System.out.println("\n1. Add Patient\n2. List Patients\n3. Search Patient\n" +
                        "4. Edit Patient Record\n5. delete Patient\n6. Exit");
                System.out.println("choose an option :");
                int choice = scanner.nextInt();
                switch(choice) {
                    case 1:
                        System.out.println("Enter Patient ID :");
                        int patientID = scanner.nextInt();
                        System.out.println("Enter Patient Name :");
                        String patientName = scanner.next();
                        System.out.println("Enter Patient Age :");
                        int patientAge = scanner.nextInt();
                        System.out.println("Enter Patient Adress :");
                        String patientAdress = scanner.next();
                        System.out.println("Enter Patient Diagnosis :");
                        String patientDiagnosis = scanner.next();

                        Patient patient=new Patient(patientID,patientName,patientAge,patientAdress,patientDiagnosis);
                        admin.addPatient(patientList,patient);
                        break;
                    case 2:
                        patientList.listPatients();
                        break;
                    case 3:
                        searchPatient();
                        break;
                    case 4:
                        editPatient();
                        break;

                    case 5:
                        deletePatient();
                        break;
                    case 6:
                        return;

                    default:
                        System.out.println("Enter valid choice : ");

                }
            }
        }else
            System.out.println("Wrong Username or Password...");
    }
}
