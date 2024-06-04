public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "887ds7nds87dsfs";
        
        
        
        //Parse shirtPrice and taxRate, and print the total tax
        int shirtPriceint = Integer.parseInt(shirtPrice);
        System.out.println("O preco da camisa e: " + shirtPriceint); 
        
        
        //Try to parse taxRate as an int
        double taxRateDouble = Double.parseDouble(taxRate);
        System.out.println("A taxa de imposto e: " + taxRateDouble);
        
        //Try to parse gibberish as an int
        try {
            int gibberishInt = Integer.parseInt(gibberish);
            System.out.println("O valor gibberish convertido para int e:" + gibberishInt);
        }   catch (NumberFormatException e) {
            System.out.println("Erro ao converter gibberish para int: " + e.getMessage());
       
        }
    }
}

    

