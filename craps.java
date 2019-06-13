import java.util.Random;
class craps {
  public static void main(String[] args) {
    int done = 0;
    System.out.println("Lets play Craps!");
    System.out.println("Roll the dice");
    int random = (int)(Math.random() * 6 + 1);
    System.out.println("First Die: "+ random);
    int random1 = (int)(Math.random() * 6 + 1);
    System.out.println("Second Die: "+ random1);
    int totaldice = (random+random1);
     System.out.println("Total Dice: "+ totaldice);
    if ((random + random1) == 2) {
       System.out.println("you lose!");
    }
    if ((random + random1) == 3) {
       System.out.println("you lose!");
    }
    if ((random + random1) == 12) {
       System.out.println("you lose!");
    }
    if ((random + random1) == 7) {
       System.out.println("you win!");
    }
    if ((random + random1) == 11) {
       System.out.println("you win!");
    }
    if (totaldice != 2 && totaldice != 3 && totaldice != 12 && totaldice != 7 && totaldice != 11){
     
    int firstdie = totaldice ;
	
    while (done == 0){

    int random3 = (int)(Math.random() * 6 + 1);
    System.out.println("Third Die: "+ random3);
    int random4 = (int)(Math.random() * 6 + 1);
    System.out.println("Fourth Die: "+ random4);
    int totaldice2 = (random3+random4);
     System.out.println("Second Total Dice: "+ totaldice2);
	if ((random3 + random4) == totaldice) {
    	   System.out.println("you win(secondtime)!");
		done = 1;
	}
       
	 else if ((random3 + random4) ==7){
           System.out.println("You lose");
	   done = 1;
	}


	 
          
           
	}
    }

    
    
     

    




  }
}