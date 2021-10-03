// Nama File : T07AFraction
public class T07AFraction {
  //Algoritma atau Langkah-Langkah Penyelesaian Masalah
  
      //Method yang berfungsi untuk menambahkan antara Pecahan 1 dengan Pecahan 2
      static void sumFraction(int e1, int d1, int e2, int d2){
          int es, ds, penyederhana;
          es = (e1 * d2 + e2 * d1);
          ds = (d1 * d2);
          penyederhana = faktor(es, ds);
          es = es/penyederhana;
          ds = ds/penyederhana;
          printFraction(es, ds);
      }
      //Method yang berfungdi untuk mengalikan antara Pecahan 1 dengan 2)
      static void productFraction(int e1, int d1, int e2, int d2){
          int ep, dp;
          ep = (e1 * e2);
          dp = (d1 * d2);
          int penyederhana = faktor(ep, dp);
          ep = ep/penyederhana;
          dp = dp/penyederhana;
          printFraction(ep, dp);
      }
      //Method yang berfungsi untuk menampilkan hasil ke CMD
      static void printFraction(int e, int d){
          System.out.println(e + "/" + d);
      }
      //Method untuk mencari faktor antara e dan d)
      static int faktor(int e, int d){
          int modulo;
          while(d != 0) {
              modulo = d;
              d = e%d;
              e = modulo;
          }
          return e;
      }
       public static void main(String[] args){
      //Method untuk melaksanakan Testcase
        sumFraction(1, 2, 2, 3);
        sumFraction(1, 3, 3, 4);
        productFraction(1, 2, 2, 3);
        productFraction(1, 4, 2, 3);
       }
  
      
  }