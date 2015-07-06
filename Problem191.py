class Problem191:
    # @param n, an integer
    # @return an integer
    def hammingWeight(self, n):
        out = 0
        while n > 0:
            out += (n & 1)
            n >>= 1
        return out