import java.util.Scanner;
class Main
{
  private static int sqaurePlotToBuy(int minApples) {
	double totalApplesInSquare = 0;
	int unit =0;
	while(minApples>totalApplesInSquare){
	unit++;

	totalApplesInSquare +=12*Math.pow(unit,2);
	}

	return unit*8;
	}
  public static void main(String args[])
  {
    //Try out your code here
    //System.out.println("Hello World!");
    Scanner sc =new Scanner(System.in);
    int minApples = sc.nextInt();
    int minPerimeter = sqaurePlotToBuy(minApples);
    System.out.println(minPerimeter);
  }
}