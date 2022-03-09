import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {

    @org.junit.jupiter.api.Test
    void homework01() {

    }
    @org.junit.jupiter.api.Test
    void homework02() {
        int[] array = {1,2,3,4};
        int[] array2 = {154,155,156,157};
        assertArrayEquals(array,array2);
        assertAll();
    }
}