class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(words.length!=pattern.length())
        {
            return false;
        }
        Map<Character,Integer>charToIndex=new HashMap<>();
        Map<String,Integer>stringToIndex=new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {
            if(!Objects.equals(charToIndex.put(pattern.charAt(i),i),stringToIndex.put(words[i],i)))
            {
                return false;
            }
        }
        return true;
    }
}
