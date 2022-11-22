import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Tugasakhirsemesterbuaulia {
  
    //function membuat animasi text
    public static void printWithDelays(String data, TimeUnit unit, long delay)
    throws InterruptedException {
        
    for (char ch:data.toCharArray()) {
    System.out.print(ch);
    unit.sleep(delay);
    }

  
}











public static Double kurs(Double d) {
    Double a = d * 15.000;
    return a;
        
}


public static void main(String[] args) throws InterruptedException {
    boolean willcontinue = true;
    boolean willdontcon = false;
    int fails = 0;



    int pc = 1500000;
    int laptop = 100000;
    int keyboard = 500000;



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
    int loop = 0;
    int tdk = 0;


//looping mencocokan data array dengan input
    for (int i = 0; i < 2; i++){
        for (int c = 0; c < 3; c++){
            
            if(usename.equalsIgnoreCase(kel[i][c]) && password.equalsIgnoreCase( pass [c])){
                printWithDelays("Login anda berhasil\n", TimeUnit.MILLISECONDS, 100);
                printWithDelays("selamat datang "+usename+" we glad to see you\n ", TimeUnit.MILLISECONDS, 100);
                while(loop < 1){
                printWithDelays("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nhalo " + usename + " apa yang anda inginkan? \n1.lihat Barang\n2.logout\n",TimeUnit.MILLISECONDS, 100);
                String menu = myobj.nextLine();
                 //switch case
                switch (menu){
                   case ("1") : printWithDelays("1.pc\n2.laptop\n3.keyboard\n",TimeUnit.MILLISECONDS, 100);
                   String pil = myobj.nextLine();
                   System.out.println("----------------");
                            if (pil.equalsIgnoreCase("1")){
                                while(willcontinue){
                                    printWithDelays("baik tuan "+ usename +" pc ini seharga 15.000.000-rp \n apakah anda ingin melanjutkan pembayaran (y/n)\n", TimeUnit.MILLISECONDS, 100);
                                    String w = myobj.nextLine();
                                    if (w.equalsIgnoreCase("n")) {
                                        printWithDelays(menu, TimeUnit.MILLISECONDS, 100);
                                        
                                        willcontinue = false;
                                    }

                                
                                    

                                    if (w.equalsIgnoreCase("y")){
                                        printWithDelays("1.dolar as\n2.rupiah indonesia\n", TimeUnit.MILLISECONDS, 100);
                                        String awiai = myobj.nextLine();
                                        if (awiai.equalsIgnoreCase("1")){
                                            printWithDelays("masukkan nominal anda", TimeUnit.MILLISECONDS, 100);
                                            Double afad = myobj.nextDouble();
                                            System.out.println("----------------------------");
                                            Double o = kurs(afad) - pc;
                                           printWithDelays("kurang" + o , TimeUnit.MILLISECONDS, 100);

                                                while (o < pc){
                                                    printWithDelays("", TimeUnit.MILLISECONDS, 100);
                                                    Double input = myobj.nextDouble();
                                                    Double fasfsa = kurs(input) - pc;
                                                    printWithDelays("anda kurang " + fasfsa + "silahka masukkan lagi\n", TimeUnit.MILLISECONDS, 100);
                                                    
                                                    
                                                    if (input > pc){
                                                        printWithDelays("\nterima kasih sudah membeli", TimeUnit.MILLISECONDS, 100);
                                                        break;
                                                            }
                                                      
                                                            break;
                                                }
                                               
                                                if (o > pc){
                                                    printWithDelays("\nterima kasih sudah membeli", TimeUnit.MILLISECONDS, 100);
                                                }break;
                                                
                                         
                                              
                                        }
                                        if (awiai.equalsIgnoreCase("2")){
                                            printWithDelays("masukkan nominal anda", TimeUnit.MILLISECONDS, 100);
                                            int afad = myobj.nextInt();
                                            int l = afad - pc;
                                            System.out.println("----------------------------");
                                            printWithDelays("anda telah membeli dengan kembalian" + l, TimeUnit.MILLISECONDS, 100);
                                            break;
                                        }
                                        
                                        
                                       
                                        
                                        
                                        
                                        

                                    }
                                    
                                
                                    
                                }
                               
                           
                             
                            }
                   break;
                   case ("2") : printWithDelays("apakah anda yakin ? (y/n)",TimeUnit.MILLISECONDS, 100);
                   String ape = myobj.nextLine();
             
                  
                   
                  
                       
                   
                   
     
                             
                                while(ape.equalsIgnoreCase("n")){
                                    printWithDelays(menu, TimeUnit.MILLISECONDS, 100);
                                    willcontinue = true;
                                    break;
                                    
                                }
                                if(ape.equalsIgnoreCase("y")){
                                    printWithDelays("oke :(", TimeUnit.MILLISECONDS, 100);
                                    break;
                                   }
                            break;
                   

                         

                 




                
                
               }break;
               
               
           
           
                 
                                
                                
                                
                                
                                
                                
                                
                            
                   
                }
                pilihan = 1;
                
                break;
                }
              
            }
         
                 
   
        }
        if (pilihan == 0 ){
            printWithDelays("data tidak ditemukan\n", TimeUnit.MILLISECONDS, 100);
            
        }
        
             
     
    
     

    }
}

    
