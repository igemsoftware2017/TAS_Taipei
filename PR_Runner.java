import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;
public class PR_Runner
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(in);
        while(true){
            out.print("Enter L (Initial nanoparticle concentration) :: ");
            double L = keyboard.nextDouble();
    
            out.print("Enter R (Initial bacteria concentration):: ");
            double R = keyboard.nextDouble();
    
            out.print("Enter C (Initial Nanoparticle-PR complex, is usually 0 at the start):: ");
            double C = keyboard.nextDouble();
            
            out.print("Enter t (The amount of time that can be used for the process):: ");
            double t = keyboard.nextDouble();
    
            //test cases
            //PR test = new PR(5, 151600.0, 0);
            //System.out.println(PR.returnNP(12));
            
            //initialize a PR object, throwing in the inputted values
            PR test = new PR(L, R, C);
            //printing out the nanoparticle concentration after the specified amount of time with the initial nanoparticle and bacteria concentration
            System.out.println(test.returnNP(t));
            
            System.out.print("Continue? (Y/N)");
            char cont = keyboard.next().charAt(0);
            if(cont == 'N'){
                break;
            }
        }
    }
}
