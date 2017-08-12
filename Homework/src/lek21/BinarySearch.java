package lek21;

import java.util.Collection;

public class BinarySearch {
	public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        int mid = -1;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        int insertionPoint;
        if (key > a[mid]) {
        	insertionPoint = mid + 1;
        } else {
        	insertionPoint = mid;
        }
        return - (insertionPoint + 1);
    }

}
