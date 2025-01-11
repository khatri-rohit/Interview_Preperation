function sum(a, b) {
    return a + b
};

function square(a, callback) {
    return a * callback(a, a);
}

// console.log(square(5, sum));


// let arrow = {
//     username: "Rohit Khatri",
//     name1: () => {
//         console.log("My Name is " + this.username); // This points to global object (var) that's why it print's undefined 
//     },
//     name2() {
//         console.log("My Name is " + this.username);
//     }
// };

// arrow.name1();
// arrow.name2();

var name = "Rohit";

let Goblin = {
    name: "Rohit khatri",
    // constructor(name) {
    //     this.name = name;
    // }
    goblin() {
        console.log(this.name);
    },
    goblin1: () => {
        console.log(this.name);
    }
};

// let coc = new Goblin();
Goblin.goblin();
Goblin.goblin1();