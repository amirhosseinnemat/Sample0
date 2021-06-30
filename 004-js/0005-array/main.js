var arr1 = ["ali", "farahani", 25];

/* --- array method ---

// add to last
arr1.push("amir");

// add to first
arr1.unshift("mohsen");

// delete from last
arr1.pop();

// delete from first
arr1.shift();

// show index
var wordIndex = arr1.indexOf("farahani");
console.log(wordIndex);

 */

console.log(arr1);

let shopList = ['soda', 'bread', 'fruit', 'sugar']

let res = `your first item is : ${shopList[0]}\nyour last item is : ${shopList[shopList.length - 1]}`

console.log('list : ' + shopList)
console.log(res)


// array method : splice()

let languages = ['java', 'javaScript', 'scala', 'python']
console.log(languages)

languages.splice(2, 2, 'golang', 'julia', 'c++')
console.log(languages)