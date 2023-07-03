public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3; // no. of disks

        towerOfHanoi(n, "S","H","D");

    }
    public static void towerOfHanoi(int n, String source, String helper, String destination){
        //base case
        if (n == 1){
            System.out.println("Transferring disk "+ n +" from " +source+ " to "+ destination);
            return;
        }

        //step 1: transfer n-1 disk from source to helper

        towerOfHanoi(n-1,source,destination,helper);

        // step 2 : transfer a single disk from source to destination

        System.out.println("Transferring disk "+ n +" from " +source+ " to "+ destination);

        // step 3 : transfer n-1 disks in helper to destination (using source as a helper)

        towerOfHanoi(n-1,helper,source,destination);

    }
}
