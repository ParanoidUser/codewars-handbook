import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SolutionTest {
    @ParameterizedTest
    @ValueSource(strings = {
        "fjd3IR9",
        "4fdg5Fj3",
        "djI38D55",
        "123abcABC",
        "ABC123abc",
        "Password123"
    })
    void valid(String password) {
        assertTrue(password.matches(PasswordRegex.REGEX));
    }

    @ParameterizedTest
    @ValueSource(strings = {
        "ghdfj32",
        "DSJKHD23",
        "dsF43",
        "DHSJdhjsU",
        "fjd3IR9.;",
        "fjd3  IR9",
        "djI3_8D55",
        "@@",
        "JHD5FJ53",
        "!fdjn345",
        "jfkdfj3j",
        "123",
        "abc",
        ""
    })
    void invalid(String password) {
        assertFalse(password.matches(PasswordRegex.REGEX));
    }
}