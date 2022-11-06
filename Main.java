import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mat,fiz,kim,tur,tar,muz;

        Scanner input=new Scanner(System.in);

        System.out.print("Matematik Notu: ");
        mat=input.nextInt();

        System.out.print("Fizik Notu: ");
        fiz=input.nextInt();

        System.out.print("Kimya Notu: ");
        kim=input.nextInt();

        System.out.print("Türkçe Notu: ");
        tur=input.nextInt();

        System.out.print("Tarih Notu: ");
        tar=input.nextInt();

        System.out.print("Müzik Notu: ");
        muz=input.nextInt();
        double ort=(mat+fiz+kim+tur+tar+muz)/6;

        boolean sonuc=ort>=60;
        String str=sonuc ? "Geçti" : "Kaldı";
        System.out.println("Not ortalamanız "+ort +"\nDers Durumu: "+ str);

    }
}