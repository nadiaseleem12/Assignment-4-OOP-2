package medical;

public interface MedicalProfessional {

    int EMERGENCY_PHONE_NUMBER = 123;//public , final, static
    void treatPatient();
    void checkVitalStatus();

    default void makeCPR(){
        System.out.println("make cpr");
    }
}
