public class Patient {
    private int id;
    private String name;
    private int age;
    private String address;
    private String diagnosis;

    // Constructor
    public Patient(int id, String name, int age, String address, String diagnosis) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.diagnosis = diagnosis;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // Overriding toString method for display
    @Override
    public String toString() {
        return "Patient ID: " + id + 
               ", Name: " + name + 
               ", Age: " + age + 
               ", Address: " + address + 
               ", Diagnosis: " + diagnosis;
    }
}