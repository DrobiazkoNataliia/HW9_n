public class MyArrayList {

    private static final int INIT_SIZE = 8;

    private int[] data;
    private int index;

    public MyArrayList() {
        data = new int[INIT_SIZE];
    }

    public void add(int value) {
       recise();
        data[index] = value;
        index++;
    }

    private void recise() {
        if (index == data.length - 1) {
            int newSize = data.length * 2;
            int[] newData = new int[newSize];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }

    public int get(int i) {
        return data[i];
    }

    public int size() {
        return index;
    }


}
