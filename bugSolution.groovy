```groovy
def myMethod(List<String> list) {
  for (String it : list) {
    println it
    if (it == "quit") {
      break // This breaks out of the loop and the method continues below
    }
  }
  println "This line may or may not be executed"
}

myMethod(['a', 'b', 'quit', 'c'])


def myMethod2(List<String> list) {
  if(list.contains("quit")) {
    println "Quit found"
    return
  }
  list.each {println it}
}

myMethod2(['a', 'b', 'quit', 'c']) 
```