package com.lc.pattern.behaviour.iterator;

/**
 * 主类
 * @author LittleCharacter
 */
public class IteratorDemo {
	public static void main(String[] args) {
//		List<Domain> list = new ArrayList<Domain>();
		List<Domain> linkedList = new LinkedList<Domain>();
		
		for (int i = 0; i < 15; i++) {
			Domain d = new Domain(i, "name" + i);
			linkedList.add(d);
		}

		System.out.println(linkedList.size());
		
//		for (int i = 0; i < linkedList.size(); i++) {
//			System.out.println(linkedList.get(i));
//		}
		
		Iterator<Domain> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
