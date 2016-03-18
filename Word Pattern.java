public class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<Character, String>();
        String[] str1 = str.split(" ");
        if(pattern.length() != str1.length) {
            return false;
        }
        for(int i=0; i<pattern.length(); i++) {
            if(!map.containsKey(pattern.charAt(i))) {
                if(map.containsValue(str1[i])) {
                    return false;
                }
                map.put(pattern.charAt(i), str1[i]);
            }
            else {
                if(!str1[i].equals(map.get(pattern.charAt(i)))) {
                    return false;
                }
            }
        }
        return true;
    }
}