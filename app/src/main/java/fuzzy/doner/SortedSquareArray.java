package fuzzy.doner;

public class SortedSquareArray {
    public static int[] square(int[] inputSequence) {
        int smallerIdx = 0;
        int largerIdx = inputSequence.length - 1;
        int[] outputSequence = new int[inputSequence.length];
        for (int i = inputSequence.length - 1; i >= 0; i--) {
            int smallerValue = inputSequence[smallerIdx];
            int largerValue = inputSequence[largerIdx];
            if (Math.abs(smallerValue) > Math.abs(largerValue)) {
                outputSequence[i] = smallerValue*smallerValue;
                smallerIdx++;
            } else {
                outputSequence[i] = largerValue*largerValue;
                largerIdx--;
            }
        }
        return outputSequence;
    }
}
