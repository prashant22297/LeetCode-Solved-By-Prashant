class Solution {
    public String arrangeWords(String text) {
        String[] ans= text.toLowerCase().split(" ");
        Arrays.sort(ans,(a,b) ->  a.length() - b.length());
        String result = String.join(" ", ans);
        return Character.toUpperCase(result.charAt(0)) + result.substring(1);
    }
}