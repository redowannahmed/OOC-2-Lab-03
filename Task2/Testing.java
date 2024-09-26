package Task2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Testing {
    MaxStack st = new MaxStack();

    @Test
    public void test1 ()
    {   st.push(3);
        st.push(2);
        st.push(5);
        st.push(6);
        assertEquals(6, st.max());
    }
}
