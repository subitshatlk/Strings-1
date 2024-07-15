//T.c --> O(m+n)
//S.c --> O(n)

class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0; i<s.length(); i++){
          map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);  
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<order.length(); i++){
            if(map.containsKey(order.charAt(i))){
               int times = map.get(order.charAt(i));
               map.remove(order.charAt(i));
                for(int j =0; j<times; j++){
                    sb.append(order.charAt(i));                    
                }
            }
        }        
        for(char c: map.keySet()){
            int times = map.get(c);
            for(int i =0; i<times; i++){
                sb.append(c); 
            }
        }
        return sb.toString();
    }
} 