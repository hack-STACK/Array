import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.swing.JOptionPane;

import org.w3c.dom.UserDataHandler;

public class Tugasakhirsemesterbuaulia {
  
    //function membuat animasi text
    public static void printWithDelays(String data, TimeUnit unit, long delay)
    throws InterruptedException {
        
    for (char ch:data.toCharArray()) {
    System.out.print(ch);
    unit.sleep(delay);
    }
}

public static void main(String[] args) throws InterruptedException {
    
    //masukkan nama dan pasword
    Scanner myobj = new Scanner(System.in);
    printWithDelays("masukkan username \n", TimeUnit.MILLISECONDS, 100);
    String usename = myobj.nextLine();
    printWithDelays("masukkan paswword \n", TimeUnit.MILLISECONDS, 100);
    String password = myobj.nextLine();
  
    
    //array nama dan password
    
    String nama[]={"r","d","a"};
    String pass [] = {"w", "k", "l"};
    String kel [][] = {nama, pass};
   
    //flag
    int pilihan = 0;

//looping mencocokan data array dengan input
    for (int i = 0; i < 2; i++){
        for (int c = 0; c < 3; c++){
            if(usename.equalsIgnoreCase(kel[i][c]) && password.equalsIgnoreCase( pass [c])){
                printWithDelays("Login anda berhasil\n", TimeUnit.MILLISECONDS, 100);
                printWithDelays("selamat datang "+usename+" we glad to see you\n ", TimeUnit.MILLISECONDS, 100);
                printWithDelays("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nhalo " + usename + " apa yang anda inginkan? \n1.lihat Barang\n2.logout\n",TimeUnit.MILLISECONDS, 100);
                String menu = myobj.nextLine();
                 //switch case
                switch (menu){
                   case ("1") : printWithDelays("barang terlihat\nterima kasih banyak :)",TimeUnit.MILLISECONDS, 100);
                   break;
           
           
                   case ("2") : printWithDelays("anda telah log out \n selamat menikmati hari anda",TimeUnit.MILLISECONDS, 100);
                   break;
                }
                pilihan = 1;
                
            
                }
              
            }
         
                 
   
        }
        if (pilihan == 0 ){
            printWithDelays("data tidak ditemukan\n", TimeUnit.MILLISECONDS, 100);
            
        
             
     
    
     

    }
}
}
    
