//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creating instances of Doctor, Patient, and Hospital
        Doctor doctor = new Doctor("Dr. Kamau", 40, "Cardiologist");
        Patient patient = new Patient("Jack Reacher", 30, "Heart Disease");
        Hospital hospital = new Hospital();

        // Assigning doctor and patient to the hospital
        hospital.setDoctor(doctor);
        hospital.setPatient(patient);

        // Displaying details
        hospital.displayDoctorDetails();
        hospital.displayPatientDetails();
    }
}