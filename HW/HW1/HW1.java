class Solution {
    
    public static boolean isPalindrome(String s) {
        
        //no isAlpha in java... gonna do it like this
        String day = s.replaceAll("\\p{P}", "");  //gets rid of puncutation
        day = day.replaceAll("0-9", ""); //gets rid of 0-9
        day = day.replaceAll("\\s+",""); //gets rid of spaces?

        String oppositeday = "";        //again start with empty string

        for (int i = day.length() - 1 ; i >= 0 ; i--) { //go backwards starting from end of string
            oppositeday += day.charAt(i);               //add current chara to oppositeday
        }
        //System.out.println(day);
        //System.out.println(oppositeday);
        if (oppositeday.equalsIgnoreCase(day)) {        //can ignore case with this B)
            return true;                                //if oppday = day, return true
        }
        else {
            return false;                               //else, return false
        }
    }
    
    public static void main(String[] args) {
        //tests
        String test1 = "Xx_TaCoCAT_xX";
        System.out.println(isPalindrome(test1));
        
        String test2 = "tacocat";
        System.out.println(isPalindrome(test2));
        
        String test3 = "burritocat";
        System.out.println(isPalindrome(test3));
    }
}
