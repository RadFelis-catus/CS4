import java.util.*;
//binary bridge can be converted to binary string
//should minimize # of jumps resulted from binary string
//can only jump at most n times
//f either b or c is violated, heart will stop
//jump(i, j) = decimal(bridge.substring(i, j))
//101001010 --> 10100 --> 1010
//bridge        20        10   = 30, which is > n

public class BinaryBridge() {
    public static void main(String[] args) {
        String test1 = "1010";
        int baseTen1 = toBaseTen(test1);
    }

    public void crossTheBridge(String binary, int maxJumps) {
        //create a 2D array for every possible substring of binary
        String[][] binaryArr = binaryArray(binary);
        //create a new 2D array for the base ten value for each index
        int[][] baseTenArr = baseTenArray(binaryArr); 
        //traverse array and reassign the lowest possible value to each index
        baseTenArr = bridgePath(baseTenArr);
        //if bottom left index is smaller than or equal to n, mission successful. Otherwise, mission failed.
    }

    //create a 2D array for every possible substring of binary
    public String[][] binaryArray(String binary) {
        String[][] binaryArr = new String[binary.length()][binary.length() - 1];

        for (int i = 0; i < binary.length(); i++) {
            for (int j = 1; j > binary.length() + 1; j++) {
                if (j > binary.length()) {
                    binaryArr[i][j] = "-1";
                }else {
                    binaryArr[i][j] = binary.substring(i, j);
                }
            }
        }

        return binaryArr;
    }

    //create a 2D array for the base ten value for each index in binaryArray
    public int[][] baseTenArray(String[][] binaryArray) {
        int[][] baseTenArr = new int[binaryArray.length][binaryArray[0].length];

        for (int i = 0; i < baseTenArr.length; i++) {
            for (int j = 0; j < baseTenArr[0].length; j++) {
                if (j > binaryArray[0].length) {
                    baseTenArr[i][j] = -1;
                }else {
                    baseTenArr[i][j] = toBaseTen(binaryArray[i][j]);
                }
            }
        }

        return baseTenArr;
    }

    //traverse array and reassign the lowest possible value to each index
    public int[][] bridgePath(int[][] baseTenArray) {
        int[][]bridge = new int[baseTenArray.length][baseTenArray[0].length];
        
        int i = 0;
        int j = 0;
        while () {
            
        }
    }

    //convert binary string into base 10 value
    public int toBaseTen(String binary) {
        int baseTen = 0;
        int power = 0;
        
        for (int i = binary.length() - 1; i > -1; i--) {
            if (binary.substring(i, i + 1).equals("1")) {
                baseTen += Math.pow(2, power);
            }
            power++;
        }
        return baseTen;
    }

    //determine whether mission failed/succeeded
    public void isSuccessful(int maxJumps, int numJumps) {
        if (numJumps > maxJumps) {
            System.out.println("MISSION FAILED");
        }else {
            System.out.println("INFILTRATION SUCCESSFUL");
        }
    }
}
