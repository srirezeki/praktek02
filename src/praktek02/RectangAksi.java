package praktek02;

public class RectangAksi {
    public static void main(String[] args ){
        rectangle rl = new rectangle();
        rl.panjang = 9;
        rl.lebar =3;
        
         rl.cetakInfo();
        System.out.print("Luas rectangle = "+ rl.hitungluas());
        rl.cetakluas();
        
        rectangle r2 = new rectangle();
        r2.cetakInfo();
        
        rectangle r3 = new rectangle (50,30);
        r3.cetakInfo();
   }
   
            
}
    
