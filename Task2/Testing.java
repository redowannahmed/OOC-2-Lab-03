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

    @Test
    public void test2 ()
    {
        st.push(3);
        st.push (2);
        st.push (5);
        st.push(6);
        st.pop ();

        assertEquals(5, st.max());
    }

    @Test
    public void test3 ()
    {
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(2);

        assertEquals(3, st.max());
    }
}
