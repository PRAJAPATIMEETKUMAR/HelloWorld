public class DupicateRemove {
    public static boolean[] map = new boolean[26];

    public static void DuplicateRemove(String str, int index, String newStr){
        if(str.length() == index){
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(index);
        if(map[currentChar - 'a']){
            DuplicateRemove(str, index+1, newStr);
        }else {
            newStr += currentChar;
            map[currentChar - 'a'] = true;
            DuplicateRemove(str, index+1, newStr);
        }
    }
    public static void main(String[] args) {
        DuplicateRemove("abmcbmkmkmkmkkmkkkkmcadda", 0, "");
    }
}
