package opekope2.optigui.filter

/**
 * Base class for all filters
 * @param T The type the filter accepts
 */
abstract class Filter<T> {
    /**
     * Evaluates the filter with the given value
     * @param value The value the filter should evaluate
     */
    abstract fun test(value: T): Boolean
}
