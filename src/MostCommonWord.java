class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> ban = new HashMap<>();
        for(int i=0;i<banned.length;i++){
            ban.put(banned[i], 1);
        }
        String[] words = paragraph.split(" |,|!|'|;|\\?|\\.");
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(words[i].equals("")) continue;
            words[i] = words[i].toLowerCase();
            if(ban.containsKey(words[i])) continue;
            map.put(words[i], map.getOrDefault(words[i], 0)+1);
        }
        String res ="";
        int max = 0;
        for(String temp:map.keySet()){
            if(map.get(temp)>max) {
                res = temp;
                max = map.get(temp);
            }
        }
        return res;
    }
}