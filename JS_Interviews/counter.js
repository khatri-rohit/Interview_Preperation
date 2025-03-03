// Closure
function makeCounter(inValue = 0) {
    let val = inValue;  // Changed to let and moved inside function
    return () => {
        return val++;
    }
};

const counterA = makeCounter()
const counterB = makeCounter()

// console.log(counterA());
// console.log(counterB());
// console.log(counterB());
// console.log(counterA());


const array1 = [1, 2, 3, 4];
// 0 + 1 + 2 + 3 + 4
const initialValue = 0;
const sumWithInitial = array1.reduce(
    (accumulator, currentValue) => accumulator + currentValue,
    initialValue,
);
console.log(sumWithInitial);
// Expected output: 10


// Function.prototype.myCall = function (thisArg, ...argArray) {
//     const context = thisArg || window;
//     const uniqueID = Symbol();
//     context[uniqueID] = this;
//     const result = context[uniqueID](...argArray);
//     delete context[uniqueID];
//     return result;
// };
Function.prototype.myCall = function (thisArg, ...args) {
    console.log(thisArg, args);
    return this.bind(thisArg)(...args);
};
const person = {
    name: "Rohit"
};
console.log(Function.prototype.myCall(person, 'Hello', 'how are you?'))