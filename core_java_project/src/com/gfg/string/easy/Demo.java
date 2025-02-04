package com.gfg.string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {

		String m = "zfbcdzb";
		String n = "zbcdf"; // 3

		int max = 0;

		char[] str1 = m.toCharArray();
		char[] str2 = n.toCharArray();

		int[][] dp = new int[str1.length + 1][str2.length + 1];

		for (int i = 1; i <= str1.length; i++) {
			for (int j = 1; j <= str2.length; j++) {

				if (str1[i - 1] == str2[j - 1]) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
					
					System.out.println(dp[i][j]);

					max = Math.max(dp[i][j], max);
				}

			}
		}

		System.out.println(max);

	}
}
