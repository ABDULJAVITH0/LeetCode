class Solution {
    public int maxFreqSum(String s) {
    HashMap<Character,Integer> map=new HashMap<>();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
    }
    int vow=0,cons=0;
    for(char ch:map.keySet()){
        if("aeiou".indexOf(ch)>=0)
            vow=Math.max(vow,map.get(ch));
        else
            cons=Math.max(cons,map.get(ch));    
    }
        return vow+cons;
    }
}