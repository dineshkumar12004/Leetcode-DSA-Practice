class BoatstoSavePeople {
    public static void main(String[] args) {
        int[] people = { 3, 2, 2, 1 };
        int limit = 3;
        int result = numRescueBoats(people, limit);
        System.out.println(result);
    }

    public static int numRescueBoats(int[] people, int limit) {

        int[] count = new int[limit + 1];
        for (int p : people) {
            count[p]++;
        }

        int index = 0;
        for (int val = 1; val <= limit; val++) {
            while (count[val]-- > 0) {
                people[index++] = val;
            }
        }

        int left = 0, right = people.length - 1;
        int boats = 0;
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
                right--;
            } else {
                right--;
            }
            boats++;
        }
        return boats;
    }
}