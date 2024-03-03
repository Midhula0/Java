//print an element in the even position

class EvenPosition {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        for(int i=0;i<a.length;i++)
        {
            if(i==0)
            {
                System.out.println(a[0]);
            }
            else if(i%2==0)
            {
                System.out.println(a[i]);
            }
        }
    }
}