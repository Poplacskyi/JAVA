class Doctor {
    private String surname;
    private String specialty;

    public Doctor(String surname, String specialty) {
        this.surname = surname;
        this.specialty = specialty;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}

class Appointment {
    private String day;
    private String shift;
    private int visitorsCount;

    public Appointment(String day, String shift, int visitorsCount) {
        this.day = day;
        this.shift = shift;
        this.visitorsCount = visitorsCount;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public int getVisitorsCount() {
        return visitorsCount;
    }

    public void setVisitorsCount(int visitorsCount) {
        this.visitorsCount = visitorsCount;
    }
}

