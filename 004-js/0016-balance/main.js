let userAcount = {
    name: "mohsen",
    id: 74562,
    income: 0,
    outgo: 0
}

let addIncome = (user, amount) => { user.income = amount + user.income }

let addOutgo = function (user, amount) {
    user.outgo = amount + user.outgo
}

function balance(user) {
    return user.income - user.outgo
}

addIncome(userAcount, 3000)
addOutgo(userAcount, 350)

console.log(balance(userAcount))

