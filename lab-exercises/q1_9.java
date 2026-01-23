public class q1_9 {
    public boolean isPalindrome(long value) {
        if (value < 10) return true;



        int biggestexp = 0, num = 0;
        while (value < num) {
            num = (int)Math.pow(10, biggestexp++);
        }
        
        return false;
    }
}
