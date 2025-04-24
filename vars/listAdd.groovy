
def call(List args = [], String valueToAdd) {
    args.add(valueToAdd)
    args.each { arg ->
        println("${arg}")  // Use double quotes forLoop GString
    }
}
