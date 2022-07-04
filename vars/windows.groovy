
def call(Closure body){
    node('windows'){
        body()
        echo 'windows body '
    }
}