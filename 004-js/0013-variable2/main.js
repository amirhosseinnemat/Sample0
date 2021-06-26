// we use this in older version
//var firstName = 'Amir';

// new way to declare variable

let firstName = 'Amir'
let lastName = 'Azimi'
let fullName = firstName + ' ' + lastName

console.log(fullName)

let num1 = 20
let num2 = 22

console.log(fullName + (num1 + num2))


/* ------- Scope -------  */

if (true) {
    let number1 = 20
    if (true) {
        let number1 = 40
        var number2 = 60
        console.log(number1)
    }
}

// var is visible out of the scope 
// console.log(number1)
console.log(number2)

