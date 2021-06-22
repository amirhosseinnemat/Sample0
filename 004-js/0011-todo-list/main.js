// function run after user click the button
function addItem() {
    // read the user input
    var userInput = document.getElementById("input").value;

    // check the value not be free and then do the job
    if (userInput == "") {
        alert("Please Enter something");
    } else {
        // remove task text after add it
        document.getElementById("input").value = "";

        /*
            ----- Remove Tag -----
        1. create p tag and get main from dom.
        2. add p tag to main.
        3. creat span and and creat text node of remove.
        4. add remVal to span and the span to p tag.
        5. create attribute for remove the p.
         */
        var pTag = document.createElement("p");
        var main = document.getElementById("main");
        main.appendChild(pTag);

        var remSpan = document.createElement("span");
        var remVal = document.createTextNode("X");
        remSpan.appendChild(remVal);
        pTag.appendChild(remSpan);
        // style remove tag
        remSpan.style.color = "red";

        var remove = document.createAttribute("onClick");
        remove.value = "this.parentNode.remove();";
        remSpan.setAttributeNode(remove);
        // add title to remove tag
        var remTitle = document.createAttribute("title");
        remTitle.value = "Remove";
        remSpan.setAttributeNode(remTitle);


        /*
            ----- Task Tag -----
        1. transform user input to text node.
        2. create span and add user input to span.
        3. add the span to p tag.
        4. add attribute onClick by addEventListener("click", taskDone);
        for style the task after click it to line-through.
         */

        var inputText = document.createTextNode(userInput);
        var taskTag = document.createElement("span");
        taskTag.appendChild(inputText);
        pTag.appendChild(taskTag);
        // style taskTag
        taskTag.style.color = "Orange";

        taskTag.addEventListener("click", taskDone);

        function taskDone() {
            taskTag.style.textDecoration = "line-through";
            taskTag.style.color = "green";
            // add title to task tag
            var taskAtr = document.createAttribute("title");
            taskAtr.value = "Task Done!";
            taskTag.setAttributeNode(taskAtr);
        }

    }
}