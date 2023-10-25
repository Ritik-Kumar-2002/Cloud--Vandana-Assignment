let str = "This is a text message used for testing."

let revstr = "";
let n = str.length;
for(i=0; i<n; i++){
    // console.log("loop is running ");
    let word = "";
    j=i;
    
    while(j<n && str[j] != ' ') {
        word += str[j];
        j++;
    }
    i=j;
    word = [...word].reverse().join("");
    revstr += word;
    
    if(i<n) revstr += ' ';
    word = "";
}
console.log(`reverse string:  ${revstr}`);