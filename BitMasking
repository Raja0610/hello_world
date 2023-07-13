public class Main
{
	public static void main(String[] args) {
		//here we will perform Bit Manipulation through bit masking
		
		//to check if the bit at certain position is 0 or 1
		//let say we need to check it in 10010 and we need to check it at 1 position also known as getbit
		
		int value=18;
		int bit_mask=1<<1;
		int result=value&bit_mask;
		if(result==0)
		{
		    System.out.println("Bit was 0");
		}
		else{
		    System.out.println("Bit was 1");
		}
		
		//now lets check it in 1001 for same position
		value=9;
		bit_mask=1<<1;
		result=value&bit_mask;
		if(result==0)
		{
		    System.out.println("Bit was 0");
		}
		else{
		    System.out.println("Bit was 1");
		}
		
		//now lets perform an operation at binary which is known as setbit
		
		value=9;
		bit_mask=1<<2;
		result=value|bit_mask; //it will add 4 in the value
		System.out.println(result);
		
		//now lets perform an operation at binary which is known as clear bit
		value=5;
		bit_mask=1<<2;
		bit_mask=~bit_mask;
		result=value&bit_mask;//it will make the result 0 at bit position 2
		System.out.println(result);//answer will be 1
	}
}
