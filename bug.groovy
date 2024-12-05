```groovy
def myMethod(List<String> list) {
  list.each { it ->
    println it
    if (it == "quit") {
      return // This only exits the each loop, not the method
    }
  }
  println "This line is always executed after the loop"
}

myMethod(['a', 'b', 'quit', 'c']) 
```