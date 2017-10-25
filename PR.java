
public class PR
{
    private static double t = 0; //target time
	private static double tStep = 0.1; 
	private static double kOn = 3.5E-7; // k(On)
	private static double L = 0; // Nanoparticle Concentration
	private static double R = 0;// Bacteria Concentration
	private static double kOff = 0.32; //k(Off)
	private static double C = 0; //Complex
	private static double dcdt = kOn*L*R - kOff*C;

    /**
     * Constructor for objects of class PR
     */
    public PR(double L, double R, double C)
    {
        this.L = L;
        this.R = R;
        this.C = C;
        dcdt = kOn*L*R - kOff*C;
    }

    public void setkOn(int kOn){
        this.kOn = kOn;
    }
    
    public void setkOff(int kOff){
        this.kOff = kOff;
    }
    
    public static double returnNP(double t){
        for(int i = 0; i<(t/tStep); i++){
            dcdt = kOn*L*R - kOff*C;
            L = L - tStep*dcdt;
            R = R - tStep*dcdt;
            C = C+tStep*dcdt;
        }
        return L;
    }
}
