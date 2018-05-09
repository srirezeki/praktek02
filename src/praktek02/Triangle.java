package praktek02;
public class Triangle {
 double alas;
 double tinggi;

    public Triangle() {
        alas=5;
        tinggi=3;
    }

    void cetakInfo(){
        System.out.println("==========================");
        System.out.println("alas : alas");
        System.out.println("tinggi : tinggi");
        System.out.println("==========================");
    }
    
    double hitungluas(){
        double luas;
        luas=0.5*alas*tinggi;
        return luas; 
    }
    void cetakluas(){
        System.out.println("luasnya adalah:"+hitungluas());
    }
}
