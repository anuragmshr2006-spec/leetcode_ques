class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
           ArrayList<String> ans = new ArrayList<>();
           int n = words.size();

           for(int i = 0 ; i < n ; i++ ){
            String word = words.get(i);
            String temp = "";
            for( int j = 0;j < word.length();j++){

            
            if ( word.charAt(j) != separator  ){
              temp = temp + word.charAt(j);
            }
            else {
                if ( temp.length() > 0 ){
                    ans.add(temp);
                    temp = "";
                }
            }
           }
           if( temp.length() > 0 ){  //this line to add last word
            ans.add(temp);
           }
           }
           return ans;
    }
}