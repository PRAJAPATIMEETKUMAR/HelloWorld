public class StringPractice {

    public static void SortedString(String str, int index, int count, String newStr){
        if(str.length() == index){
            for(int i=count; i>0; i--){
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }

        char currentChar = str.charAt(index);
        if(currentChar == 'x'){
            count += 1;
        }else{
            newStr += currentChar;
        }
        SortedString(str, index+1, count, newStr);
    }

    public static void main(String[] args) {
        SortedString("axbcxxd", 0, 0, "");
    }
}
