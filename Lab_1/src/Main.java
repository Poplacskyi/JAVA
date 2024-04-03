public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Ivanov", "Therapist");

        Appointment[] appointments = {
                new Appointment("Monday", "Morning", 10),
                new Appointment("Tuesday", "Evening", 15),
                new Appointment("Wednesday", "Morning", 8)
        };

        int totalVisitors = 0;
        for (Appointment appointment : appointments) {
            totalVisitors += appointment.getVisitorsCount();
        }

        Appointment minAppointment = appointments[0];
        for (int i = 1; i < appointments.length; i++) {
            if (appointments[i].getVisitorsCount() < minAppointment.getVisitorsCount()) {
                minAppointment = appointments[i];
            }
        }

        int surnameLength = doctor.getSurname().length();

        System.out.println("Total visitors count: " + totalVisitors);
        System.out.println("Appointment with minimum visitors count: " + minAppointment.getDay() + ", " + minAppointment.getShift());
        System.out.println("Length of doctor's surname: " + surnameLength);
    }
}
