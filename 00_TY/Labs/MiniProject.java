abstract class Doctor {
    private String name;
    private String specialization;
    private double Fee;

    public Doctor(String name, String specialization, double Fee) {
        this.name = name;
        this.specialization = specialization;
        this.Fee = Fee;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getFee() {
        return Fee;
    }

    public abstract void showDetails();
}

class GeneralPractitioner extends Doctor {
    public GeneralPractitioner(String name, double Fee) {
        super(name, "General Practitioner", Fee);
    }

    @Override
    public void showDetails() {
        System.out.println("Doctor: " + getName() + " (GP), Consultation Fee: $" + getFee());
    }
}

class Specialist extends Doctor {
    private String field;

    public Specialist(String name, String field, double Fee) {
        super(name, "Specialist - " + field, Fee);
        this.field = field;
    }

    @Override
    public void showDetails() {
        System.out.println("Doctor: " + getName() + " (Specialist in " + field + "), Consultation Fee: $" + getFee());
    }
}

class Patient {
    private String name;
    private int age;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void showDetails() {
        System.out.println("Patient: " + name + ", Age: " + age);
    }
}

class Appointment {
    private Doctor doctor;
    private Patient patient;
    private String date;

    public Appointment(Doctor doctor, Patient patient, String date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    public void showDetails() {
        System.out.println("Appointment Details:");
        doctor.showDetails();
        patient.showDetails();
        System.out.println("Date: " + date);
        System.out.println("Consultation Fee: $" + doctor.getFee());
    }
}

public class MiniProject {
    public static void main(String[] args) {
        Doctor gp = new GeneralPractitioner("Dr. Shravani", 50.0);
        Doctor specialist = new Specialist("Dr. Payal", "Cardiology", 100.0);

        Patient patient1 = new Patient("Tanu", 30);
        Patient patient2 = new Patient("Saee", 25);

        Appointment appointment1 = new Appointment(gp, patient1, "2024-08-20");
        Appointment appointment2 = new Appointment(specialist, patient2, "2024-08-21");

        appointment1.showDetails();
        System.out.println();
        appointment2.showDetails();
    }
}
