class Solution {
    public void reverseString(char[] s) {
        int leftIndex = 0;
        int rightIndex = s.length -1;
        while (leftIndex <= rightIndex) {
            char leftElement =  s[leftIndex];
            char rightElement =  s[rightIndex];
            s[leftIndex] = rightElement;
            s[rightIndex] = leftElement;
            leftIndex++;
            rightIndex--;
        }
    }
}