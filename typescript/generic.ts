// Generic Function
function func(one) {
    return one
}

console.log(func(1));

const stud: Readonly<{ name: string, surname: string }> = {
    name: "Rohit",
    surname: "Khatri"
}

// stud.name = "Nitin"

let arr = [1, 2, 3] as const

console.log(arr);
// arr.push(4);
console.log(arr);

var nam = "Rohit";
// nam[0] = "K";
console.log(nam[0]);