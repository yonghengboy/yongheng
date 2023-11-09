package Personal.One.geima1029;

public class array01 {
    public static void main(String[] args) {
        int[] sales={16,26,36,6,100};
        int all = 0;
        for (int i = 0; i < sales.length; i++) {
            all+=sales[i];
        }
        System.out.println(all);
    }
}
