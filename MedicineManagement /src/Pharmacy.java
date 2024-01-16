import java.util.Set;
import java.util.HashSet;

public class Pharmacy
{
    private Set<MedicineInfo> medicineShelf = new HashSet<>();

    //method to display medicine - use enhanced for loop
    public void displayMedicineInfo()
    {
        System.out.println("AVAILABLE MEDICINES:");
        System.out.println();
        for(MedicineInfo medicine: medicineShelf)
        {
            System.out.println("Name: " + medicine.getMedicineName());
            System.out.println("Quantity: " + medicine.getMedicineQuantity());
            System.out.println();
        }
    }

    //method to add medicine
    public void addMedicine(MedicineInfo medicine)
    {
        medicineShelf.add(medicine);
    }
    
    //method to search database
    public MedicineInfo searchMedicine(String searchValue)
    {
        for (MedicineInfo medicine : medicineShelf )
        {
            if(medicine.getMedicineName().equalsIgnoreCase(searchValue))
            {
                System.out.println("Medicine found");
                return medicine;
            }      
        }
        System.out.println("MEDICINE NOT FOUND");
        return null;
    } 
}
