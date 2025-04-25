
def call(Map name) {

    String firstName = name.firstName
    String lastName = name.lastName

    sh "echo My name is ${firstName} ${lastName}"
}
