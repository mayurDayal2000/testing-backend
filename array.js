const arr = [1, 2, 3, 4, 5];

function addItemToEnd(newItem, arr) {
  return [...arr, newItem];
}

function addItemToStart(newItem, arr) {
  return [newItem, ...arr];
}

addItemToEnd(20, arr);
addItemToStart(100, arr);
