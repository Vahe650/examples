package shild.list;

public class AdverBase {
    Advertisement1 dataBase[] = new Advertisement1[15];
    int size = 0;

    public void addAdver(Advertisement1 singleAdver) {
        if (size == dataBase.length) {
            extend();
        }
        dataBase[size] = singleAdver;
        size++;
    }

    private void extend() {
        Advertisement1[] tmp = new Advertisement1[dataBase.length + 10];
        for (int i = 0; i < dataBase.length; i++) {
            tmp[i] = dataBase[i];
        }
        dataBase = tmp;
    }

    public void printAdvers() {
        for (int i = 0; i < size; i++) {
            System.out.println(dataBase[i].toString());

        }
    }

    public void printMyAdvers(User user) {
        for (int i = 0; i < size; i++) {
            if (dataBase[i].getUser().equals(user)) {
                System.out.println(dataBase[i].toString());
            }
        }
    }

    public void printByType(String type) {
        for (int i = 0; i < size; i++) {
            if (dataBase[i].getType().equals(type)) {
                System.out.println(dataBase[i].toString());
            }


        }

    }


}
//   հա դե ոչինչ:D կրնաս գրես ընբեմ օր յուզեռի պառոլը փոխես, բայց օր նույնը գրես ջոկե օր նույնն է չթողա?