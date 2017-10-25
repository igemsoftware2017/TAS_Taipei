import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;
public class ReversePR_Runner
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(in);
        while(true){
            out.print("Enter L (nanoparticle concentration) :: ");
            double L = keyboard.nextDouble();
    
            out.print("Enter target L (target nanoparticle concentration):: ");
            double targetL = keyboard.nextDouble();
    
            out.print("Enter C (Nanoparticle-PR complex, is usually 0 at the start):: ");
            double C = keyboard.nextDouble();
            
            out.print("Enter t (The amount of time that can be used for the amount of nanoparticle concentration decrease):: ");
            double t = keyboard.nextDouble();
    
            //test cases
            //ReversePR test_new = new ReversePR(5, 3.312214855, 0);
            //System.out.println(test_new.returnBact(6));
            
            
            //initialize a ReversePR object, throwing in the inputted values
            ReversePR test = new ReversePR(L, targetL, C);
            //printing out the initial bacteria concentration needed
            System.out.println(test.returnBact(t));
            
            System.out.print("Continue? (Y/N)");
            char cont = keyboard.next().charAt(0);
            if(cont == 'N'){
                break;
            }
        }
    }
}
