function reverseWordsInSentence(sentence) {

    return sentence.split(" ").map(word => word.split("").reverse().join("")).join(" ");
}

let inputSentence = "This is a sunny day";
let reversedSentence = reverseWordsInSentence(inputSentence);
console.log("Reversed sentence:", reversedSentence);
