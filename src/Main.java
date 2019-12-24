public class Main {
    public static String replaceSpace(StringBuffer str) {
        StringBuffer s=new StringBuffer("");
        char[]a={'0','2','%'};
        for(int i=0;i<str.length();i++){
            int j=0;
            if(str.charAt(i)!=' ') {
                s.insert(j,str.charAt(i));
                j++;
            }
            else{
                s.insert(j,a);
                j+=2;
            }
        }
        s.reverse();
        String ss=s.substring(0);

        return ss;
    }

    public static void main(String[] args) {
        StringBuffer a=new StringBuffer("we are happy");
        String b=replaceSpace(a);
        System.out.println(b);
    }
}
