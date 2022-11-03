package Assignment_10_30;

public class Int_a14_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a14 = {999,888,777,666,555,444,333,222,111};
		for (int i = 0; i < a14.length; i++) {
			System.out.print(a14[i] + " ");
		}

	}

}/* the reason behind using 0 as a first indexing number instead of 1 is that the program (java..c ..c++..etc)
 in computer world uses an address to locate the element, in other word the index  just tell the program
where to go and how much distance to travel  to locate the element address. and because of that the program
needs to have a starting point and of course this starting point will be at the starting of first memory 
space where the first element reside...so before moving we are at 0 point which is the starting point where
 the first element is . 0 is used as an offset.. */
