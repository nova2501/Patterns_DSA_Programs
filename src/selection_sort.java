public class selection_sort {

    public static int[] sorted_array(int a[]){
        int i,j,small;

        for(i=0;i<a.length;i++)
        {
            small=i;

            for(j=i+1;j<a.length;j++){
                if(a[j]<a[small])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }



    public static void main(String[] args) {
        int a[]={3,6,10,2,1,14,8};
        int res[]=sorted_array(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(res[i]);
        }
    }
}
