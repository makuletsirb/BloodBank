import java.util.Scanner;

class BloodInfo {
    private String bloodType;
    private String rhFactor;

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        BloodInfo bloodInfo = new BloodInfo();
        
        System.out.print("Enter blood type (e.g., A, B, AB, O): ");
        String bloodTypeInput = scanner.nextLine();
        bloodInfo.setBloodType(bloodTypeInput);
        
        System.out.print("Enter Rh factor (+ or -): ");
        String rhFactorInput = scanner.nextLine();
        bloodInfo.setRhFactor(rhFactorInput);

        System.out.println("Blood Type: " + bloodInfo.getBloodType());
        System.out.println("Rh Factor: " + bloodInfo.getRhFactor());
        
        scanner.close();
    }
}