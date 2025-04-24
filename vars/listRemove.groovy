
def call(String valueToRemove, List args = []) {
    echo "Before: ${args}"
    args.remove(valueToRemove)
    echo "After: ${args}"
}
