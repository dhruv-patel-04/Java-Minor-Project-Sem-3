public class Admin {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public boolean login(String username, String password) {
       return username.equals(this.username) && password.equals(this.password);
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
