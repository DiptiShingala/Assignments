public class ReverseString2 {
    public static void main(String[] args){

       String string = "I am Dipti Shingala ";
       String rvrstring = "";
       for(int i=0;i<string.length();i++)
       {
           rvrstring = string.charAt(i)+rvrstring;

       }
       System.out.println("Reverse string is:  " +rvrstring);
    }
}
