//remember that @NonCPS methods can't use Groovy methods that are restricted by the sandbox, such as add().
// This leads to the same sandbox error.
//won't work

@NonCPS
def call(String valueToAdd, List args = []) {
//    def newList = args
    echo "Before: ${args}"
    args.add(valueToAdd) //1. using method
    echo "After: ${args}"

}

/*
def call(String valueToAdd, List args = []) {
    echo "Before: ${args}"
    def newList = args + [valueToAdd] // Concatenate the valueToAdd to args
    echo "after: ${newList}"
}
*/
