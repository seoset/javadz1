package SuShu1000;

 public class SuShu1000 {
	
  public static void main(String arg[]) {	
		int i;
		int j;
		int sum=0;
   for(i=2;i<=1000;i++)
   {
	    for(j=2;j<i;j++)
	  {
		if(i%j==0)
			break;
      }
		if( j == i)
		{ 
		System.out.println(i);
		sum++;
		}
	}
		System.out.println("Всего"+sum+"Простое число");
 }	
}
