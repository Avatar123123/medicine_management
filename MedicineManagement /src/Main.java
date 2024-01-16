    import java.util.Scanner;

    public class Main
    {
        private static Scanner input = new Scanner(System.in);

        public static Scanner getScanner()
        {
            return input;
        }

        public static boolean askUserToContinue()
        {
            System.out.println("Do you want to try again? (yes/no)");
            String userResponse = input.next();
        
            return userResponse.equalsIgnoreCase("yes");
        }
            
        public static void main(String[] args)
        {

            System.out.println("\n\n***** This program stimulates a software that is used to manage pharmacy inventory.\nMaximum quantity that can be withdrawn per request is " + MedicineInfo.maximumOrder + " *****");
            
            MedicineInfo paracetamol = new MedicineInfo("Paracetamol");
            MedicineInfo ibuprofen = new MedicineInfo("Ibuprofen");
            MedicineInfo amoxicillin = new MedicineInfo("Amoxicillin");
            MedicineInfo codeine = new MedicineInfo("Codeine");
    
            Pharmacy pharmacyName = new Pharmacy();

            pharmacyName.addMedicine(paracetamol);
            pharmacyName.addMedicine(ibuprofen);
            pharmacyName.addMedicine(amoxicillin);
            pharmacyName.addMedicine(codeine);

            pharmacyName.displayMedicineInfo();

            while (true) {
                System.out.println("What medicine do you want to search for?");
                String medicineName = input.next();
                MedicineInfo searchMedicine = pharmacyName.searchMedicine(medicineName);
        
                if (searchMedicine != null) {
                    System.out.println("what quantity?");
                    Integer requiredQuantity = input.nextInt();
                    searchMedicine.orderRequirement(requiredQuantity);
                }
    
        
                System.out.println("Do you want to try again? (yes/no)");
                String toContinue = input.next();
                if (!toContinue.equalsIgnoreCase("yes")) {
                    break;
                }
            }

        }
        
    }

