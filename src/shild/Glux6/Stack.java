package shild.Glux6;

class Stack {

        private int array[] = new int[10];
        private int size;

        public Stack() {
            size = -1;
        }

        public void push(int value) {
            if (size == 9) {
                System.out.println("stack@ verjacav");
            } else
                array[++size] = value;
        }

        public int pop() {
            if (size < 0) {
                System.out.println("stack@ datark e");
                return 0;
            } else {
                return array[size--];
            }
        }



}
