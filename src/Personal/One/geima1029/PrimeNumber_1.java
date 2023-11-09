package Personal.One.geima1029;
//2023.10.30 找素数1
public class PrimeNumber_1 {
    public static void main(String[] args) {
        int count=0;
        System.out.println("素数有：");
        OUT:
        for (int i = 101; i <=200 ; i++) {
            for (int j = 2; j <=Math.sqrt(i) ; j++) {
                if (i%j==0){
                    continue OUT;
                }
            }
            count++;
            System.out.println(i);
        }
        System.out.println("一共为"+count+"个");
    }
}
