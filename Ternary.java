class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.println("Absolute value of " + i + " is " + k);

        i = -10;
        k = i < 10 ? -i : i;
        System.out.println("Absolute value of " + i + " is " + k);
    }
}
//...........................................................................
