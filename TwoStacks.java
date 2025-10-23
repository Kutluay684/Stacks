
public class TwoStacks {
    Integer[] twoStacks;
    int top1;
    int top2;
    int capacity;

    public  TwoStacks(int capacity)
    {
        this.capacity=capacity;

        top2=capacity;
        twoStacks=new Integer[capacity];
        top1=-1;
    }

    public boolean isStackOneEmpty() {
        if (top1 == -1) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isStackTwoEmpty() {
        if (top2 == capacity) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isTwoStacksFull() {
        if (top1 + 1 == top2) {
            return true;
        } else {
            return false;
        }
    }

    public void pushToStackOne(int value) {
        if (top1 + 1 != top2) {
            top1++;
            twoStacks[top1] = value;
            System.out.println("Value added..: "+value);
        } else {
            throw new IndexOutOfBoundsException("Array Is Full or Empty");
        }
    }

    public void pushToStackTwo(int value) {
        if (top2 - 1 != top1) {
            top2--;
            twoStacks[top2] = value;
            System.out.println("Value added..: "+value);
        } else {
            throw new IndexOutOfBoundsException("Array Is Full or Empty");
        }
    }

    public void popFromStackOne() {
        if (top1 != -1) {
            twoStacks[top1] = null;
            top1--;
        } else {
            throw new IndexOutOfBoundsException("Array is empty");
        }
    }

    public void popFromStackTwo() {
        if (top2 != capacity) {
            twoStacks[top2] = null;
            top2++;
        } else {
            throw new IndexOutOfBoundsException("Array is empty");
        }
    }

    public int topStackOne() {
        if (top1 != -1) {
            return twoStacks[top1];
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public int topStackTwo() {
        if (top2 != capacity) {
            return twoStacks[top2];
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public boolean swapTops() {
        if (top1 != -1 && top2 != capacity) {
            int top1Flag = twoStacks[top1];
            twoStacks[top1] = twoStacks[top2];
            twoStacks[top2] = top1Flag;
            return true;
        } else {
            return false;
        }
    }

    public void makeStackOneEmpty() {
        if (top1 != -1) {
            for (int i = 0; i < top1; i++) {
                twoStacks[i] = null;
            }
            top1 = -1;
        } else {
            System.out.println("Already Empty");
        }
    }

    public boolean isBothStacksEmpty() {
        return (top1 == -1 && top2 == capacity);
    }

    public boolean pushToStackTwoFromStackOne(int elementCount) {
        if (top1 == -1) return false;

        for (int i = 0; i < elementCount; i++) {
            if (top1 == -1 || top1 + 1 == top2) {
                top2--;
                twoStacks[top2] = twoStacks[top1];
                top1--;

            }
        }
        return true;
    }

}
