import java.util.Scanner;
class bensin{
    public static void main(String[] args) {
        double waktu, kecepatan,     bensin,efisiensi, jarak;
        Scanner key=new Scanner(System.in);
        efisiensi=14;
        waktu=key.nextDouble();
        kecepatan=key.nextDouble();
        jarak=kecepatan*waktu;
        bensin=jarak/efisiensi;
        System.out.printf("%s%.3f%s","Bensin Yang Digunakan : ",bensin," L");
    }
}