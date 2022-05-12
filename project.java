import java.util.*;
class national
{
	void INR()
	{
	
		System.out.println(">>>>>>> Enter The Value OF INR <<<<<<<<");
		Scanner sc=new Scanner(System.in);
		int inr=sc.nextInt();
		System.out.println(">>>>>>> Choose One Of The Following Options TO convert INR <<<<<<<<");
		Scanner sc1=new Scanner(System.in);
		System.out.println("| 1 |    USD    |");
		System.out.println("| 2 |    EURO   |");
		System.out.println("| 3 |    POUND  |");
		System.out.println("| 4 |    YEN    |");
		System.out.println("| 5 |    RUBLE  |");
		System.out.println("| 6 |    PESO   |");
		System.out.println("| 7 |    PKR    |");
		System.out.println("| 8 |    YUAN   |");
		int exchange=sc1.nextInt();
		System.out.println(">>>>>>> RESPONSE <<<<<<<<");
		switch(exchange)
		{
			case 1:
			System.out.println(inr*0.013+"/USD");
			break;
			case 2:
			System.out.println(inr*0.0124+"/EURO");
			break;
			case 3:
			System.out.println(inr*0.0106+"/POUND");
			break;
			case 4:
			System.out.println(inr*1.66+"/YEN");
			break;
			case 5:
			System.out.println(inr*0.84+"/RUBLE");
			break;
			case 6:
			System.out.println(inr*0.68+"/PESO");
			break;
			case 7:
			System.out.println(inr*2.45+"/PKR");
			break;
			case 8:
			System.out.println(inr*0.088+"/YUAN");
			break;
			
		}
	
	}
	void USD()
	{
		System.out.println(">>>>>>> Enter The Value OF USD <<<<<<<<");
		Scanner sc=new Scanner(System.in);
		int usd=sc.nextInt();
		System.out.println(">>>>>>> Choose One Of The Following Options TO convert USD <<<<<<<<");
		Scanner sc1=new Scanner(System.in);
		System.out.println("| 1 |    INR    |");
		System.out.println("| 2 |    EURO   |");
		System.out.println("| 3 |    POUND  |");
		System.out.println("| 4 |    YEN    |");
		System.out.println("| 5 |    RUBLE  |");
		System.out.println("| 6 |    PESO   |");
		System.out.println("| 7 |    PKR    |");
	    System.out.println("| 8 |    YUAN   |");
		System.out.println(">>>>>>> RESPONSE <<<<<<<<");
		int exchange1=sc1.nextInt();
		switch(exchange1)
		{
			case 1:
			System.out.println(usd*77.351863+"/INR");
			break;
			case 2:
			System.out.println(usd*0.963197+"/EURO");
			break;
			case 3:
			System.out.println(usd*0.818896	+"/POUND");
			break;
			case 4:
			System.out.println(usd*128.253955+"/YEN");
			break;
			case 5:
			System.out.println(usd*64.977182+"/RUBLE");
			break;
			case 6:
			System.out.println(usd*52.384362+"/PESO");
			break;
			case 7:
			System.out.println(usd*192.396136+"/PKR");
			break;
			case 8:
			System.out.println(usd*6.786819+"/YUAN");
			break;

		}
	}
	void EURO()
	{
		System.out.println(">>>>>>> Enter The Value OF EURO <<<<<<<<");
		Scanner sc=new Scanner(System.in);
		int eur=sc.nextInt();
		System.out.println(">>>>>>> Choose One Of The Following Options TO convert EURO <<<<<<<<");
		Scanner sc1=new Scanner(System.in);
		System.out.println("| 1 |    INR    |");
		System.out.println("| 2 |    USD    |");
		System.out.println("| 3 |    POUND  |");
		System.out.println("| 4 |    YEN    |");
		System.out.println("| 5 |    RUBLE  |");
		System.out.println("| 6 |    PESO   |");
		System.out.println("| 7 |    PKR    |");
	    System.out.println("| 8 |    YUAN   |");
		System.out.println(">>>>>>> RESPONSE <<<<<<<<");
		int exchange2=sc1.nextInt();
		switch(exchange2)
		{
			case 1:
			System.out.println(eur*80.154599+"/INR");
			break;
			case 2:
			System.out.println(eur*1.035995+"/USD");
			break;
			case 3:
			System.out.println(eur*0.849545	+"/POUND");
			break;
			case 4:
			System.out.println(eur*132.989150+"/YEN");
			break;
			case 5:
			System.out.println(eur*67.560791+"/RUBLE");
			break;
			case 6:
			System.out.println(eur*54.299594+"/PESO");
			break;
			case 7:
			System.out.println(eur*199.299742+"/PKR");
			break;
			case 8:
			System.out.println(eur*6.786819+"/YUAN");
			break;
		}
	}
	void POUND()
	{
		System.out.println(">>>>>>> Enter The Value OF POUND <<<<<<<<");
		Scanner sc=new Scanner(System.in);
		int pnd=sc.nextInt();
		System.out.println(">>>>>>> Choose One Of The Following Options TO convert POUND <<<<<<<<");
		Scanner sc1=new Scanner(System.in);
		System.out.println("| 1 |    INR    |");
		System.out.println("| 2 |    USD    |");
		System.out.println("| 3 |    EURO   |");
		System.out.println("| 4 |    YEN    |");
		System.out.println("| 5 |    RUBLE  |");
		System.out.println("| 6 |    PESO   |");
		System.out.println("| 7 |    PKR    |");
	    System.out.println("| 8 |    YUAN   |");
		System.out.println(">>>>>>> RESPONSE <<<<<<<<");
		int exchange3=sc1.nextInt();
		switch(exchange3)
		{
			case 1:
			System.out.println(pnd*94.424674+"/INR");
			break;
			case 2:
			System.out.println(pnd*1.219635+"/USD");
			break;
			case 3:
			System.out.println(pnd*1.175928	+"/EURO");
			break;
			case 4:
			System.out.println(pnd*156.463764+"/YEN");
			break;
			case 5:
			System.out.println(pnd*79.075572+"/RUBLE");
			break;
			case 6:
			System.out.println(pnd*24.747927+"/PESO");
			break;
			case 7:
			System.out.println(pnd*234.351411+"/PKR");
			break;
			case 8:
			System.out.println(pnd*8.277574+"/YUAN");
			break;
		}
	}
	void YEN()
	{
		System.out.println(">>>>>>> Enter The Value OF YEN <<<<<<<<");
		Scanner sc=new Scanner(System.in);
		int yen=sc.nextInt();
		System.out.println(">>>>>>> Choose One Of The Following Options TO convert YEN <<<<<<<<");
		Scanner sc1=new Scanner(System.in);
		System.out.println("| 1 |    INR    |");
		System.out.println("| 2 |    USD    |");
		System.out.println("| 3 |    EURO   |");
		System.out.println("| 4 |    POUND  |");
		System.out.println("| 5 |    RUBLE  |");
		System.out.println("| 6 |    PESO   |");
		System.out.println("| 7 |    PKR    |");
	    System.out.println("| 8 |    YUAN   |");
		System.out.println(">>>>>>> RESPONSE <<<<<<<<");
		int exchange4=sc1.nextInt();
		switch(exchange4)
		{
			case 1:
			System.out.println(yen*0.603650+"/INR");
			break;
			case 2:
			System.out.println(yen*0.007797+"/USD");
			break;
			case 3:
			System.out.println(yen*0.007797+"/EURO");
			break;
			case 4:
			System.out.println(yen*0.007797+"/POUND");
			break;
			case 5:
			System.out.println(yen*0.007797+"/RUBLE");
			break;
			case 6:
			System.out.println(yen*0.158288+"/PESO");
			break;
			case 7:
			System.out.println(yen*0.158288+"/PKR");
			break;
			case 8:
			System.out.println(yen*0.052921+"/YUAN");
			break;
		}
	}
}
class project
{
	public static void main(String args[])
	{
		System.out.println(">>>>>>> Choose One Of The Following Currency TO convert  <<<<<<<<");
		national obj=new national();
		System.out.println("| 1 |    INR    |");
		//CURRENCY OF USA
		System.out.println("| 2 |    USD    |");
		//CURRENCY OF AUSTRIA,BELGIUM,GREECE
		System.out.println("| 3 |    EURO   |");
		//CURRENCY OF UK
		System.out.println("| 4 |    POUND  |");
		//CURRENCY OF JAPAN
		System.out.println("| 5 |    YEN    |");
		//CURRENCY OF RUSSIA
		Scanner scan=new Scanner(System.in);
		System.out.println(">>>>>>> RESPONSE <<<<<<<<");
		int select=scan.nextInt();
		switch(select)
		{
		case 1:
		obj.INR();
		break;
		case 2:
		obj.USD();
		break;
		case 3:
		obj.EURO();
		break;
		case 4:
		obj.POUND();
		break;
		case 5:
		obj.YEN();
		break;
		}
		
		
		
		
		
	}
}