package cwiczenie5;

public class Temperature {

    public Temperature() {

    }

    public boolean under100(int t1, int t2) {
        if (t1<100 || t2<100) {
            return true;
        }else return false;
    }
}
