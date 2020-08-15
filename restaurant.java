package assignment1;

public class restaurant {
	public static void main(String[] args) {
		float ta,fa,pr1,pr2;
		int p1,p2,p3,tax;
		p1=70;p2=20;p3=10;tax=18;
		ta=p1+p2+p3;
		fa=ta+ta*tax/100;
		System.out.println("OUTPUT 1");
		System.out.println("Price1:"+p1);
		System.out.println("Price2:"+p2);
		System.out.println("Price3:"+p3);
		System.out.println("Tax%:"+tax);
		System.out.println("Final Amount:"+fa);
		 pr1=(float) 15.5;
		 pr2=(float) 4.5;
		p3=30;tax=5;
		ta=pr1+pr2+p3;
		fa=ta+ta*tax/100;
		System.out.println("OUTPUT  2 ");
		System.out.println("Price1:"+pr1);
		System.out.println("Price2:"+pr2);
		System.out.println("Price3:"+p3);
		System.out.println("Tax%:"+tax);
		System.out.println("Final Amount:"+fa);
	}
}
