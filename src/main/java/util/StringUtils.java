package util;

import java.util.HashMap;
import java.util.Map;

public class StringUtils {
    /**
     * The method returns the longest word and the length
     * Assumption:the sentence contains only one longset word
     * Note:As per the requriemnt this method returns a map containing both the length and the word.
     * However, we could also return only the longest the word and evaluate the length from there itself.
     * @param str
     * @return
     */
    public Map<Integer, String> longestWord(String str){
        if(str==null || str.length()==0){
            return null;
        }

        String [] splt=str.split(" ");
        String rs=splt[0];//the
        for(int i=1; i<splt.length;i++){
            if(rs.length()<splt[i].length()) {
                rs = splt[i];//jumped
            }
        }

        Map<Integer, String>map=new HashMap<>();
        map.put(rs.length(),rs);
        return map;
    }


}
