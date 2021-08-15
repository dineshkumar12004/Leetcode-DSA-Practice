import java.util.Arrays;

class SearchInStrings {
    public static void main(String[] args) {
        String name = "Anna jung";
        char target = 'd';
        boolean ans = search(name,target);
        System.out.println(ans);

        System.out.println(Arrays.toString(name.toCharArray()));
        
        
    }

    static boolean search(String s, char t) {
        if(s.length() == 0) {
            return false;
        }
        // for(int i = 0; i<s.length(); i++) {
        //     if(s.charAt(i) == t) {
        //         return true;
        //     }
        // }
        for(char ch : s.toCharArray()){
            if(ch == t) {
                return true;
            }
        }
        return false;
        
    }
}