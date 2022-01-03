public class Assignment1{
    public static void main(String[] args){
        int a = 30;
        int b = 50;
        int c = 20;

        int res=(a>b)&&(a>c)?a:(b>c)?b:c;

        System.out.print(res);
        
    }
}