import java.util.Scanner;
class Main {
    static Scanner entrée = new Scanner(System.in);
    public static void main(String[] args) {
       
 int tot=0;
 int a= entrée.nextInt();
 int b= entrée.nextInt();


for (int i=b ; i<=a ;i++){

tot=tot+i*i;
 }
 System.out.println(tot);
      
}

}