function change() {
    document.getElementsByTagName("p")[3].innerHTML = "New Content";
}

var valA, valB, valC;

valA = document.getElementById("first").innerHTML;
console.log(valA);
document.getElementById("first").innerHTML = "Hello world";

valB = document.getElementsByClassName("class1");
console.log(valB[1]);

valC = document.getElementsByTagName("p");
console.log(valC);


