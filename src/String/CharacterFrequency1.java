package String;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String str = "Hello";
        Map<Character, Integer> map = new HashMap<>();
        char[] ch1 = str.toCharArray();

        for (char c : ch1) {
            if (map.containsKey(c)) {
                // If character already exists, increase the count
                map.put(c, map.get(c) + 1);
            } else {
                // If character is new, start with count 1
                map.put(c, 1);
            }
        }

        System.out.println(map);
    }
}
/*Inside the loop — the if condition
if (map.containsKey(c))


This checks whether the character c already exists as a key in the map.

In other words,

“Have we seen this character before?”

3️⃣ If the character already exists
map.put(c, map.get(c) + 1);


map.get(c) → fetches the current count of that character.

+1 → increases the count by one.

map.put(c, ...) → updates the value in the map.

Example:
If map currently has {H=1, e=1, l=1}, and next c is 'l',
then:

map.put('l', map.get('l') + 1);


→ map.get('l') = 1
→ new value = 1 + 1 = 2
✅ map becomes {H=1, e=1, l=2}*/
