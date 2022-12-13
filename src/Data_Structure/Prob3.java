package Data_Structure;

//reverse the String...
public class Prob3{
    public static void main(String args[]){
        String str = "Aakash";
        String newstr = "";
        char ch;

        for (int i = 0;i<str.length();i++){

            ch = str.charAt(i);
            newstr = ch+newstr;
        }
        System.out.print(newstr);
    }
}

