import java.util.Scanner;

public class Opt {
    
    Scanner sc=new Scanner(System.in);

    public void MainOpt(Bank Bank1){
        System.out.println();
        System.out.println("1. Show total in bank.");
        System.out.println("2. Add a penny.");
        System.out.println("3. Add a nickel.");
        System.out.println("4. Add a dime.");
        System.out.println("5. Add a quarter.");
        System.out.println("6. Take money out of bank");
        System.out.println("Enter 0 to exit the program");
        System.out.print("Enter your choice: ");   

        //ask for input
        int scanInt=askInput();
        int choice=scanInt;  


        if (choice==0){
            System.exit(0);
        }

        else if (choice==1){
            Bank1.ShowTotal();
            System.out.println();  
            System.out.print("Another Process? ");         
            char scanChar=sc.next().charAt(0);

            if(scanChar=='y'||scanChar=='Y'){
                MainOpt(Bank1);
                System.out.println();
            }
            else if(scanChar=='n'||scanChar=='N'){
                System.exit(0);
            }

        }

        else if(choice>1&&choice<6){
            System.out.print("How much coins to add?");
            scanInt=askInput();
            Bank1.addMoney(scanInt, choice);     
            System.out.println(scanInt+"Added");
            System.out.println();
            MainOpt(Bank1);              
        }
        else if(scanInt==6){
            System.out.println();
            Bank1.takeMoney();
            MainOpt(Bank1);
        }

        else{
            System.out.println("Error: Out of Choices!");
            MainOpt(Bank1);
        }        
    }
    
    public int askInput(){
        int scanInt=sc.nextInt();
        return(scanInt);
    }
}
