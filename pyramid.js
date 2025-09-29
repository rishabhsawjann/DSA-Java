function pyramid(ch, rows, inverted) {
    let result = "\n"; // start with newline for test cases
  
    if (!inverted) {
      // Normal pyramid
      for (let i = 0; i < rows; i++) {
        // spaces first
        for (let j = 0; j < rows - i - 1; j++) {
          result += " ";
        }
        // characters
        for (let k = 0; k < 2 * i + 1; k++) {
          result += ch;
        }
        result += "\n"; // move to next row
      }
    } else {
      // Inverted pyramid
      for (let i = rows - 1; i >= 0; i--) {
        // spaces first
        for (let j = 0; j < rows - i - 1; j++) {
          result += " ";
        }
        // characters
        for (let k = 0; k < 2 * i + 1; k++) {
          result += ch;
        }
        result += "\n"; // move to next row
      }
    }
  
    return result;
  }
  
  // ✅ Test
  console.log(pyramid("o", 4, false));
  console.log(pyramid("p", 5, true));
  