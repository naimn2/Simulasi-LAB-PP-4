import java.util.Scanner;
import java.lang.*;
class panjangKapal{
    public static void main(String[] args) {
        double a,b,h,x;
        Scanner key=new Scanner(System.in);
        System.out.print("masukan nilai h = ");
        h=key.nextDouble();
        System.out.print("masukan nilai a = ");
        a=key.nextDouble();
        System.out.print("masukan nilai b = ");
        b=key.nextDouble();
        if (90>a && b<a){
            a=Math.toRadians(a);
            b=Math.toRadians(b);
            x=((Math.tan(a)*h)-(Math.tan(b)*h));
            System.out.printf("Panjang Kapal %.1f m",x);
        }
        else{
            System.out.println("maaf input yang ada masukkan salah");
        }
    }
}