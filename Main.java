import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        PatientList  system = new  PatientList ();
        System.out.println("Choose your option");
        System.out.println("1) Admin 2) User");
        int choice = scanner.nextInt();
        if(choice == 1){
        // Admin login
        System.out.println("Enter Admin Username: ");
        String username = scanner.nextLine();
        System.out.println("Enter Admin Password: ");
        String password = scanner.nextLine();

        if (admin.login(username, password)) {
            System.out.println("Login successful!");

            // Menu for managing patients
            while (true) {
                System.out.println("\n1. Add Patient\n2. List Patients\n3. Search Patient\n4. Edit Patient Record\n5. delete Patient\n6. Exit");
                System.out.print("Choose an option: ");
                int option = scanner.nextInt();
                scanner.nextLine(); // Consume the newline

                switch (option) {
                    case 1:
                        // Add patient
                        System.out.println("Enter patient ID: ");
                        String ID = scanner.nextLine();
                        System.out.println("Enter patient name: ");
                        String name = scanner.nextLine();
                        System.out.println("Enter age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.println("Enter patient Adderess: ");
                        String address = scanner.nextLine();
                        System.out.println("Enter diagnosis: ");
                        String diagnosis = scanner.nextLine();
                        Patient New = new Patient(ID,name,age,address,diagnosis);
                        
                        system.addPatient(New);
                        break;

                    case 2:
                        // View patients
                        system.listPatients();
                        break;

                    case 3:
                        // Search patient
                        System.out.println("Enter patient ID to Search: ");
                        int id = scanner.nextInt();
                        System.out.println(system.searchPatient(id));
                        break;

                    case 4:
                        // Edit
                        System.out.println("Enter the Patient ID to edit");
                        int i = scanner.nextInt();
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
                        system.editPatient(nname,nage,naddress,ndiagnosis);
                        break;
                    case 5: 
                        //delete
                        System.out.println("Enter patient ID to Delete: ");
                        int identity = scanner.nextInt();
                        system.deletePatient(identity);
                        break;
                    case 6:
                        // exit
                        System.out.println("Exiting the system");
                        return;
                        break;

                    default:
                        System.out.println("Invalid option! Please try again.");
                }
            }
        } else {
            System.out.println("Invalid admin credentials.");
        }
    }
    else if(choice == 2){
        // user can access the patient list 
        System.out.println("As a user you can only see the Patient list ");
        system.listPatients();
    }
    else{
        System.out.println("incorrect option");
    }

        scanner.close();
    }
}

