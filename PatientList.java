import java.util.ArrayList;

public class PatientList {
    private ArrayList<Patient> patients = new ArrayList<>();
    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void listPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
        }
        else {
            for (Patient patient : patients) {
                System.out.println(patient);
            }
        }
    }

    public Patient searchPatient(int id) {
        for (Patient patient : patients) {
            if (patient.getId() == id) {
                return patient;
            }
        }
        return null;
    }

    public void editPatient(int id, String name, int age, String address, String diagnosis) {
        Patient patient = searchPatient(id);
        if (patient != null) {
            patient.setName(name);
            patient.setAge(age);
            patient.setAddress(address);
            patient.setDiagnosis(diagnosis);
            System.out.println("Patient record updated.");
        }
        else {
            System.out.println("Patient not found.");
        }
    }

    public void deletePatient(int id) {
        Patient patient = searchPatient(id);
        if (patient != null) {
            patients.remove(patient);
            System.out.println("Patient record deleted.");
        }
        else {
            System.out.println("Patient not found.");
        }
    }
}
