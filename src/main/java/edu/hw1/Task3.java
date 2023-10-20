package edu.hw1;

class Task3 {

    private Task3() {}

    public static boolean isNestable(int[] list1, int[] list2) {
        if (list1.length == 0) {
            return false;
        }
        if (list2.length == 0) {
            return false;
        }
        int min1 = list1[0];
        int max1 = list1[0];
        int min2 = list2[0];
        int max2 = list2[0];
        for (int num : list1) {
            if (num < min1) {
                min1 = num;
            }
            if (num > max1) {
                max1 = num;
            }
        }
        for (int num : list2) {
            if (num < min2) {
                min2 = num;
            }
            if (num > max2) {
                max2 = num;
            }
        }

        return (min1 > min2) && (max1 < max2);
    }
}
