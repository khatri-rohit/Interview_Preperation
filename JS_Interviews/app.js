// var vs let vs const

// function test() {
//     var a = "hi";

//     // Variable Shadow
//     // can't shadow a let variable with var it is inlegal shadowing
//     {
//         let a = "hello";
//         console.log(a);
//     }
//     if (true) {
//         console.log(a);
//     }
// }

// test()

// // Hoisting
// console.log(count);
// var count = 5;
// var count2 = 5;

// // Map, Reducer and Filter;
// const nums = [1, 2, 3, 4];
// console.log(nums);
// const multiplyThree = nums.map((num, i, arr) => {
//     return num * i;
// });
// console.log(multiplyThree);

// const moreThanTow = nums.filter((num, i, arr) => {
//     return num > 2;
// })
// console.log(moreThanTow);

// const reduces = nums.reduce((acc, cur, i, arr) => {
//     return acc + cur
// }, 0)
// console.log(reduces);

// Create Polyfills

// Array.prototype.myMap = function (cb) {
//     let tmp = [];
//     for (let i = 0; i < this.length; i++) {
//         tmp.push(cb(this[i], i, this))
//     };

//     return tmp;
// }

// const nums = [1, 2, 3, 4];
// console.log(nums);
// const multiplyThree = nums.myMap((num, i, arr) => {
//     return num * i;
// });
// console.log(multiplyThree);

// Array.prototype.myFilter = function (cb) {
//     let tmp = [];
//     for (let i = 0; i < this.length; i++) {
//         if (cb(this[i], i, this)) tmp.push(this[i])
//     };
//     return tmp;
// }

// const moreThanTow = nums.myFilter((num, i, arr) => {
//     return num > 2;
// });
// console.log(moreThanTow);

// Array.prototype.myReduce = function (cb, inValue) {
//     var acc = inValue;
//     for (let i = 0; i < this.length; i++) {
//         acc = acc ? cb(acc, this[i], i, this) : this[i];
//     }
//     return acc;
// }

// const reduces = nums.myReduce((acc, cur, i, arr) => {
//     return acc + cur
// }, 0)
// console.log(reduces);

// const nums = [1, 2, 3, 4];
// const for_ = nums.forEach((num, i, arr) => {
//     return num + 1;
// })
// const map_ = nums.map((num, i, arr) => {
//     return num + 1;
// })

// console.log(map_);
// console.log(for_);

// let students = [
//     { name: "Piyush", rollNumber: 31, marks: 80 },
//     { name: "Jenny", rollNumber: 15, marks: 55 },
//     { name: "Kaushal", rollNumber: 16, marks: 61 },
//     { name: "Dilpreet", rollNumber: 7, marks: 69 },
// ]

// let names = students.map((student) => student.name.toUpperCase())
// console.log(names);

// const marks = students.filter((student) => student.marks > 60)
// console.log(marks);

// const details = students.filter((student) => student.marks > 60 && student.rollNumber > 15)
// console.log(details);

// const sums = students.reduce((acc, curr, i, arr) => acc + curr.marks, 0)
// console.log(sums);

// names = students.filter((student) => student.marks > 60).map((student) => student.name)
// console.log(names);

// // Function
// first class fn

// function square(num) {
//     return num * num
// }

// function displaySq(fn) {
//     console.log("Square is " + fn(5));
// }

// displaySq(square)


// callback function
// function fetchData(callback) {
//     setTimeout(() => {
//         console.log("Data fetched");
//         callback(); // calling the callback function
//     }, 1000);
// }

// fetchData(() => console.log("Callback executed after data fetch."));

// IIFE
// (function () {
//     console.log("IIFE");
// })()

// for (var i = 0; i < 5; i++) {
//     (function (j) {
//         setTimeout(function () {
//             console.log(j);
//         }, j * 1000);
//     })(i);
// }

// // Closures
// function makeFn() {
//     var name = "Rohit Khatri"
//     function displayName(surname) {
//         console.log(surname + " " + name);
//     }
//     return displayName;
// }
// var myFn = makeFn();
// myFn("Sir")
// makeFn()("mr.")

// function createBase(num) {
//     return (x) => {
//         return x + num;
//     }
// }

// console.time("6")
// var addSix = createBase(6);
// console.log(addSix(10));
// console.log(addSix(21));
// console.timeEnd("6")

// console.time("12")
// var addSix1 = createBase(10);
// console.log(addSix1(10));
// console.log(addSix1(21));
// console.timeEnd("12")

// // Curying
// fn(a,b) fn(a)(b)

// function fn(a) {
//     return function (b) {
//         return function (c) {
//             return a + b + c;
//             // return `${a} ${b} ${c}`;
//         }
//     }
// }

// console.log(fn(5)(5)(4));

// sum
// function sum(a) {
//     return function (b) {
//         if (b) return sum(a + b);
//         return a;
//     }
// }

// console.log(sum(10)(10)(5)());

// sum(1)(3)();

// const a = {}
// const b = { key: "name" }
// const c = { key: "surname" }

// a[b] = 123
// a[c] = 456

// console.log(a[b])
// console.log(typeof c)

// const obj = {
//     name: "Rohit",
//     age: 20
// }

// console.log(JSON.stringify(obj))

// // Q.13
// let person = { name: "Rohit" }
// const members = [person]
// person.name = null;

// console.log(members)

// const value = { number: 10 }

// const multipy = (x = { ...value }) => {
//     console.log((x.number *= 2))
// }

// multipy()
// multipy()
// multipy(value)
// multipy(value)

// function chnageRef(person) {
//     person.age = 25;
//     person = {
//         name: "Rohit",
//         age: 20
//     };
//     return person;
// }

// const personObj1 = {
//     name: "Alex",
//     age: 30
// }

// const personObj2 = chnageRef(personObj1);

// console.log(personObj1)
// console.log(personObj2)

// let user = {
//     name: "Rohit",
//     age: 20
// }
// // Pass without refercence
// // const objClone = Object.assign({}, user)
// // const objClone = { ...user }
// // const objClone = JSON.parse(JSON.stringify(user))
// objClone.name = "Nitin"

// console.log(user, "\n", objClone)

// // this keyword
// this.a = "Rohit"
// function getParam() {
//     console.log(this.a)
// }
// getParam()

// let user = {
//     name: "Piyush",
//     age: 20,
//     // childObj: {
//     //     newName: "Khatri",
//     //     getDetails() {
//     //         console.log(this.newName)
//     //         console.log(this.name)
//     //     }
//     // }
//     // getDetails: () => {
//     //     console.log(this.age) // arrow function always points to global object like window
//     // }
//     getDetails() {
//         const arrow = () => console.log(this.name)
//         arrow()
//     }
// }

// user.childObj.getDetails()
// user.getDetails()

// class user {
//     constructor(name) {
//         this.name = name
//         console.log(this)
//     }
// }

// const User = new user("Rohit");

// function makeUser() {
//     return {
//         age: 20,
//         ref() {
//             return this;
//         }
//     }
// }

// let user = makeUser();
// console.log(user.ref().age)

// var name = "Nitin"
// const user = {
//     name: "Rohit",
//     logMessage() {
//         console.log(this.name)
//     }
// }

// user.logMessage()
// setTimeout(user.logMessage, 1000)

// var obj = { name: "Rohit" };
// function sayhello(age) {
//     console.log("Hello " + this.name + " age is " + age)
// }

// sayhello.call(obj, 20)
// sayhello.apply(obj, [20])

// sayhello.bind(obj, 20) // return another function
// const bindFn = sayhello.bind(obj)
// bindFn(20)

// //  CallBack Hell
function importAction(username) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve("Hello " + username)
        }, 1000);
    })
}

function likeVideo(video) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve("Like " + video)
        }, 1000);
    })
}

function shareVideo(share) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve("Share " + share)
        }, 1000);
    })
}

importAction("Rohit Khatri")
    .then((res) => {
        console.log(res)
        likeVideo("Javascript Question").then((res) => {
            console.log(res)
            shareVideo("Share Javascript Question").then((res) => {
                console.log(res)
            })
        })
    })
    .catch((err) => {
        console.error(err)
    })

// importAction("Rohit", (name) => {
//     console.log(name)
//     likeVideo("Like Video", (like) => {
//         console.log(like)
//         shareVideo("Share Video", (share) => {
//             console.log(share)
//             shareVideo("Share Video", (share) => {
//                 console.log(share)
//                 shareVideo("Share Video", (share) => {
//                     console.log(share)
//                     shareVideo("Share Video", (share) => {
//                         console.log(share)
//                         shareVideo("Share Video", (share) => {
//                             console.log(share)
//                         })
//                     })
//                 })
//             })
//         })
//     })
// })



// // Promise
// const myPromise = new Promise((resolve, reject) => {
//     const success = true;
//     if (success)
//         resolve("Success")
//     else reject("Failed")
// })

// myPromise
//     .then((res) => console.log(res))
//     .catch((err) => console.error(err))