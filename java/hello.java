public class hello {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Indices: " + i + ", " + j);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("No two numbers add up to the target.");
        }
    }
}
