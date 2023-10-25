let arr = [65,23,90,67,124,643,74,23];

// sort array in descending order using a bubble sort
let n = arr.length;

for(i=0; i<n; i++){
  for(j=0; j<n-1-i; j++){
    if(arr[i] > arr[j]){
      // swapping of the varible 
      let temp= arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
  }
}

console.log(`sorted array decresing order : ${arr}`)