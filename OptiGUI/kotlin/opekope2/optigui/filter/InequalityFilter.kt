package opekope2.optigui.filter

/**
 * A filter which returns false only for the given value is [expectedValue].
 * Can be used when dealing with nullables
 * @param T The type the filter accepts
 * @param expectedValue The value the filter should return false for
 */
class InequalityFilter<T>(private val expectedValue: T) : Filter<T>() {
    override fun test(value: T) = value != expectedValue
}
