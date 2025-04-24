
def call(List args = [], String valueToAdd) {
     args >> "${valueToAdd}" // 2. using operator

    args.each { arg ->
        println("${arg}")  // Use double quotes forLoop GString
    }
}
