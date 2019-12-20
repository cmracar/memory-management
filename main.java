// Cemre Acar

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    First_Best_Worst myfit = new First_Best_Worst();
	    int [] mymemory = {100, 500, 200, 300, 600};
	    int [] myprocess = {212, 417, 112, 426};

		Scanner myvalue = new Scanner(System.in);
		System.out.println("--- Memory Management ---\n1 - ) First Fit\n2 - ) Best Fit\n3 - ) Worst Fit");
		System.out.print("Which one will apply ? :\t");
		int choice = myvalue.nextInt();

		switch (choice){
			case 1:
				System.out.println("\n------------FIRST FIT-------------");
				myfit.first_fit(mymemory,mymemory.length,myprocess,myprocess.length);
				break;
			case 2:
				System.out.println("\n------------BEST FIT-------------");
				myfit.best_fit(mymemory,mymemory.length,myprocess,myprocess.length);
				break;
			case 3:
				System.out.println("\n------------WORST FIT-------------");
				myfit.worst_fit(mymemory,mymemory.length,myprocess,myprocess.length);
				break;
			default:
				break;
		}


    }
}
