package Interview_Questions;

public class ArmsStrongRange {
	public static void main(String[] args) {
		for(int num=100;num<=1000;num++)
		{
			int temp=num;
			int count=0;
			while(temp!=0)
			{
				count++;
				temp/=10;
			}
			int temp1=num;
			int arm=0;
			while(temp1!=0)
			{
				int rem=temp1%10;
				int pow=1;
				for(int i=1;i<=count;i++)
				{
				pow=pow*rem;
				}
				arm=arm+pow;
				temp1=temp1/10;
			}
			if(arm==num)
			{
				System.out.println(num);
			}
			
			
		}
	}

}
