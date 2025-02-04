package com.gfg.string.medium;

//https://www.geeksforgeeks.org/longest-common-substring-dp-29/

public class LongestCommonSubstring {

	static int longestCommonSubstring(String m, String n) {
		char[] str1 = m.toCharArray();
		char[] str2 = n.toCharArray();

		int[][] dp = new int[str1.length + 1][str2.length + 1];

		int max = 0;

		// Iterate over each position in the matrix
		for (int i = 1; i <= str1.length; i++)
			for (int j = 1; j <= str2.length; j++)

				// If characters are equal
				if (str1[i - 1] == str2[j - 1]) {
					// Get the number from diagonally opposite
					// and add 1
					dp[i][j] = dp[i - 1][j - 1] + 1;

					max = Math.max(dp[i][j], max);
				}

		return max;
	}
	
	
//	Naive Iterative Method : 
//	A simple solution is to try all substrings beginning with every pair of index from s1 and s2 and keep track of the longest matching substring.
//	We run nested loops to generate all pairs of indexes and then inside this nested loop, we try all lengths.
//	We find the maximum length beginning with every pair. And finally take the max of all maximums.	
//	Time Complexity: O(m x n x min(m, n))
//	Auxiliary Space: O(1)
	
	static int maxCommStr(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int res = 0;

        // Consider every pair of index and find the length
        // of the longest common substring beginning with 
        // every pair. Finally return max of all maximums.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int curr = 0;
                while ((i + curr) < m && (j + curr) < n 
                   && s1.charAt(i + curr) == s2.charAt(j + curr)) {
                    curr++;
                }
                res = Math.max(res, curr);
            }
        }
        return res;
    }

	public static void main(String[] args) {

		String m = "zfbcdzb";
		String n = "zbcdf"; // 3

//	    String m = "abcdxyz";
//	    String n = "xyzabcd";   // 4

		System.out.println(longestCommonSubstring(m, n));

	}

}
