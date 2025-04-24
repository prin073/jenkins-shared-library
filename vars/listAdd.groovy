
def call(String valueToAdd, List args = []) {
//    def newList = args
    echo "Before: ${args}"
    args.add(valueToAdd) //1. using method
    echo "After: ${args}"

}
