
public class Bank {
    private double penny,nickel,dime,quarter;
    
    //Initial declaration of value (constructor)
    public Bank(double apenny, double anickel, double adime, double aquarter){
        penny=apenny;
        nickel=anickel;
        dime=adime;
        quarter=aquarter;
    }


    //Increase money by received argument amount (addedvalue) and chosen coin(chn)
    public void addMoney(double addedvalue, int chn){
        if(chn==2){
             penny=penny+addedvalue;
             System.out.println(penny);
        }
        if(chn==3){
            nickel=nickel+addedvalue;
        }
        if(chn==4){
            dime=dime+addedvalue;
        }
        if(chn==5){
            quarter=quarter+addedvalue;
        }        
    }

    //setting all value of coin to ZERO
    public void takeMoney(){
        penny=0;
        nickel=0;
        dime=0;
        quarter=0;
        System.out.println("All the money was already taken or equal to ZERO!");
    }    

    //return the value of penny
    public double getPenny(){
        return(penny);
    }

   //return the value of nickel
    public double getNickel(){
        return(nickel);
    }
   
    //return the value of dime
    public double getDime(){
        return(dime);
    }

    //return the value of quarter
    public double getQuarter(){
        return(quarter);
    }

    //display of TOTAL AMOUNT of coins
    public void ShowTotal(){
        System.out.println();
        System.out.println("=TOTAL AMOUNT=");
        System.out.println("Penny:      "+penny); 
        System.out.println("Nickel:     "+nickel);
        System.out.println("Dime:       "+dime);   
        System.out.println("Quarter:    "+quarter);                     
    }    

}
