class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0) 
        return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            String key=stget(str);
            if(map.containsKey(key)){
                map.get(key).add(str);
            }else{
                List<String> l=new ArrayList<>();
                l.add(str);
                map.put(key,l);
            }
        }
        return new ArrayList<> (map.values());
        
    }
    private String stget(String str){
        int freq[]= new int[26];
        for(char ch :str.toCharArray()){
            freq[ch-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<26;j++){
            sb.append('#');
            sb.append(freq[j]);
        }
        return sb.toString();
    }
}
