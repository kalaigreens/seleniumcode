package javaconcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repetitivewords {

	public static void main(String[] args) {

		String sp = "the Duck sitting over the Duck for the Duck in the Duck House";

		Map<String, Integer> m = new HashMap<String, Integer>();

		String[] allwords = sp.split(" ");
		for (String word : allwords) {
			if (m.containsKey(word)) {
				Integer value = m.get(word);
				m.put(word, value + 1);
			} else {
				m.put(word, 1);
			}

		}
		System.out.println(m);

		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry);
			}
		}

	}
}