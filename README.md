# java-minor-project-sem-3

Hospital Record System: This project is to keep patients details, Admin can only have rights to access all features and access it by admin credentials. The admin can add the number of patient details and users can see the details of every patients in the list form. The admin can also delete the patient records if he/she wants to remove them.
 Features:
 1. Add Patients Record
 2. List Patients Record
 3. Search Patients Record
 4. Edit Patients Record
 5. Delete Patients Recod
 6. Exit



Here’s how the work for the Hospital Record System project can be distributed among the team of four:

Project Breakdown:
Admin Features:

  Add Patient Record
  Edit Patient Record
  Delete Patient Record
  Exit
User Features:

  List Patient Records
  Search Patient Records


Team Work Distribution:

1. Dhup:
Admin Class and Credentials Management
Create the Admin class to handle admin authentication and role management.
Implement methods for addPatient(), editPatient(), and deletePatient().
Work on the core logic of the hospital record system, allowing only admin users to add, edit, and delete records.
Provide methods for admin login and session handling.

2. Dhruv:
Patient Record Management
Design the Patient class, which includes attributes like id, name, age, address, diagnosis, etc.
Implement the PatientList class for storing and managing patient records using an array or ArrayList.
Ensure efficient data structures to hold patient records.

3. Dharam:
List and Search Functionality
Implement the methods to list all patients' records (visible to both users and admins).
Implement search functionality (searchPatient()) where patients can be searched by ID, name, or other attributes.
Optimize the search method to handle large datasets efficiently.

4. Jahnavi:
UI/Console Interface and Input Handling
Handle the user interface, ensuring smooth interaction between the user/admin and the system.
Implement the menu system that provides options for the admin to log in, list patients, search, add, edit, delete, and exit the system.
Manage user input and handle exceptions (e.g., invalid input).
Class Diagram:
The class diagram can be organized as follows:


               +--------------------+
               |       Admin         |
               +--------------------+
               | - username: String  |
               | - password: String  |
               +--------------------+
               | + login(): boolean  |
               | + addPatient()      |
               | + editPatient()     |
               | + deletePatient()   |
               +--------------------+
                        |
                        |
               +---------------------+
               |      Patient         |
               +---------------------+
               | - id: int            |
               | - name: String       |
               | - age: int           |
               | - address: String    |
               | - diagnosis: String  |
               +---------------------+
               | + toString(): String |
               +---------------------+
                        |
                        |
              +-----------------------+
              |     PatientList        |
              +-----------------------+
              | - patientArray: Array  |
              +-----------------------+
              | + addPatient()         |
              | + listPatients()       |
              | + searchPatient()      |
              | + editPatient()        |
              | + deletePatient()      |
              +-----------------------+
                        |
                        |
              +-----------------------+
              |         UI            |
              +-----------------------+
              | + displayMenu()        |
              | + handleInput()        |
              | + displayRecords()     |
              | + searchMenu()         |
              +-----------------------+
This distribution ensures clear responsibilities for each team member. 






