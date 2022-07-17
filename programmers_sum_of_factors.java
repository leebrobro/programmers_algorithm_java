class programmers_sum_of_factors {
    public static void main(String[] args) {

        int n = 0;
        int answer = 0;
        int present = n;
        int i = 2;
        while (i != (n + 1)) {

            if (present % i == 0) {
                answer += i;
            }
            i++;
        }
        System.out.println(answer + 1);
    }
}