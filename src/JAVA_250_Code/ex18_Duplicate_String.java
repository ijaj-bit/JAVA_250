package JAVA_250_Code;

public class ex18_Duplicate_String {

    public static void main(String[] args) {
        String str =new String("AUTOMATION");
        int coutn=0;
        char[] ch=str.toCharArray();//Converts the string into a character array.

        for (int i = 0; i < ch.length ; i++) {
            for (int j = i+1; j < ch.length ; j++) {
                if(ch[i]==ch[j])
                {
                    System.out.println("Duplicate character int String are :"+ch[j]);
                    coutn++;
                }
//                The outer loop goes from the start to the end of the array.
//                The inner loop checks from the next character (i+1) to the end.
//                If any two characters are equal, it prints that as a duplicate and increases the coutn.
            }

        }
        System.out.println("Count of duplicate Character are:"+coutn);
    }
}
