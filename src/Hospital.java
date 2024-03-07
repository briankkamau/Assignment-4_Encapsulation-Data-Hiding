
// Hospital.java
public class Hospital {
    private Doctor doctor;
    private Patient patient;

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }

    public void displayDoctorDetails() {
        if (doctor != null) {
            System.out.println("Doctor Details:");
            doctor.displayDetails();
        } else {
            System.out.println("No doctor assigned to the hospital.");
        }
    }

    public void displayPatientDetails() {
        if (patient != null) {
            System.out.println("Patient Details:");
            patient.displayDetails();
        } else {
            System.out.println("No patient assigned to the hospital.");
        }
    }
}