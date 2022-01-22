import java.util.Scanner;

public class Main {

        public static void main(String[] args){

            int mat, fizik, kimya, tarih, muzik, turkce;
            Scanner inp = new Scanner(System.in);


            System.out.print("Matematik Notunuz :");
            mat = inp.nextInt();
            System.out.print("Fizik Notunuz :");
            fizik = inp.nextInt();
            System.out.print("Kimya Notunuz :");
            kimya = inp.nextInt();
            System.out.print("Türkçe Notunuz :");
            turkce = inp.nextInt();
            System.out.print("Tarih Notunuz :");
            tarih = inp.nextInt();
            System.out.print("Müzik Notunuz :");
            muzik = inp.nextInt();

            int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
            double sonuc = toplam / 6;
            System.out.println("ortalama:" + sonuc);
            Boolean kosul = sonuc > 60;
            String str = (kosul) ? "Geçti" : "kaldı";
            System.out.println(str);

        }




    }

