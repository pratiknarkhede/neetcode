package coreskills;


/**
 * implement arraylist of int in java
 */
class DynamicArray {
    int length = 0, capacity = 0;
    int[] array;


    public DynamicArray(int capacity) {
        length = 0;
        this.capacity = capacity;
        this.array = new int[this.capacity];

    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if (capacity == length) {
            resize();
        }
        array[length] = n;
        length++;
    }

    public int popback() {
        if (length > 0) {
            length--;
        }
        return array[length];
    }

    private void resize() {
        capacity=capacity*2;
        int[] tempArray=new int[capacity];
        for (int i = 0; i < length; i++) {
            tempArray[i] = array[i];
        }
        array=tempArray;
    }





    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;

    }
}
