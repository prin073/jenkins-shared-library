
def call(String valueToRemove, List args = []) {
    args.remove(valueToRemove)
    args.each { arg ->
        println("${arg}")  // Use double quotes forLoop GString
    }
}
