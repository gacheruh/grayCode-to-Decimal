function grayToDecimal(n) {
    let binary = parseInt(n, 2);
    let decimal = binary ^ (binary >> 1);
    return decimal;
  }
  
  console.log(grayToDecimal("1010")); // Output: 5
  