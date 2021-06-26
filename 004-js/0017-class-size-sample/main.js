let class1 = {
    name: 'math',
    studentLimit: 5,
    studentCount: 0,
    studentName: [],
    checkAvailability: function () {
        let count = this.studentName.length;
        let leftCount = this.studentLimit - this.studentCount
        return count <= leftCount
    }
}



class1.studentName = ['ali', 'mohsen', 'saman', 'ahmad', 'sohrab', 'amir']
// class1.studentName.pop()

let status = class1.checkAvailability()
console.log(status)