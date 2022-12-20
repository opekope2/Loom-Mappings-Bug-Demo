package opekope2.optigui.filter

/**
 * A filter which applies the logical AND between the given filters and returns the result
 * @param T The type the filter accepts
 * @param filters The sub-filters to evaluate
 */
class ConjunctiveFilter<T>(private val filters: Iterable<Filter<T>>) : Filter<T>() {
    override fun test(value: T) = filters.all { it.test(value) }
}
