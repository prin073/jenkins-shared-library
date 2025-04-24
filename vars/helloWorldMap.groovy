def call(Map args = [:]) {
    sh "echo Hello World! My name is ${args.name} and today is ${args.weekOfDay}"
}
