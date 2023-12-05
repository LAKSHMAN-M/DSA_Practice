package com.arrays.problems;
//	https://leetcode.com/problems/count-items-matching-a-rule/solutions/1093390/java-easy-and-short-100-memory/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CountItemsMatchingRule {
	public static void main(String[] args) {
		List<List<String>> list1 = new ArrayList<>();
		
		List<String> a= Arrays.asList("phone","blue","pixel");
		List<String> b= Arrays.asList("computer","silver","lenovo");
		List<String> c= Arrays.asList("phone","gold","iphone");
		list1.add(a);
		list1.add(b);
		list1.add(c);
		System.out.println(countMatches2(list1, "name", "iphone"));
	}
	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int count = 0;
		Iterator<List<String>> list = items.iterator();
		while (list.hasNext()) {
			switch (ruleKey) {
			case "type":
				if (list.next().get(0).equals(ruleValue)) {
					count++;
				}
				break;
			case "color":
				if (list.next().get(1).equals(ruleValue)) {
					count++;
				}
				break;
			case "name":
				if (list.next().get(2).equals(ruleValue)) {
					count++;
				}
				break;
			default:
				System.exit(1);;
			}
		}
		return count;
	}
	public static int countMatches2(List<List<String>> items, String ruleKey, String ruleValue) {
		int res = 0;
		for (int i = 0; i < items.size(); i++) {
			if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) res++;
			if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) res++;
			if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) res++;
		}
		return res;
	}
}

//Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
//Output: 1
//Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].