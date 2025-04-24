
def call(String valueToAdd, List args = []) {

//    def newList = items.collect() // copy list to avoid mutation
     args >> "${valueToAdd}" // 2. using operator
    echo "newList: ${args}"
}
