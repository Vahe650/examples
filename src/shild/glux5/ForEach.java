package glux5;

public class ForEach {
    public static void main(String[] args) {
        int nums []={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        //ogtagorcel forEach gumarelu ev tpelu hamar
        for (int x : nums) {
            System.out.println("hvasar e "+x);
            sum+=x;

        }
        System.out.println("sum = "+sum);
    }
}
