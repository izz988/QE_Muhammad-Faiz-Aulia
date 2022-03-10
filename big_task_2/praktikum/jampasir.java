import java.util.Scanner;
class jampasir {
  public static void main(String [] args) {
    System.out.print("masukan jumlah baris : ");
    Scanner input = new Scanner(System.in);

    int jumlah = input.nextInt();
    jampasirrev(jumlah);
    jampasir(jumlah);
  }

  public static void jampasir(int tinggi){
    for(int i = 2; i <= tinggi; i++){
      for(int j = 1; j <= (tinggi*2)-1; j++){
        if(Math.abs(tinggi-j)<i){
          System.out.print( "0" );
        }else{
          System.out.print( " " );
        }
      }
      System.out.println();
    }
  }

  public static void jampasirrev(int tinggi){
    for(int i = tinggi; i>=1;i--){
       for(int j=1;j<=(tinggi*2)-1;j++){
        if(Math.abs(tinggi-j)<i){
          System.out.print( "0" );
        }else{
          System.out.print( " ");
        }
      }
      System.out.println();
    }
  }
}