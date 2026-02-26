public class leapcheck {
    public static void main(String[] args) {
        int i;
        int b=4;
        for(i=0;i<=1000;i++)
        {
            if((i%b)==0)
            {
                System.out.println(i+" is a leap year");
            }
        }
    }
    
}
