public class AbsoluteNumber {
    public static int absoluteNumber(int number) {
        boolean negative = number < 0;
        if (negative){
            return -number;
        }
        return number;
    }
}
