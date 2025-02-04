package com.gfg.array.level1;

public class SingleNumber {

	public static void main(String[] args) {

//		int[] arr = { 2, 2, 1 }; // 1
		int[] arr = { 4, 1, 2, 1, 2 }; // 4

		System.out.println(singleNumber(arr));

	}

//    Commutative : A ⊕ B = B ⊕ A. This is clear from the definition of XOR: it doesn't matter which way round you order the two inputs.
//    Associative : A ⊕ ( B ⊕ C ) = ( A ⊕ B ) ⊕ C. ...
//    Identity element : A ⊕ 0 = A. ...
//    Self-inverse : A ⊕ A = 0.

	public static int singleNumber(int[] nums) {
		int res = 0;

		for (int i = 0; i < nums.length; i++) {
			res = res ^ nums[i];
		}

		return res;
	}

}
