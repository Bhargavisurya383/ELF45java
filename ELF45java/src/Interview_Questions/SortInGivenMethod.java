package Interview_Questions;

public class SortInGivenMethod {
   public static void main(String[] args) 
   {
	 int a[]= {12,98,45,23,79,56,87};
	 for(int i=0;i<a.length;i++)
	 { 
		 int rem1=a[i]%10;
		
		 for(int j=0;j<a.length;j++)
		 {
			
			 int rem2=a[j]%10;
			 if(rem1<rem2)
			 {
				 int temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
			 }
		 }
		 
	 }
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.print(a[i]+" ");
	 }
   } 
}
