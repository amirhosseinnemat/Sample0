let checkValiPassword = function (password) {
    if (password.length > 8 && !password.includes("12345")) {
        return true
    } else {
        return false
    }
}

console.log(checkValiPassword("amir123456"))
console.log(checkValiPassword("ahmad23"))
console.log(checkValiPassword("aaaabbbbb1458"))