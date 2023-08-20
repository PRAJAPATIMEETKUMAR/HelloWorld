public class OccuranceFirstAndLast {

    public static int first = -1;
    public static int last = -1;

    public static void Occur(String str, int index, char element){
        if(index == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentElement = str.charAt(index);
        if (currentElement == element){
            if(first == -1){
                first=index;
            }else {
                last = index;
            }
        }

        Occur(str, index+1, element);
    }

    public static void main(String[] args) {
        Occur("abhaacdaefaah", 0, 'h');

    }
}
