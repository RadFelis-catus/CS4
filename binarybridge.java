//binary bridge can be converted to binary string
//should minimize # of jumps resulted from binary string
//can only jump at most n times
//f either b or c is violated, heart will stop
//jump(i, j) = decimal(bridge.substring(i, j))
//101001010 --> 10100 --> 1010
//bridge        20        10   = 30, which is > n

public class BinaryBridge() {
    public void crossTheBridge(String binary) {
        //create a 2D array for every possible substring of binary
        //create a new 2D array for the base ten value for each index 
        //traverse array and reassign the lowest possible value to each index
        //if bottom left index is smaller than or equal to n, mission successful. Otherwise, mission failed.
    }

    //create a 2D array for every possible substring of binary
    public ArrayList<String> binaryArray(String binary) {

    }

    //create a 2D array for the base ten value for each index in binaryArray
    public ArrayList<String> baseTenArray(ArrayList<String> binaryArray) {

    }

    //traverse array and reassign the lowest possible value to each index
    public ArrayList<String> bridgePath(ArrayList<String> binaryArray) {

    }

    //convert binary string into base 10 value
    public int toBaseTen(String binary) {

    }

    //determine whether mission failed/succeeded
    public void isSuccessful() {

    }
}
