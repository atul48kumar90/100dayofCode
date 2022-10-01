class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> hmap = new HashMap<>();
        String[] words = paragraph.replaceAll("[!?',;.]", " ").toLowerCase().split("\\s+");
        
        for(int i=0; i<words.length; i++)
        {
            if(hmap.containsKey(words[i]))
            {
                //hmap.replace(words[i], hmap.get(words[i]), hmap.get(words[i])+1);
                hmap.put(words[i], hmap.get(words[i])+1);
            }
            else
            {
                hmap.put(words[i],1);
            }
        }
        for(int i=0; i<banned.length;i++)
        {
            if(hmap.containsKey(banned[i]))
            {
                hmap.remove(banned[i]);
            }
        }
        return Collections.max(hmap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}