package algorithm.day_1;

import org.junit.jupiter.api.Test;

import static algorithm.day_1.FirstBadVersion.*;
import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {

    @Test
    void firstBadVersionTest() {
        lastVersion = 2126753390;
        badVersion = 1702766710;

        assertEquals(badVersion, new FirstBadVersion().firstBadVersion(lastVersion));
    }
}