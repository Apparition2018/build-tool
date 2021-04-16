// Groovy 高效特性
// 1 可选的类型定义
def version = 1

// 2 assert
assert version == 1

// 3 括号是可选的
println version

// 4 字符串
def s1 = 'ljh'
def s2 = "gradle version is ${version}"
def s3 = '''my
name
is
ljh'''
println s1
println s2
println s3

// 5 集合 API
// list
def buildTools = ['ant', 'maven']
buildTools << 'gradle'
assert buildTools.getClass() == ArrayList
assert buildTools.size() == 3
// map
def buildYears = ['ant': 2000, 'maven': 2004]
buildYears.gradle = 2009
println buildYears.ant
println buildYears['gradle']

// 6 闭包
def c1 = {
    v -> print v
}
def c2 = {
    print 'hello'
}

static def m1(Closure closure) {
    closure'param'
}

static def m2(Closure closure) {
    closure()
}
m1(c1)
m2(c2)