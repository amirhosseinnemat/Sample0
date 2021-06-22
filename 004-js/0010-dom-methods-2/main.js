function f() {
    var main;
    main = document.getElementById("main");

    main.getElementsByTagName("p")[0].style.color = "red";
    main.getElementsByTagName("p")[1].style.fontSize = "2rem";
    main.getElementsByTagName("p")[1].style.fontFamily = "monospace";
    main.getElementsByTagName("a")[0].setAttribute("href","https://www.apple.com");
    main.getElementsByTagName("button")[0].style.color = "green";

    var pTag, text;

    pTag = document.createElement("p");
    text = document.createTextNode("I'm added to main.");

    pTag.appendChild(text);
    main.appendChild(pTag);
}