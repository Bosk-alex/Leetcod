package Algorithm.Day1;

public class FirstBadVersion {
    static final int LAST_VERSION = 2126753390;
    static final int BAD_VERSION = 1702766710;

    public static void main(String[] args) {
        System.out.println(firstBadVersion(LAST_VERSION));
    }

    public static int firstBadVersion(int n) {
        long first = 1;
        long last = n;
        int bad = 0;

        while (first <= last) {
            long pointer = (last + first) / 2;
            System.out.println(pointer);
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
        return version >= BAD_VERSION;
    }
}
