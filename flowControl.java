import java.util.Scanner;

public class flowControl {

    public static void main(String[] args) {
        
        // DATA LAYER
        final String CURRENCY = "MDL";
        
        final String FOOD_1_NAME = "\"Pizza\"";
        int food_1_available_quantity = 5; 
        final float FOOD_1_PRICE = 75.5f;
        
        final String FOOD_2_NAME = "\"Mamaliga\"";
        int food_2_available_quantity = 5;
        final float FOOD_2_PRICE = 150f;
        
        final String FOOD_3_NAME = "\"Salad\"";
        final float FOOD_3_PRICE = 30f;
        int food_3_available_quantity = 5;
        
        float totalPrice = 1;
        
        

        // PRESENTATION & LOGIC LAYER
        System.out.printf("\n********* MENU **********\n" +
                        "1. %-10s %7.2f %s\n" +
                        "2. %-10s %7.2f %s\n" +
                        "3. %-10s %7.2f %s\n" +
                        "*************************\n\n",
                FOOD_1_NAME, FOOD_1_PRICE, CURRENCY,
                FOOD_2_NAME, FOOD_2_PRICE, CURRENCY,
                FOOD_3_NAME, FOOD_3_PRICE, CURRENCY);
        /////////////////////////////////////////////////////////////////////////
        
        System.out.print("CHOOSE AN OPTION >>>");
        
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();

        if (option == 1) {
                 System.out.printf("Your choise is: %s\n", FOOD_1_NAME );	
            }
        if(option == 2) {
            	 System.out.printf("Your choise is: %s\n", FOOD_2_NAME );     
            }
        if(option == 3) {
            	 System.out.printf("Your choise is: %s\n", FOOD_3_NAME );   
            } 
        /////////////////////////////////////////////////////////////////////////
        System.out.print("How many do you want? ");
        Scanner in1 = new Scanner(System.in);
        int quant = in1.nextInt();
            
        if(quant <= food_1_available_quantity  &&  option == 1) {
        	//1 -----3 x "Pizza"   (75.50MDL) = 225.00 MDL
        	 totalPrice = quant * FOOD_1_PRICE;
        	System.out.printf("%d x %-10s (%3.2f) = %5.2f %s\n", quant, FOOD_1_NAME, FOOD_1_PRICE, totalPrice, CURRENCY);
        	}
        
        if(quant <= food_2_available_quantity  &&  option == 2) {
        	
        	 totalPrice = quant * FOOD_2_PRICE;
        	System.out.printf("%d x %-10s (%3.2f) = %5.2f %s\n", quant, FOOD_2_NAME, FOOD_2_PRICE, totalPrice, CURRENCY);
        	}
         if(quant <= food_3_available_quantity  &&  option == 3) {
        	
        	 totalPrice = quant * FOOD_3_PRICE;
        	System.out.printf("%d x %-10s (%3.2f) = %5.2f %s\n", quant, FOOD_3_NAME, FOOD_3_PRICE, totalPrice, CURRENCY);
        	}
         if(quant >= 6) {
             	System.out.println("You've orderd too many, please try again");
         }
        
        /////////////////////////////////////////////////////////////////////////
         System.out.print("Would you like food delivery?(yes, no)");
         Scanner in3 = new Scanner(System.in);
         String delivery = in.next();
           if(delivery == "yes" && totalPrice < 200 ) {
        	  System.out.println("Delivery will cost 50MDL");
           }if(delivery == "yes" && totalPrice > 200){
        	   System.out.println("Your order delivery will be free!");
           }
         
       //Confirm order ( 1 - yes, 0 - no )?
         System.out.print("Confirm order ( 1 - yes, 0 - no )?");
         Scanner in2 = new Scanner(System.in);
         int confirmation = in.nextInt();
         if( confirmation == 1) {
        	System.out.print("THANK YOU! Order confirmed"); 
         }else {
        	 System.out.print("Your order has been deleted!");
         }
         
         
         
         
         
         
         
         
         
        
	}
}