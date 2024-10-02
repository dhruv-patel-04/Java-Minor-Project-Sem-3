public class Admin {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public boolean login() {
       return username.equals("admin") && password.equals("admin");
    }
    public void addPatient(PatientList patientList ,Patient patient)
    {
        patientList.addPatient(patient);
    }
    public void editPatient(int id,PatientList patientList ,Patient newPatient)
    {
        patientList.editPatient(id, newPatient.getName(), newPatient.getAge(), newPatient.getAddress(), newPatient.getDiagnosis());
    }
    public void deletePatient(PatientList patientList ,int id)
    {
       patientList.deletePatient(id);
    }
}
