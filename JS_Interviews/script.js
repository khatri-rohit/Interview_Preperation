function sum(a, b) {
    return a + b
};

function square(a, callback) {
    return a * callback(a, a);
}

console.log(square(5, sum));


let arrow = {
    username: "Rohit Khatri",
    name1: () => {
        console.log("My Name is " + this.username); // This points to global object that's why it print's undefined 
    },
    name2() {
        console.log("My Name is " + this.username);
    }
};

arrow.name1()
arrow.name2()