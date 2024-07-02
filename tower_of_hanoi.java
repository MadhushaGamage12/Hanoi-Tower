package hanoi_tower;

public class tower_of_hanoi {

public static void main(String[] args) {
			// TODO Auto-generated method stub

			 int number = 3; //numbers of disks
		        towerOfHanoi(number, "source", "destination", "auxiliary");// Call the recursive function to solve 
		}

static void towerOfHanoi(int number, String source, String destination, String auxiliary) {
    // Base case: If there's only one disk, move it from the source rod to the destination rod
	
    if (number == 1) {
        System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
        return; // Exit the function after moving the disk
    }
    // Recursive case:
    // Step 1: Move the top number-1 disks from the source rod to the auxiliary rod
    towerOfHanoi(number - 1, source, auxiliary, destination);
    
    // Step 2: Move the number-th disk from the source rod to the destination rod
    System.out.println("Move disk " + number + " from rod " + source + " to rod " + destination);
    
    // Step 3: Move the number-1 disks from the auxiliary rod to the destination rod
    towerOfHanoi(number - 1, auxiliary, destination, source);
}
}

