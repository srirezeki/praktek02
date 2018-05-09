package praktek02;

public class TriangleAksi {
    public static void main(String[] args){
  Triangle r1 = new Triangle();
  r1.alas =5 ;
  r1.tinggi =3 ;
  
  r1.cetakInfo();
  System.out.println("luas triangle ="+r1.hitungluas());
  r1.cetakluas();
  
  Triangle r2 = new Triangle();
  r2.cetakInfo();
  
  Triangle r3 = new Triangle(50,30);
  r3.cetakInfo();
  }
    
}
