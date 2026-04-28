package pgr1_package;

public class pgr1_class {
    public static String display(int m) {
        if(m < 0 || m > 100) return "invalid";
        else if(m < 40) return "fail";
        return "pass";
    }
}
