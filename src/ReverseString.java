public class ReverseString {
    public static void main(String[] args) {
        Reverse(3, "abcd");
    }
    private static void Reverse(int index, String string) {
        if(index==0){
            System.out.print(string.charAt(index));
            return;
        }
        System.out.print(string.charAt(index));
        Reverse(index - 1, string);
    }
}
