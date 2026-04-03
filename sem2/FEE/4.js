// in js methord two str convert a [] in js to make a string
const cars = ["sa", "sd", "sds"];
console.log(cars);
// document.getElementById("cars").innerHTML = toString(cars);
let car_str = cars.toString();
console.log(car_str);

// arrays are special type of object in js
// the typeof operator in js return object for arrays
console.log(typeof cars);
// but js arrays are best described as arrays
// arrays use numbers to access its "elements"
const person1 = ["ram", "chd", "46"];
console.log(person1[0]);

// object uses names to access its "members"
const person = {firstName: "John", lastName: "Doe", age: 50, eyeColor: "blue"};
console.log(person.firstName);
// in this eg person.firstName is a property of the person object

// arrary elements can be object
// js varables can be object but array are the special type of object beacuse of this you can have varables of diff type in same array
// you can have object in an array or you can have function in an array or you can have a array in an array
const myArray = [person, "hello", 46, true, {name: "John", age: 30}];
// you can have function in an array
const array_of_function = [
  function () {
    return "hello";
  },
  function () {
    return "world";
  },
];

// array prop and methord
// the real strength of js arrays is the built in array properties and methord
// the length property is useful for knowing the no of elements in an array
console.log(myArray.length);
// the push() method adds a new element to the end of an array
myArray.push("new element");
console.log(myArray);
// the pop() method removes the last element from an array
myArray.pop();
console.log(myArray);
// the shift() method removes the first element from an array
myArray.shift();
console.log(myArray);

// to access the last without using the length property you can use the -1 index
console.log(myArray[-1]);
// the unshift() method adds a new element to the beginning of an array
myArray.unshift("new element");
console.log(myArray);
// the splice() method adds/removes elements from an array
myArray.splice(0, 1, "new element");
console.log(myArray);
// the slice() method returns a shallow copy of a portion of an array
const newArray = myArray.slice(0, 2);
console.log(newArray);
