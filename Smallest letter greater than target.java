class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char element:letters){
            if(element>target){
                return element;

            }
        
        }
        return letters[0];
    }
}
