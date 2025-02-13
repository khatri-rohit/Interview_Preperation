console.log("Rohit");
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
        const rand = Math.floor(Math.random() * 10);
        if (rand > 5) {
            res(`Success ${rand}`);
        } else {
            rej(`Failed ${rand}`);
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

a = 5;
console.log(a);
let a = 10;