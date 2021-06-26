let str1 = "Hello, World"
let str2 = 'Hello, World'
let str3 = `Hello, World`

console.log(str1)
console.log(str2)
console.log(str3)

let longString = "This is a very long string which needs \
to wrap across multiple lines because \
otherwise my code is unreadable."
console.log(longString)



console.log('amir'.charAt(0))
console.log('amir'[1])

// comparing strings

let char1 = 'z'
let char2 = 'b'
if (char1 < char2) {
    console.log(char1 + " is less than " + char2)
} else if (char1 > char2) {
    console.log(char1 + " is grather than " + char2)
} else {
    console.log(char1 + " == " + char2)
}


console.log(str1.toUpperCase())
console.log(str3.toLocaleLowerCase())
console.log(str3.length)

