package shild.Glux6;
//ays klassum voroshvum e amboxjakan stack@
//vorum kareli e pahel minchev 10 amboxjakan nisher
public class ClassStack {
        int stck[] = new int[10];
        int tos;
        //inicializacnel stacki verevi mas@
        ClassStack() {
            tos = -1;
        }
        //texavorel Stackum element

   public void push(int item) {
        if (tos == 9)
            System.out.println("Stack-@ lcvac e");
        else
            stck[++tos] = item;


    }


    //hanel stackic element
    int pop() {
        if (tos < 0) {
            System.out.println("Stack lcvac che");
            return 0;
        } else
            return stck[tos--];
    }


}