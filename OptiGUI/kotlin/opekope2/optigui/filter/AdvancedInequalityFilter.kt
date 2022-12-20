package opekope2.optigui.filter

/**
 * A filter which returns false only for the given value is [expectedValue]
 * @param T The type the filter accepts and converts to [U]
 * @param U The type the filter works with
 * @param converter The function to convert any value to the target function. Should return null if not convertible
 * @param expectedValue The value the filter should return false for
 */
class AdvancedInequalityFilter<T, U>(private val converter: (T) -> U?, private val expectedValue: U) : Filter<T>() {
    override fun test(value: T) = converter(value).let { it != null && it == expectedValue }
}
