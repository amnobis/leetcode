class Problem202:
    # @param {integer} n
    # @return {boolean}
    def isHappy(self, n):
        cache = set()
        return self.isHappyR(n, cache)
    
    def isHappyR(self, n, cache):
        if n == 1:
            return True         
        elif n in cache:
            return False
        
        snd = 0
        cache.add(n)
        for val in str(n):
            snd += int(val) ** 2
        return self.isHappyR(snd, cache)
