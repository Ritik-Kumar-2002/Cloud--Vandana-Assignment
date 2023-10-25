
let previousOutput = document.getElementById("prev-output");
let inputText = document.getElementById("text-field");

var input = "";

const getBtnDetail = (arg) =>{
    console.log(`arg is ${arg}`);
   
    
    // console.log("len  is ", previousOutput.length);
    if(previousOutput.innerHTML.length > 0) {
        previousOutput.innerHTML = "";
        input="";
        inputText.value = input;
        // console.log("running ");
    }
    input = input + arg;
    console.log(`input is ${input}`)
    inputText.value = input;
}

const Evaluate = () =>{
    let output = eval(input);
    console.log(output);
    previousOutput.innerHTML = input;
    inputText.value = output;
    console.log("len is ", previousOutput.innerHTML.length);

}

const RevertBack = () =>{
    input = input.substring(0, input.length-1);
    console.log('new string is ',input);
    inputText.value = input;
    previousOutput.innerHTML= "";
}