class AddTwoString {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int len1 = num1.length(), len2 = num2.length();
        int index = 0, add = 0;
        while(index<len1 && index<len2){
            int temp1 = num1.charAt(len1-index-1)-'0';
            int temp2 = num2.charAt(len2-index-1)-'0';
            sb.append((temp1+temp2+add)%10);
            add = (temp1+temp2+add)/10;
            index++;
        }
        while(index<len1){
            int temp = num1.charAt(len1-index-1)-'0';
            sb.append((temp+add)%10);
            add = (temp+add)/10;
            index++;
        }
        while(index<len2){
            int temp = num2.charAt(len2-index-1)-'0';
            sb.append((temp+add)%10);
            add = (temp+add)/10;
            index++;
        }
        if(add!=0) sb.append(add);
        return sb.reverse().toString();
    }
}