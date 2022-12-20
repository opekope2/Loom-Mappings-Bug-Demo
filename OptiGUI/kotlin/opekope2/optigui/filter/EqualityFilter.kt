package opekope2.optigui.filter

/**
 * A filter which returns true only for the given value is [expectedValue]
 * @param T The type the filter accepts
 * @param expectedValue The value the filter should return true for
 */
class EqualityFilter<T>(private val expectedValue: T) : Filter<T>() {
    override fun test(value: T) = value == expectedValue
}
