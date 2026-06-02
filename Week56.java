class Week56{
    
    public void main(String[] args) {
        String str="The number returned should not";
        String strs[]=str.split(" ");
        String res="";
        for(String st:strs){
            String rev=rev(st);
            res+=rev;
            res+=' ';
        }
        IO.print(res);

    }
    public String rev(String str){
        char []ch=str.toCharArray();
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        return new String(ch);
    }
}