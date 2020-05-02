package cwiczenie5;

public class HalfString {

    private String string;

    private int stringLength;
    private String halfString;

    public HalfString() {
        this.string = "Jakub";
        halfString = "";
    }

    public String returnHalfString(String string) {
        this.string = string;
        stringLength = this.string.length();
        for (int i = 0; i <stringLength/2; i++) {
            halfString = halfString + string.charAt(i);
        }
        return halfString;
    }
}
