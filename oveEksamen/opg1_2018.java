class opg1_2018{
    public static void main(String[] args){

    } 

}

class Stringhjelper{
    static int inneholder(String s, String t){
        
        int sl = s.length(), tl = t.length();

        for(int i = 0; i <= sl-tl; i++){
            boolean eq = true;

            for(int j = 0; j<tl; j++){
                if(s.charAt(i+tl) != t.charAt(j)){
                    eq = false; 
                    break;
                } 
            }
            if(eq) return i;
        }

        return -1; 
    }
}
