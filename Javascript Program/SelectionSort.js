let arr = [312,21,45,11,854,13,53,2343];

// sort array in descending order using a bubble sort
let n = arr.length;

for(i=1; i<n; i++){
  let temp = arr[i];
  let j = i-1;
  while(j>=0 && arr[j] < temp){
    arr[j+1] = arr[j];
    j--;
  }
  arr[j+1] = temp;
}

console.log(`sorted array decresing order : ${arr}`)