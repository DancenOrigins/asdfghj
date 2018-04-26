package myDudes;

import java.util.Scanner;

public class Class_made {

	public static void main(String[] args) {
		Class_ig [] Games = new Class_ig[5];
		
		Games[0] = new Class_ig(20,150,15);
		Games[1] = new Class_ig(16,95,5);
		Games[2] = new Class_ig(30,205,35);
		Games[3] = new Class_ig(19,120,5);
		Games[4] = new Class_ig(25,130,20);
		
		Scanner scan = new Scanner (System.in);
		
		int i = 0;
		
		for(i=0;i < Games.length;i++){
			if(Games[i].Age >= 18 && Games[i].Age<38 && Games[i].weight<=200){
				System.out.println("You are Healthy");
			}else if(Games[i].Age >= 38 && Games[i].Age <= 58 && Games[i].income <= 50){
				 System.out.println("You are in the low risk category");
			}else{
				System.out.println("You are in the High risk category");
			}

}
		scan.close();
}
}