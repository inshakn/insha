import com.cloudbees.groovy.cps.NonCPS
@NonCPS
def hey()
{
     def s = "hello, this is second file"
     //println("Hello, this is second file")
     return s;
}

//hey()
