package VizeOncesiOdevler;

public class Odev3 {
    public static void main(String[] args) {
        String girdi = "Yuksek! Ihtisas? Universitesi";
        //Sonuc; "yUKSEK! iHTISAS? uNIVERSITESI"
        System.out.println(girdi);
        System.out.println(harfDonusturme(girdi));

    }
    public static String harfDonusturme(String girdi){
        String sonuc = "";
        int charASCII;
        int fark = (int) 'c' - (int) 'C';
        for(int i = 0; i < girdi.length();i++){
           charASCII = (int) girdi.charAt(i);
           if(charASCII >= (int) 'a' && charASCII <= (int) 'z'){
              sonuc = sonuc + (char)(charASCII - fark);
           }else if(charASCII >= (int) 'A' && charASCII <= (int) 'Z'){
               sonuc = sonuc + (char)(charASCII + fark);
           }else{
               sonuc = sonuc + (char)(charASCII);
           }
        }
return sonuc;
    }
}
