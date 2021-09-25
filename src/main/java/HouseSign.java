public class HouseSign
{
    public static void main(String args[])
    {
        // This is the work done in the housekeeping() method
        // Declare and initialize variables here.
        // Charge for this sign.
//        var basePrice = 35.00;
        double basePrice = 35.00;
        // Number of characters.
//        var numLetters = 8;
        int numLetters = 8;
        // Color of characters.
//        var Color = "Gold";
        String color = "Gold";
        // Type of wood.
//        var woodType = "Oak";
        String woodType = "Oak";
        // This is the work done in the detailLoop() method
        // Write assignment and if statements here as appropriate.

        if (numLetters < 5)
            System.out.println("No Charge");
        else if (numLetters > 5)
            System.out.println(3 * numLetters);
        // = in Java is used to set values, == is used to compare
        if (color == "Gold")
            System.out.println("Add $15");
//        else if (Color = "Black" or "White");
        else if (color.equals("Black") || color.equals("White"));
        System.out.println("No Charge");
        if (woodType.equals("Pine"));
        System.out.println("No Charge");
      else if (woodType.equals("Oak"))
        System.out.println(" Add $20");


        // This is the work done in the detailLoop() method



        // This is the work done in the endOfJob() method
        // Output Charge for this sign.



        totalCost = basePrice +letterCost+woodCost+charCos;




        // This is the work done in the endOfJob() method
        // Output Charge for this sign.
        System.out.println("The charge for this sign is $" + charge);

        System.exit(0);
    }
}