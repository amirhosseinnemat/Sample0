// function sum(num1, num2) {
//     return num1 + num2;
// }
//
// var result = sum(25, 6);
// console.log(result);

/*

function sum(num1, num2) {
    document.write("sum of " + num1 + " and " + num2 + " is : " + (num1+num2));
}

sum(10,12);

 */

function send() {
    var income, outgo;
    income = document.getElementById("income").value;
    outgo = document.getElementById("outgo").value;

    if (Number(income) > Number(outgo))
        console.log("income > outgo");
    else if (Number(income) < Number(outgo))
        console.log("income < outgo");
    else
        console.log("income = outgo");
}