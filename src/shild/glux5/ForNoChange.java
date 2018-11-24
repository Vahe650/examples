package glux5;
public class ForNoChange {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        for (int x : nums) {
            System.out.print(x+" ");
            x=x*10;//ays operator@ chi karox popoxel massiv@
        }
        System.out.println();
        for (int x : nums)
            System.out.print(x+" ");
            System.out.println();

    }
}
