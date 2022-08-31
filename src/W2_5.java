import java.util.Scanner;
public class W2_5 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in); //Untuk input kata
	        String str1 = input.nextLine();
	        String str2 = input.nextLine();
	        System.out.println(str1.length()+str2.length()); //menghintung jumlah kata
	        // pengecekan apakah kata yang lebih besar
	        if(str1.charAt(0) <= str2.charAt(0)) { 
	            System.out.println("NO");
	        	
	        }
	        else {
	        	System.out.println("YES");
	        }
	        // untuk mengkapitalkan huruf pertama 
	        String katapertama1 = str1.substring(0,1);
	        String kataakhir1=str1.substring(1);
	        String katapertamakapital= katapertama1.toUpperCase();
	        
	        String katapertama2 = str2.substring(0,1);
	        String kataakhir2=str2.substring(1);
	        String katapertamakapital2= katapertama2.toUpperCase();
	        System.out.println(katapertamakapital+kataakhir1+" "+ katapertamakapital2+kataakhir2);
	        	
	        
	        	
	    }
	}

