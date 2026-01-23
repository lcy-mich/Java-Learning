public class q1_7 {
    public String toBase(int n, int b){
        final String alphanum = "0123456789abcdefghijklmnopqrstuvwxyz";
        assert b <= alphanum.length();

        String result = "";
        int digit;

        int greatestbaseexp = 0, last = 0;
        while (last < n) {
            last = (int)Math.pow(b, ++greatestbaseexp); 
        }
        greatestbaseexp--;
         
        while (greatestbaseexp >= 0){
            digit = n/(int)Math.pow(b, greatestbaseexp);
            n -= digit * (int)Math.pow(b, greatestbaseexp--);
            result = result + alphanum.charAt(digit);
        }
        return result;
    }

    public static void main(String[] args) {
        q1_7 methods = new q1_7();
        System.out.println(methods.toBase(3,2));
    }
}
