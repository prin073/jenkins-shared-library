
def call(String valueToAdd, List args = []) {
    echo "Before: ${args}"
    def newList = args + [valueToAdd] // Concatenate the valueToAdd to args
    echo "After: ${newList}"
}
