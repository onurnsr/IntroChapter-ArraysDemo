public class Main {

    public static void main(String[] args) {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("********");

        String [] ogrenciler= new String[4];
        ogrenciler[0]="Engin";
        ogrenciler[1]="Derin";
        ogrenciler[2]="Salih";
        ogrenciler[3]="Ahmet";
        //ogrenciler[4]="Ali"; dizi boyutu aşıldığından bunu aktif etmemiz hataya neden olacaktır.

        for (int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("********");

        for (String ogrenci:ogrenciler){  //Her bir öğrenciyi öğrenci değişkenine atayarak o dizi boyutu kadar aşağıda yazdırır.
            System.out.println(ogrenci);
        }

    }
}
