
class Numbers_21 {
    public static void main(String[] args) {

        int n = 100000;
        for (int a = 1; a <= n; a++) {
            int a3 = (int)Math.pow(a,3);
            if (a3 > n) break;

            for (int b = a; b <= n; b++) {
                int b3 = b*b*b;
                if (a3 + b3 > n) break;

                for (int c = a + 1; c <= n; c++) {
                    int c3 = (int)Math.pow(c,3);
                    if (c3 > a3 + b3) break;

                    for (int d = c; d <= n; d++) {
                        int d3 = (int)Math.pow(d,3);
                        if (c3 + d3 > a3 + b3) {
                            break;
                        }
                        if (c3 + d3 == a3 + b3) {
                            System.out.print((a3+b3) + " = ");
                            System.out.print(a + "^3 + " + b + "^3 = ");
                            System.out.println(c + "^3 + " + d + "^3");
                        }
                    }
                }
            }
        }
    }
}
