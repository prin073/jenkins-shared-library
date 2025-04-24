
def call(List args = [], String valueToRemove) {
    args.remove(valueToRemove)
    args.each { arg ->
        println("${arg}")  // Use double quotes forLoop GString
    }
}
