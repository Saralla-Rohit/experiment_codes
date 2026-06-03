import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Week56{
    public boolean isIso(String s1,String s2){
        int n=s1.length();
        if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character,Character>map=new HashMap<>();
        Set<Character>used=new HashSet<>();
        for(int i=0;i<n;i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            // If ch1 already has a mapping
            if(map.containsKey(ch1)){
                // Mapping must remain consistent
                // Example:
                // p -> t initially
                // later p -> l is invalid
                if(map.get(ch1)!=ch2){
                    return false;
                }
            }else{
                // ch1 is appearing for the first time
                // If ch2 is already mapped by another character,
                // then two characters are mapping to the same target
                // Example:
                // a -> x
                // b -> x  (invalid)
                if(used.contains(ch2)) {
                    return false;
                }

                // Store the new mapping
                map.put(ch1,ch2);

                // Mark target character as used
                used.add(ch2);
            }
        }
        return true;
    }
    public void main(String[] args) {
        String s1="paper";
        String s2="title";
        boolean res=isIso(s1, s2);
        if(res){
            IO.print("valid");
        }else IO.print("not valid");
        
    }
}