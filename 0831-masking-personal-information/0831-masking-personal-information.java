class Solution {
    public String maskPII(String s) {
        if(s.indexOf('@') != -1){
            s = s.toLowerCase();
            int at = s.indexOf('@');
            return s.charAt(0) + "*****" + s.charAt(at-1) + s.substring(at);
        }
        StringBuilder digits = new StringBuilder();
        for (char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                digits.append(ch);
            }
        }
        int totalDigits = digits.length();
        int countryCode = totalDigits - 10;
        StringBuilder ans = new StringBuilder();
        if (countryCode > 0){
            ans.append("+");
            for(int i = 0; i < countryCode; i++){
                ans.append("*");
            }
            ans.append("-");
        }
        ans.append("***-***-");
        ans.append(digits.substring(totalDigits-4));
        return ans.toString();
    }
}