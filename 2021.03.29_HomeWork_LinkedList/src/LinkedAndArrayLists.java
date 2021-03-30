import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedAndArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> listIntArray = new ArrayList<>();
        ArrayList<Integer> listIntArrayForRemove;
        LinkedList<Integer> listIntLinked = new LinkedList<>();
        LinkedList<Integer> listIntLinkedForRemove;

        long timeStamp;
        int maxIterations = 100000;
        int size = 200000;
        int indexMiddle = size / 2;

        Integer[] intArray = generateArray(size);
        listIntArray.addAll(Arrays.asList(intArray));
        listIntLinked.addAll(Arrays.asList(intArray));


        System.out.println("Beginning of the collection: ");
        timeStamp = System.currentTimeMillis();
        addElementList(listIntArray, 0, maxIterations);
        System.out.println("Time for add to the beginning ArrayList " +
                (System.currentTimeMillis() - timeStamp));
        timeStamp = System.currentTimeMillis();
        addElementList(listIntLinked, 0, maxIterations);
        System.out.println("Time for add to the beginning  LinkedList " +
                (System.currentTimeMillis() - timeStamp));

        timeStamp = System.currentTimeMillis();
        removeElementListBegin(listIntArray, 0, maxIterations);
        System.out.println("Time for remove from the beginning ArrayList " +
                (System.currentTimeMillis() - timeStamp));
        timeStamp = System.currentTimeMillis();
        removeElementListBegin(listIntLinked, 0, maxIterations);
        System.out.println("Time for remove from the beginning  LinkedList " +
                (System.currentTimeMillis() - timeStamp));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");


        System.out.println("Middle of the collection: ");
        timeStamp = System.currentTimeMillis();
        addElementList(listIntArray, indexMiddle, maxIterations);
        System.out.println("Time for add to the middle ArrayList " +
                (System.currentTimeMillis() - timeStamp));
        timeStamp = System.currentTimeMillis();
        addElementList(listIntLinked, indexMiddle, maxIterations);
        System.out.println("Time for add to the middle  LinkedList " +
                (System.currentTimeMillis() - timeStamp));

        timeStamp = System.currentTimeMillis();
        removeElementListMiddleUndEnd(listIntArray, indexMiddle, maxIterations);
        System.out.println("Time for remove from the middle ArrayList " +
                (System.currentTimeMillis() - timeStamp));
        timeStamp = System.currentTimeMillis();
        removeElementListMiddleUndEnd(listIntLinked, indexMiddle, maxIterations);
        System.out.println("Time for remove from the middle  LinkedList " +
                (System.currentTimeMillis() - timeStamp));
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");


        System.out.println("End of the collection: ");

        timeStamp = System.currentTimeMillis();
        addElementListToTheEnd(listIntArray, size - 1, maxIterations);
        System.out.println("Time for add to the end ArrayList " +
                (System.currentTimeMillis() - timeStamp));
        timeStamp = System.currentTimeMillis();
        addElementListToTheEnd(listIntLinked, size - 1, maxIterations);
        System.out.println("Time for add to the end  LinkedList " +
                (System.currentTimeMillis() - timeStamp));


        timeStamp = System.currentTimeMillis();
        removeElementListMiddleUndEnd(listIntArray, size - 1, maxIterations);
        System.out.println("Time for remove from the end ArrayList " +
                (System.currentTimeMillis() - timeStamp));
        timeStamp = System.currentTimeMillis();
        removeElementListMiddleUndEnd(listIntLinked, size - 1, maxIterations);
        System.out.println("Time for remove from the end  LinkedList " +
                (System.currentTimeMillis() - timeStamp));
    }


    private static void addElementList(List input, int index, int maxIterations) {
        while (maxIterations > 0) {
            input.add(index, (int) (Math.random() * 100));
            maxIterations--;
        }
    }

    private static void addElementListToTheEnd(List input, int index, int maxIterations) {
        while (maxIterations > 0) {
            input.add(index, (int) (Math.random() * 100));
            maxIterations--;
            index++;
        }
    }


    private static void removeElementListBegin(List input, int index, int maxIterations) {
        while (maxIterations > 0) {
            input.remove(index);
            maxIterations--;
        }
    }


    private static void removeElementListMiddleUndEnd(List input, int index, int maxIterations) {
        while (maxIterations > 0) {
            input.remove(index);
            maxIterations--;
            index--;
        }
    }


    private static Integer[] generateArray(int size) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);

        }
        return array;
    }


}






