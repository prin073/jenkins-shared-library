
def call(String valueToAdd, List args = []) {

     echo "Before: ${args}"
     args << "${valueToAdd}" // 2. using operator
     echo "After: ${args}"
}
