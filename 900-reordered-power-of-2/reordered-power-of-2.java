class Solution {
    public boolean reorderedPowerOf2(int n) {
        String nFreq = frequency(n);
        System.out.println(nFreq);
        for (int i = 0; i < 31; i++) {
            String iFreq = frequency((int) Math.pow(2, i));
            if (iFreq.equals(nFreq))
                return true;
        }
        return false;
    }

    public String frequency(int n) {
        int[] count = new int[10];
        int temp = n;
        while (temp > 0) {
            int r = temp % 10;
            count[r]++;
            temp = temp / 10;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            sb.append(count[i]).append(",");
        }
        return sb.toString();
    }
}