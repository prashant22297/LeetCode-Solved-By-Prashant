class Solution {
    public boolean asteroidsDestroyed(int m, int[] asteroids) {
        Arrays.sort(asteroids);
        long mass=m;
        for(int i : asteroids){
            if(i>mass){
                return false;
            }
            mass+=i;
        }
        return true;
    }
}