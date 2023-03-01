def grayToDecimal(n):
    binary = int(n, 2)
    decimal = binary ^ (binary >> 1)
    return decimal

print(grayToDecimal("1010")) # Output: 5
