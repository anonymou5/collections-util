package test.collections.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

import org.junit.Test;

import collections.util.Predicate;
import collections.util.PredicateUtil;

public class PredicateUtilTest {
	@Test
	public void testFilterInto() {
		Predicate<Integer> lessThanThree = new Predicate<Integer>() {
			public boolean evaluate(Integer i) {
				return i < 3;
			}
		};
		
		Collection<Integer> all, filtered;
		all = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
		filtered = new LinkedList<Integer>();
		
		PredicateUtil.filterInto(all, lessThanThree, filtered);
		
		System.out.println(filtered);
		
		PredicateUtil.filterOut(all, PredicateUtil.notPredicate(lessThanThree));
		
		System.out.println(all);
	}
}
