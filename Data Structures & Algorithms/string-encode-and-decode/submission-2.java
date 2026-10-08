class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String str:strs)
        {
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        String encoded_string=sb.toString();
        return encoded_string;
    }

    public List<String> decode(String str) {
        List<String> decoded_strs=new ArrayList<>();
        int i=0;
        while(i<str.length())
        {
            int j=i;
            while(str.charAt(j)!='#')
                j++;
            int len=Integer.parseInt(str.substring(i,j));
            j++;
            String word=str.substring(j,j+len);
            decoded_strs.add(word);
            i=j+len;
        }
        return decoded_strs;
    }
}
