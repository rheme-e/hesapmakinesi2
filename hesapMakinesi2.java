package Giris;

import java.util.Scanner;

public class hesapMakinesi2 {
    static int top(int a, int b) {
        int sonuc = a + b;
        return sonuc;
    }

    static int cikar(int a, int b) {
        int sonuc = a - b;
        return sonuc;
    }

    static int carp(int a, int b) {
        int sonuc = a * b;
        return sonuc;
    }

    static int bolm(int a, int b) {
        int sonuc = a / b;
        return sonuc;
    }

    static int uslu(int a, int b) {
        int sonuc = 1;
        for (int i = 1; i <= b; i++)
            sonuc *= a;
        return sonuc;
    }

    static int fak(int a) {
        int sonuc = 1;
        for (int i = 1; i <= a; i++)
            sonuc *= i;
        return sonuc;
    }

    static int mod(int a) {
        int sonuc = 0;
        sonuc = a % 10;
        return sonuc;
    }

    static int dik(int a, int b) {
        int alan = a * b;
        int cevre = 2 * (a + b);
        System.out.println("Alan:" + alan + "\n" + "Çevre:" + cevre);
        return 1;
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = 1;
        while (n != 0) {
            System.out.println("1-Toplama:\n2-Çıkarma:\n3-Çarpma:\n4-Bölme:\n5-Üslü Sayı Hesaplama:\n6-Faktöriyel Hesabı:\n" +
                    "7-Mod Hesabı:\n8-Dikdörtgen Alanı Çevre Hesabı:\n0-Çıkış:\nBir İşlem Seçiniz:");
            int sec = inp.nextInt();
            if (sec == 6 || sec == 7) {
                System.out.println("Sayıyı Giriniz:");
                int a = inp.nextInt();
                if (sec == 6) {
                    System.out.println("Sonuç:" + fak(a));
                } else {
                    System.out.println("Sonuç:" + mod(a));
                }
            }
            if (sec == 0) {
                System.out.println("Çıkış Yaptınız.");
                n = 0;
            }else{
                System.out.println("İlk Sayıyı Giriniz:");
                int a = inp.nextInt();
                System.out.println("İkinci Sayıyı Giriniz:");
                int b = inp.nextInt();

                if (sec == 1) {
                    System.out.println("Sonuç:" + top(a, b));
                } else if (sec == 2) {
                    System.out.println("Sonuç:" + cikar(a, b));
                } else if (sec == 3) {
                    System.out.println("Sonuç:" + carp(a, b));
                } else if (sec == 4) {
                    if (b == 0) {
                        System.out.println("Bir Sayı 0'a Bölünemez.");
                    } else
                        System.out.println("Sonuç:" + bolm(a, b));
                } else if (sec == 5) {
                    System.out.println("Sonuç:" + uslu(a, b));
                } else if (sec == 8) {
                    dik(a, b);
                }


            }
        }
    }
}
