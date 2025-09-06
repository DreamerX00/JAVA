class Receptionist {
    private String name;
    private int id;
    private String contactInfo;

    public Receptionist(String name, int id, String contactInfo) {
        this.name = name;
        this.id = id;
        this.contactInfo = contactInfo;
    }

    public void scheduleAppointment(Patient patient) {
        // Implementation here
    }

    public void collectInformation(Patient patient) {
        // Implementation here
    }

    public void allotBed(Patient patient, String ward, int bedNumber) {
        patient.setWard(ward);
        patient.setBedNumber(bedNumber);
    }

    public void receivePayments(Patient patient) {
        // Implementation here
    }
}

class Patient {
    private String name;
    private int id;
    private String contactInfo;
    private String medicalHistory;
    private String ward;
    private int bedNumber;

    public Patient(String name, int id, String contactInfo, String medicalHistory) {
        this.name = name;
        this.id = id;
        this.contactInfo = contactInfo;
        this.medicalHistory = medicalHistory;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }
}
