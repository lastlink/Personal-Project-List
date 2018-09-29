var stringify = require("csv-stringify");
var fs = require("fs");

// need to generate csv with list counts to use in katalon tests
// maybe eventually also display text and check for each list item
var List = require("../config/data/list.json");
console.log("Length:");
console.log(List.home_list.list.length);

let lengthcolumns = [
  "home_length",
  "game_length",
  "live_length",
  "github_length"
];

var data = [];
var row = [
  List.home_list.list.length,
  List.game_list.list.length,
  List.live_list.list.length,
  List.github_list.list.length
];

data.push(row);
console.log(data);

stringify(data, { header: true, columns: lengthcolumns }, (err, output) => {
  if (err) throw err;
  fs.writeFile("./config/data/listLengths.csv", output, err => {
    if (err) throw err;
    console.log("listLengths.csv saved in config/data.");
  });
});
