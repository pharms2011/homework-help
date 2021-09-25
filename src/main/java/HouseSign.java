public class HouseSign {

    double basePrice = 35.00;

    int numLetters = 8;

    String color = "Gold";

    String woodType = "Oak";

    HouseSign(){
        System.out.println("Base charge, add $" + (int)basePrice);
    }

    public double endOfJob(){
        return basePrice + letterCost() + woodCost() + charCos();
    }

    public double letterCost(){
        double letterCost = 0;
        if (color == "Gold"){
            System.out.println(color + ", Add $15");
            letterCost += 15;
        }
        else if (color.equals("Black") || color.equals("White"))
            System.out.println("No Charge for Black or White");
        return letterCost;
    }

    public double woodCost(){
        double charCost = 0;
        if (woodType.equals("Pine"))
            System.out.println("No Charge for Pine");
        else if (woodType.equals("Oak")){
            System.out.println("Oak, Add $20");
            charCost = 20;
        }
        return charCost;
    }

    public double charCos(){
        double charCost = 0;
        if (numLetters < 5){
            System.out.println("No Charge for characters");
        }
        else if (numLetters > 5){
            System.out.println(numLetters + " letters cost $" + 4 * numLetters);
            charCost = 4 * (numLetters-5);
        }
        return charCost;
    }

    public static void main(String args[]) {
        // Create a house sign with default values
        HouseSign houseSign = new HouseSign();

        // Calculate the cost of the sign with default values
        double charge = houseSign.endOfJob();

        System.out.println("The charge for this sign is $" + charge);

        System.exit(0);
    }
}

