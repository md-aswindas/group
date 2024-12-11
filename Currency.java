//i'm Batman (aswin das)
//hello jermu(abhishek)

// Men are brave   (amal)
import java.util.*;
public class Currency{
  public static void main(String args[]){
    Convert c = new Convert();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Amount :");
    double currn = sc.nextFloat();
    
    c.convertMethod(currn);
  }
}
public class Convert{

  public void convertMethod(double currn){
    
    System.out.println("\n----------CURRENCY CONVERTER---------\n");
    char i = 'y';
    // while(i=='y'||i=='Y'){
      
      System.out.print("Press 1) US Dollar\nPress 2) UAE Dirham\nPress 3) Euro\nPress 4) IND Rupee\n");
      System.out.print("\nPRESS OPTION FOR CURRENCY YOU HAVE : ");
      Scanner sc = new Scanner(System.in);
      int Ctype = sc.nextInt();
      System.out.print("\nPress 1) US Dollar\nPress 2) UAE Dirham\nPress 3) Euro\nPress 4) IND Rupee\nPress 5) Exit\n");
      System.out.print("\nPRESS OPTION FOR CURRENCY TO BE CONVERTED : ");
      int type = sc.nextInt();
      double result;
      
      switch(type){
      case 1 : 
        if(Ctype==1){
          //result = currn * 0.01184;
          System.out.printf("$ %.2f%n",currn);
        }else if(Ctype==2){
          result = currn * 0.27229;
          System.out.printf("$ %.2f%n",result);
        }else if(Ctype==3){
          result = currn * 1.0400;
          System.out.printf("$ %.2f%n",result);
        }else if(Ctype==4){
          result = currn * 0.01183;
          System.out.printf("$ %.2f%n",result);
        }
        break;

        case 2 : 
          if(Ctype==1){
          result = currn * 3.67;
          System.out.printf("AED %.2f%n",result);
        } else if(Ctype==2){
          //result = currn * 0.27229;
          System.out.printf("AED %.2f%n",currn);
        }else if(Ctype==3){
          result = currn * 3.8194;
          System.out.printf("AED %.2f%n",result);
        }else if(Ctype==4){
          result = currn * 0.04347;
          System.out.printf("AED %.2f%n",result);
        }
        //System.out.println("Dirham ok da \n");
        break;

        case 3 :
        if(Ctype==1){
          result = currn * 0.096;
          System.out.printf("E %.2f%n",result);
        }else if(Ctype==2){
          result = currn * 0.261982;
          System.out.printf("E %.2f%n",result);
        }else if(Ctype==3){
         // result = currn * 87.7995;
          System.out.printf("E %.2f%n",currn);
        }else if(Ctype==4){
          result = currn * 0.011374;
          System.out.printf("E %.2f%n",result);
        }
        //System.out.println("Euro ok da \n");
        break;

        case 4 :
        if(Ctype==1){
          result = currn * 84.5032;
          System.out.printf("Rs. %.2f%n",result);
        }else if(Ctype==2){
          result = currn * 23.0027;
          System.out.printf("Rs. %.2f%n",result);
        }else if(Ctype==3){
          result = currn * 87.9795;
          System.out.printf("Rs. %.2f%n",result);
        }else if(Ctype==4){
          //result = currn * 0.01183;
          System.out.printf("Rs. %.2f%n",currn);
        }
        break;

        case 5 : 
        System.out.println("Exiting.... \n");
        i='n';
        break;

        default :
        System.out.println("Enter valid option \n");
      }
      
    // }
    
  }

 


}