
public class Numbers_4 {
    public static void main(String[] args){
        int count = 0;
        for(long n = 1; n <= 1000; n++){
            String sqr = Long.toString(n * n);
            for(int j = 0; j < sqr.length() / 2 + 1; j++){
                String[] parts = split(sqr, j);
                long left = Long.parseLong(parts[0]);
                long right = Long.parseLong(parts[1]);
                if(left + right == n){
                    count++;
                    System.out.println(
                            Long.toString(n) +
                            "\t" + sqr + "\t  " + parts[0] + " + " + parts[1]
                    );
                }
            }
        }
        System.out.println(count + " Kaprekar numbers.");
    }
    private static String[] split(String str, int index){
        String[] stringSplit = new String[2];
        stringSplit[0] = str.substring(0, index);
        if(stringSplit[0].equals("")) stringSplit[0] = "0";
        stringSplit[1] = str.substring(index);
        return stringSplit;
    }
}
