function star() {

    var i,j,userInput;
    userInput = document.getElementById("input").value;
    for (i = 1; i <= userInput; i++) {

        for (j = 1; j <= i; j++) {
            document.write("*");
        }

        document.write("<br>");
    }
}