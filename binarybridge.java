//binary bridge can be converted to binary string
//should minimize # of jumps resulted from binary string
//can only jump at most n times
//f either b or c is violated, heart will stop
//jump(i, j) = decimal(bridge.substring(i, j))
//101001010 --> 10100 --> 1010
//bridge        20        10   = 30, which is > n
