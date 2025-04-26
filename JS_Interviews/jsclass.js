// console.log("Rohit");
let x = null;
console.log(x);

let person = {
    name: "Rohit Khatri",
    person: "Male"
}
// let person = ["Rohit Khatri", "BCA"]

// for (let key of person) {
//     console.log(key);
// }

for (let key in person) {
    console.log(person[key]);
}

Object.values(person).forEach((value) => {
    console.log(value);
});

const promise = new Promise((res, rej) => {
    setTimeout(() => {
        const r = Math.floor(Math.random() * 10);
        if (r > 5) {
            res(`Success ${r}`);
        } else {
            rej(`Failed ${r}`);
        }
    }, 1000);
});

promise.then((res) => {
    console.log(res);
}).catch((err) => {
    console.log(err);
})


class Car {
    static wheels = 4;
    constructor(model, year) {
        this.model = model
        this.year = year
    }

    start() {
        console.log("Start " + this.model);
    }
}

const BMW = new Car("BMW", 2025)
console.log(Car.wheels);
console.log(BMW);

a;
console.log(a);
var a = 10;
let a = 100;
{
    let b = 5;
    console.log("Rohit ", b);
}
console.log(b);

// function rohit() {
// }
// rohit()