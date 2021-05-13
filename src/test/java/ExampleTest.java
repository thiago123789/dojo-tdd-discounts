import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ExampleTest {

    @Test
    public void example() {
        assertThat(true, is(true));
    }
}
