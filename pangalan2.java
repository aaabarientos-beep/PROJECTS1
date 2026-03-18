
package pangalan;


public class pangalan2 {
    int n;
    String m;
    public pangalan2 () {
      this.m="HHH ";
      this.n=10;
     
    }
    public pangalan2 (String name) {
        this();
        this.m+=name;
    }
    public pangalan2 (String fn, String ln) {
        this(fn);
        this.m+=ln;
    }
}
