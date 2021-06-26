/*

let square = function (n) {
    return n * n;
}

*/

// arrow function

/*
let square = (n) => {
    return n * n
}
*/

// let square = (n) => n * n

let square = n => n * n
console.log(square(3))

function userInfo(name = 'Ali', id = 100) {
    console.log(`name : ${name}
id : ${id}`)
}

userInfo()
userInfo('amir', 2566)