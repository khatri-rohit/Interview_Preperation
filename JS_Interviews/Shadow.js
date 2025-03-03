// 
foo();
function foo() {
    console.log("Foo Func");
}
var foo = function () {
    console.log("Foo Var");
}
foo();

// Hoisting

console.log(a);

var a = 10;
function multiplfy(x) {
    return x * 10;
}

let b = multiplfy(a);
// console.log(b);


const nums = [0, 2, 3, 4];

const arr1 = nums.map((val, i, arr) => { // Return all array places if we don't return any thing it will return array of undefined
    // console.log(arr[i] + "-> " + val);
    return val > 2;
});

const arr2 = nums.filter((val, i, arr) => { // Only return value if we set some condition other wise empty
    // console.log(arr[i] + "-> " + val);
    // return val > 2;
})

const arr3 = nums.reduce((acc, curr, i, arr) => {
    console.log(acc);
    return acc + 1
}, 1)

console.log(arr1);
console.log(arr2);
console.log(arr3);