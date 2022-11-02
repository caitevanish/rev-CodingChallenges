/*
Create a function that takes the dimensions of two triangles (as arrays)
and checks if the first triangle fits into the second one.

Examples

doesTriangleFit([1, 1, 1], [1, 1, 1]) ➞ true
doesTriangleFit([1, 1, 1], [2, 2, 2]) ➞ true
doesTriangleFit([1, 2, 3], [1, 2, 2]) ➞ false
doesTriangleFit([1, 2, 4], [1, 2, 6]) ➞ false

Notes

Triangle fits if it has the same or smaller size as the hole.

The function should return false if the triangle with those dimensions is not possible.
 */

console.log(doesTriangleFit([1, 1, 1], [1, 1, 1]));
console.log(doesTriangleFit([1, 1, 1], [2, 2, 2]));
console.log(doesTriangleFit([1, 2, 3], [1, 2, 2]));
console.log(doesTriangleFit([1, 2, 4], [1, 2, 6]));


function doesTriangleFit(triangleA, triangleB) {
  const diff = triangleB[0] - triangleA[0];

  if (diff < 0) {
    return false;
  }

  for (let i = 1; i < 3; i++) {
    if (triangleB[i] - triangleA[i] == diff) {
      continue;
    } else {
      return false;
    }
  }
  return true;
}