package Day01;

// representing medicine info
interface MedicineInfo {
    void displayLabel();
}

// Classes for MedicineInfo 
class Tablet implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Store Tablets in a cool dry place.");
    }
}

class Syrup implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Syrup is consumable only on prescription.");
    }
}

class Ointment implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Ointment is for external use only.");
    }
}


public class D01P02 {
    public static void main(String[] args) {
        
        MedicineInfo tablet = new Tablet();
        MedicineInfo syrup = new Syrup();
        MedicineInfo ointment = new Ointment();
        tablet.displayLabel();
        syrup.displayLabel();
        ointment.displayLabel();
    }
}
