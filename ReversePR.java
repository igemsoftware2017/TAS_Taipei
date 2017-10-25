public class ReversePR
{
    private static double t = 0; //target time
    private static double tStep = 0.01; 
    private static double kOn = 3.5E-7; // k(On)
    private static double L = 0; // Nanoparticle Concentration
    private static double StartL = 0; //Starting Bacteria Concentration
    private static double R = 0;// Bacteria Concentration
    private static double StartR = 0; //Starting Bacteria Concentration
    private static double kOff = 0.32; //k(Off)
    private static double C = 0; //Complex
    private static double dcdt = kOn*L*R - kOff*C;
    private static double targetL = 0;

    /**
     * Constructor for objects of class PR
     */
    public ReversePR(double L, double targetL, double C)
    {
        this.L = L;
        StartL = L;
        this.targetL = targetL;
        this.C = C;
        StartR = 20000*L;
        dcdt = kOn*L*R - kOff*C;
    }

    public void setkOn(int kOn){
        this.kOn = kOn;
    }
    
    public void setkOff(int kOff){
        this.kOff = kOff;
    }
    
    public static double returnBact(double t){
        int i = 0;
        while(true){
            R = StartR;
            L = StartL;
            PR test = new PR(L,R,C);
            L = test.returnNP(t);
            if(Math.abs(L-targetL)>=0.0001){
                if((L-targetL)>0){
                    StartR += 100;
                }else{
                    StartR -= 100;
                }
            }else{
                break;
            }
            System.out.println(L-targetL);
            i++;
            System.out.println(i);
        }
        return StartR;
    }
}
