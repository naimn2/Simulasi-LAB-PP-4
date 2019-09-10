import java.util.Scanner;
class soal4{
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        int a=key.nextInt();
        int b=key.nextInt();
        System.out.printf("apakah %d kelipatan dari %d ?%b",a,b,(b%a==0));
    }
}