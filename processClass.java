package encaps01;
/**
 *
 * @author abari
 */
public class processClass extends genClass {
     public processClass(int yC) {
        super(yC);
    }
    
    private void setColord() {
        this.d1=r.nextInt(6);
        this.d2=r.nextInt(6);
        this.d3=r.nextInt(6);
        
        System.out.println("Drawn Colors: " + colors[d1] + ", " + colors[d2] + ", " + colors[d3]);
    }
    private void setYc(int mC, int mB) {
        if (mC==d1 || mC==d2 || mC==d3) {
            this.yc+=mB;
            this.dyw =true;
        } else {
            this.dyw =false;
            this.yc -=mB;
        }
    }
    public int getyC(int mColor, int mBet) {
        setColord();
        setYc(mColor, mBet);
        return this.yc; 
    }
}
