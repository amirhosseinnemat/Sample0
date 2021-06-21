var profile = {
    name: "Amir",
    family: "Moghadam",
    age: 29,
    player: ["Ali", "Jafar", "Saeed"],
    exam: function (score) {
        if (score >= 10)
            alert("Congrats! you pass the exam.");
        else
            alert("Oops! you failed, you should study harder.");
    }
};

console.log(profile);

profile.name = "Ali";

console.log(profile);

profile.exam(8);