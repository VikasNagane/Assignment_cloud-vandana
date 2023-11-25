
function sortArrayDescendingStrings(arr) {
let arrCopy = [...arr];
    

    return arrCopy.sort((a, b) => b.localeCompare(a));
}


let strings = ["apple", "banana", "orange", "grape"];
let sortedDescendingStrings = sortArrayDescendingStrings(strings);

console.log("Original array:", strings);
console.log("Sorted in descending order:", sortedDescendingStrings);
