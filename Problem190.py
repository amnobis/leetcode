class Solution:
    # @param n, an integer
    # @return an integer
    def reverseBits(self, n):
        out = "{0:032b}".format(n)
        out = out[::-1]
        return int(out, 2)
