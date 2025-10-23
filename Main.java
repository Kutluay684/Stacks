public class Main {
    public static void main(String[] args) {
        TwoStacks twoStacks = new TwoStacks(15);

        System.out.println("Is Stack1 empty? " + twoStacks.isStackOneEmpty());
        System.out.println("Is Stack2 empty? " + twoStacks.isStackTwoEmpty());
        System.out.println();

        twoStacks.pushToStackOne(10);
        twoStacks.pushToStackOne(5);
        twoStacks.pushToStackOne(6);
        twoStacks.pushToStackOne(7);

        twoStacks.pushToStackTwo(8);
        twoStacks.pushToStackTwo(6);
        twoStacks.pushToStackTwo(2);
        twoStacks.pushToStackTwo(4);
        twoStacks.pushToStackTwo(87);

        System.out.println("Top of Stack1: " + twoStacks.topStackOne());
        System.out.println("Top of Stack2: " + twoStacks.topStackTwo());
        System.out.println();

        twoStacks.popFromStackOne();
        twoStacks.popFromStackTwo();
        System.out.println("After pop - Stack1 top: " + twoStacks.topStackOne());
        System.out.println("After pop - Stack2 top: " + twoStacks.topStackTwo());
        System.out.println();

        twoStacks.pushToStackTwoFromStackOne(3);
        System.out.println("Moved 3 elements from Stack1 to Stack2.");
        System.out.println("New top of Stack1: " + twoStacks.topStackOne());
        System.out.println("New top of Stack2: " + twoStacks.topStackTwo());
        System.out.println();

        System.out.println("Are both stacks full? " + twoStacks.isTwoStacksFull());
        twoStacks.makeStackOneEmpty();
        System.out.println("Stack1 cleared. Is it empty? " + twoStacks.isStackOneEmpty());
        System.out.println("Are both stacks empty? " + twoStacks.isBothStacksEmpty());
    }
}
