package algorithm.day_1;

public class FirstBadVersion {
    static int lastVersion;
    static int badVersion;

    public int firstBadVersion(int n) {
        long first = 1;
        long last = n;
        int bad = 0;

        while (first <= last) {
            long pointer = (last + first) / 2;
            if (isBadVersion((int) pointer)) {
                last = pointer - 1;
                bad = (int) pointer;
            } else {
                first = pointer + 1;
            }
        }
        return bad;
    }

    static boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}
