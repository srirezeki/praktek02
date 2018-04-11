package praktek02;
public class rectangle {
    double panjang;
    double lebar;
    
  void cetakInfo(){
     System.out.println("===================");
      System.out.println("Panjang :"+panjang);
     System.out.println("Lebar :"+lebar);
     System.out.println("====================");
  }
  
  
   double hitungluas() {
       double luas;
       luas=panjang*lebar;
       return luas;
   }
   
   void cetakluas(){
       System.out.println("Luasnya adalah: "+hitungluas());
       
   }
    
}
